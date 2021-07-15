library(dplyr)
library(ggplot2)
library(greekLetters)
library(Cairo)

source('data_analysis/r-scripts/inputdata.r')

df <- getMutationScores()

df$tool[df$tool %in% "evosuite-callee5"] <- "EvoE"
df$tool[df$tool %in% "evosuite-caller5"] <- "EvoR"
df$tool[df$tool %in% "randoop-callee5"] <- "RanE"
df$tool[df$tool %in% "randoop-caller5"] <- "RanR"
df$tool[df$tool %in% "cling"] <- "Cling"

df$mutation_coverage_perc <- df$mutation_coverage_perc/100

cat("Average mutation score per tool")
show(df %>%
  group_by(tool) %>%
  summarise(avg = mean(mutation_coverage_perc)))

averagePerces <- df %>%
  group_by(tool,project) %>%
  summarise(avg = mean(mutation_coverage_perc))
cat("Average mutation score per tool and per project")
show(averagePerces)

df$project_f = factor(df$project, levels=c('closure','mockito','time','lang','math'))
p <- 	ggplot(df, aes(x=factor(tool,levels = c("EvoE","EvoR", "RanE","RanR","Cling")), y=mutation_coverage_perc, fill=factor(tool))) + 
  scale_fill_grey(start = 0.5, end = 1.0) +
  geom_boxplot() +
  xlab("") + 
  ylab("Mutation score") + 
  guides(fill=FALSE) +
  facet_grid(. ~ project_f, margins = TRUE) + theme(axis.text.x = element_text(angle = 90)) +
  stat_summary(fun.y=mean, geom="point", shape=23, size=2, fill = 'white')  

p = p + scale_fill_grey(start = 0.5, end = 1.0)
ggsave(plot = p, filename = 'data_analysis/figures/mutation-coverage-boxplot.pdf', width=160, height=95, units = "mm" )



diffdf <- getFinalForMutation()

diffdf$tool[diffdf$tool %in% "CE"] <- "EvoE"
diffdf$tool[diffdf$tool %in% "CR"] <- "EvoR"
diffdf$tool[diffdf$tool %in% "CER"] <- "EvoE+R"
diffdf$tool[diffdf$tool %in% "CRanE"] <- "RanE"
diffdf$tool[diffdf$tool %in% "CRanR"] <- "RanR"
diffdf$tool[diffdf$tool %in% "CRanERanR"] <- "RanE+R"
diffdf$project_f = factor(diffdf$project, levels=c('closure','mockito','time','lang','math'))
p <- 	ggplot(diffdf, aes(x=factor(tool,levels = c( "EvoE", "EvoR", "EvoE+R", "RanE", "RanR", "RanE+R")), y=perc, fill=factor(tool))) + 
  geom_boxplot() +
  xlab("") + 
  ylab(paste0(greek$Delta,"(score(x), score(Cling + x))")) + 
  guides(fill=FALSE) +
  facet_grid(. ~ project_f, margins = TRUE) + theme(axis.text.x = element_text(angle = 90)) +
  stat_summary(fun.y=mean, geom="point", shape=23, size=2, fill = 'white')
p = p + scale_fill_grey(start = 0.5, end = 1.0) 
ggsave(plot = p, filename = 'data_analysis/figures/mutation-diff-boxplot.pdf', width=160, height=95, units = "mm",  device = cairo_pdf)

avgKilledMutants <-  diffdf %>%
  group_by(tool) %>%
  summarise(percAvg = mean(perc))

cat("Total Average mutation diff")
show(avgKilledMutants)

# Outliers where CLING kills has a +50% improvement

betterThan50 <- diffdf %>% filter(perc > 0.5 ) %>% group_by(tool,project,caller_class,callee_class) %>%
  summarise(number=n())

cat("Outliers where CLING kills has a +50% improvement")
show(betterThan50)

betterThan50Count <- betterThan50%>%
  group_by(tool) %>%
  summarise(count=n())

cat("Number of outliers where CLING kills has a +50% improvement")
show(betterThan50Count)

