library(dplyr)
library(ggplot2)
library(greekLetters)
library(Cairo)

source('data_analysis/r-scripts/inputdata.r')

lcov <- getLineCoverageDF()

lcov$tool[lcov$tool %in% "evosuite-callee5"] <- "EvoE"
lcov$tool[lcov$tool %in% "evosuite-caller5"] <- "EvoR"
lcov$tool[lcov$tool %in% "randoop-callee5"] <- "RanE"
lcov$tool[lcov$tool %in% "randoop-caller5"] <- "RanR"
lcov$tool[lcov$tool %in% "cling"] <- "Cling"

lcov$line_coverage_perc <- lcov$covered_lines/lcov$total_lines

testdf <- lcov %>%
  group_by(tool) %>%
  summarise(count = n(), avg = mean(line_coverage_perc))
cat("Average line coverage of the callees")
show(testdf)

# Plot line coverage

lcov$project_f = factor(lcov$project, levels=c('closure','mockito','time','lang','math'))
p <- 	ggplot(lcov, aes(x=factor(tool,levels = c("EvoE","EvoR", "RanE","RanR","Cling")), y=line_coverage_perc, fill=factor(tool))) + 
  geom_boxplot() +
  xlab("") + 
  ylab("line coverage") + 
  guides(fill=FALSE) +
  facet_grid(. ~ project_f, margins = TRUE) + theme(axis.text.x = element_text(angle = 90)) +
  stat_summary(fun.y=mean, geom="point", shape=23, size=2, fill = 'white')  +
  scale_fill_grey(start = 0.5, end = 1.0)
  #scale_fill_brewer(palette = "Greys")
ggsave(plot = p, filename = 'data_analysis/figures/line-coverage.pdf', width=160, height=95, units = "mm" )

all_lines <- getLineStatusesDF()

df2 <- all_lines %>%
  filter(covered == "True") %>%
  group_by(tool,project,caller_class,callee_class,line_number) %>%
  summarise(number_of_coverage = n()) %>%
  mutate(covered_in_majority = ifelse(number_of_coverage >= 10,"True","False"))

C_lines <- df2 %>%
  filter(tool == "cling")

RanE_lines <- df2 %>%
  filter(tool == "randoop-callee5")

RanR_lines <- df2 %>%
  filter( tool == "randoop-caller5")

lines_stats_C_Ran <- C_lines %>%
  left_join(RanE_lines, by=c('project', 'caller_class', 'callee_class','line_number'), copy=FALSE, suffix = c('.C', '.RanE')) %>%
  filter(tool.C == "cling" & tool.RanE == "randoop-callee5") 

show(lines_stats_C_Ran)

# Plot combined line coverage 

combined_lcov <- all_lines %>%
  mutate(covered = covered == 'True') %>%
  group_by(tool, execution_id, project, caller_class, callee_class) %>%
  mutate(total_lines = length(unique(line_number))) %>% #Get total number of lines to cover
  ungroup() 
  
combined_lcov$tool[combined_lcov$tool %in% "evosuite-callee5"] <- "EvoE"
combined_lcov$tool[combined_lcov$tool %in% "evosuite-caller5"] <- "EvoR"
combined_lcov$tool[combined_lcov$tool %in% "randoop-callee5"] <- "RanE"
combined_lcov$tool[combined_lcov$tool %in% "randoop-caller5"] <- "RanR"
combined_lcov$tool[combined_lcov$tool %in% "cling"] <- "Cling"

# Adding EvoE+R and RanE+R

combined_lcov <- combined_lcov %>%
  union(
    combined_lcov%>%
      filter(tool %in% c("EvoE", "EvoR"))%>%
      mutate(tool = "EvoE+R") %>%
      group_by(tool, execution_id, project, caller_class, callee_class, line_number, total_lines) %>%
      mutate(covered = TRUE %in% covered) %>% #Check if the line is covered in one of the executions
      ungroup() %>%
      distinct(tool, execution_id, project, caller_class, callee_class, line_number, covered, total_lines)
  ) %>% union(
    combined_lcov%>%
      filter(tool %in% c("RanE", "RanR"))%>%
      mutate(tool = "RanE+R") %>%
      group_by(tool, execution_id, project, caller_class, callee_class, line_number, total_lines) %>%
      mutate(covered = TRUE %in% covered) %>% #Check if the line is covered in one of the executions
      ungroup() %>%
      distinct(tool, execution_id, project, caller_class, callee_class, line_number, covered, total_lines)
  ) %>%
  filter(tool != "Cling") %>%
  inner_join(combined_lcov %>% filter(tool == "Cling"), 
             by = c('execution_id', 'project', 'caller_class', 'callee_class', 'line_number', 'total_lines'),
             suffix = c(".x", ".cling")) %>%
  select(-tool.cling)

diff_lcov <- combined_lcov %>%
  filter(`covered.cling` & (!(`covered.x`))) %>% #Filter lines covered by Cling but not by the other test suites 
  group_by(`tool.x`, execution_id, project, caller_class, callee_class, total_lines) %>%
  summarise(count_lines = n()) %>%
  mutate(lcov = count_lines / total_lines) %>%
  right_join(combined_lcov %>% #Add missing values 
               distinct(tool.x, execution_id, project, caller_class, callee_class, total_lines)) %>%
  mutate(lcov = if_else(is.na(lcov), 0.0, lcov))
diff_lcov$tool = factor(diff_lcov$tool.x, levels = c( "EvoE", "EvoR", "EvoE+R", "RanE", "RanR", "RanE+R"))
diff_lcov$project_f = factor(diff_lcov$project, levels=c('closure','mockito','time','lang','math'))

p <- diff_lcov %>%
  ggplot(aes(x=tool, y=lcov, fill=tool)) +
  geom_boxplot() +
  xlab("") + 
  ylab(paste0(greek$Delta, "(lcov(x), lcov(Cling + x))")) + 
  guides(fill=FALSE) +
  facet_grid(. ~ project_f, margins = TRUE) + theme(axis.text.x = element_text(angle = 90)) +
  stat_summary(fun.y=mean, geom="point", shape=23, size=2, fill = 'white') +
  scale_fill_grey(start = 0.5, end = 1.0) 
ggsave(plot = p, filename = 'data_analysis/figures/line-coverage-diff-boxplot.pdf', width=160, height=95, units = "mm",  device = cairo_pdf)


