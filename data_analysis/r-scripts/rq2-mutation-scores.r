library(dplyr)
library(ggplot2)

source('data_analysis/r-scripts/inputdata.r')

df <- getMutationScores()

df$tool[df$tool %in% "evosuite-callee5"] <- "E"
df$tool[df$tool %in% "evosuite-caller5"] <- "R"
df$tool[df$tool %in% "cling"] <- "C"

df$mutation_coverage_perc <- df$mutation_coverage_perc/100

averagePerces <- df %>%
  group_by(tool,project) %>%
  summarise(avg = mean(mutation_coverage_perc))


df$project_f = factor(df$project, levels=c('closure','mockito','time','lang','math'))
p <- 	ggplot(df, aes(x=factor(tool,levels = c("E","R","C")), y=mutation_coverage_perc, fill=factor(tool))) + 
  scale_colour_grey(start = 0, end = .9) +
  geom_boxplot() +
  xlab("") + 
  ylab("mutation score") + 
  guides(fill=FALSE) +
  facet_grid(. ~ project_f, margins = TRUE) +
  stat_summary(fun.y=mean, geom="point", shape=23, size=2, fill = 'white')  

p = p + scale_fill_grey(start = 0, end = .9)
ggsave(plot = p, filename = 'data_analysis/figures/mutation-coverage-boxplot.pdf', width=160, height=105, units = "mm" )




diffdf <- getFinalForMutation()


diffdf$tool[diffdf$tool %in% "CE"] <- "E"
diffdf$tool[diffdf$tool %in% "CR"] <- "R"
diffdf$tool[diffdf$tool %in% "CER"] <- "E+R"
diffdf$project_f = factor(diffdf$project, levels=c('closure','mockito','time','lang','math'))
p <- 	ggplot(diffdf, aes(x=factor(tool,levels = c("E","R","E+R")), y=perc, fill=factor(tool))) + 
  geom_boxplot() +
  xlab("") + 
  ylab("mutation score improvement by Cling") + 
  guides(fill=FALSE) +
  #scale_fill_brewer(palette="Dark2") +
  facet_grid(. ~ project_f, margins = TRUE) + theme(axis.text.x = element_text(angle = 90)) +
  stat_summary(fun.y=mean, geom="point", shape=23, size=2, fill = 'white')
p = p + scale_fill_grey(start = 0, end = .9)
ggsave(plot = p, filename = 'data_analysis/figures/mutation-diff-boxplot.pdf', width=160, height=105, units = "mm" )



betterThan50 <- diffdf %>% filter(perc > 0.5 ) %>% group_by(tool,project,caller_class,callee_class) %>%
  summarise(number=n())

betterThan50Count <- betterThan50%>%
  group_by(tool) %>%
  summarise(count=n())


avgKilledMutants <-  diffdf %>%
  group_by(tool) %>%
  summarise(percAvg = mean(perc))

  cat("Total Average mutation diff")
show(avgKilledMutants)