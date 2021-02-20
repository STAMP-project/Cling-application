library(dplyr)
library(ggplot2)

source('data_analysis/r-scripts/inputdata.r')

df <- getLineCoverageDF()

df$tool[df$tool %in% "evosuite-callee5"] <- "EvoE"
df$tool[df$tool %in% "evosuite-caller5"] <- "EvoR"
df$tool[df$tool %in% "randoop-callee5"] <- "RanE"
df$tool[df$tool %in% "randoop-caller5"] <- "RanR"
df$tool[df$tool %in% "cling"] <- "C"

df$line_coverage_perc <- df$covered_lines/df$total_lines

testdf <- df %>%
  group_by(tool) %>%
  summarise(count = n(), avg = mean(line_coverage_perc))
cat("Average line coverage of the callees")
show(testdf)

# Plot line coverage

df$project_f = factor(df$project, levels=c('closure','mockito','time','lang','math'))
p <- 	ggplot(df, aes(x=factor(tool,levels = c("EvoE","EvoR", "RanE","RanR","C")), y=line_coverage_perc, fill=factor(tool))) + 
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
