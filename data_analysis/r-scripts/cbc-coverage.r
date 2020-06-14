library(tidyverse)
library(moments)
library(ggplot2)
library(tidyr)
library(Hmisc)
library(latex2exp)

source('data_analysis/r-scripts/inputdata.r')

results <- getResultsOfRQ1()

results<- results %>%
  filter(total_cb > 0) %>%
  mutate(CBC = if_else(total_cb > 0, covered_cb / total_cb, NaN))


results$coveragePercentage <- results$covered_cb/results$total_cb

results <- results %>%
  mutate(testSuite = if_else(tool == "evosuite-caller5", "R", "C"))

avgCBCTotal <- results %>%
  group_by(tool) %>%
  summarise(avg = mean(CBC))

cat("Total Average CBC")
show(avgCBCTotal)


avgCBCPP <- results %>%
  group_by(tool, project) %>%
  summarise(avg = mean(CBC))

cat("Average CBC Per Project")
show(avgCBCPP)

results$project_f = factor(results$project, levels=c('closure','mockito','time','lang','math'))

higher50 <- results %>%
  group_by(tool,project_f,testSuite,caller_class,callee_class) %>%
  summarise(avgP = max(coveragePercentage)) %>%
  filter(avgP >0.5 & tool == "cling") %>%
  group_by(project_f) %>%
  summarise(count = n())


p <- ggplot(data=higher50, aes(x=project_f, y=count)) +
  geom_bar(stat="identity") +
  geom_text(aes(label=count), vjust=-1.0, color="black",
            position = position_dodge(0.9), size=3.5)+
  theme(text = element_text(size=13),axis.text.x = element_text(size=11)) +
  scale_y_discrete(expand = c(0, 0)) +
  expand_limits( y=c(0, 40))+
  scale_fill_manual(values=c('black','lightgray')) +
  ylab("# of class pairs") + xlab("Project")
ggsave("data_analysis/figures/cbc-higher-than-50.pdf", width=160, height=105, units = "mm")

p <- ggplot(results, aes(x = factor(testSuite), y= CBC, fill = factor(project_f))) +
  geom_boxplot() +
  stat_summary(fun.data = "mean_cl_boot", geom="point", shape=23, size=2, fill = 'white') +
  xlab("Test Suites") + ylab("Coupled Branches Coverage") +
  labs(fill = "Projects") +
  facet_grid(. ~ project_f, margins = TRUE, scales = "free_x") +
  scale_fill_brewer(palette=COLOR_PALETTE) +
  guides(fill=FALSE) +
  theme(text = element_text(size=15),axis.text.x = element_text(size=13, angle = 90)) + 
  scale_fill_grey(start = 0, end = .9)
ggsave(plot = p, filename = 'data_analysis/figures/cbc-per-project.pdf', width=160, height=105, units = "mm" )

p_total <-  ggplot(results, aes(x = factor(testSuite), y= CBC)) +
  theme(text = element_text(size=15),axis.text.x = element_text(size=11)) +
  geom_boxplot() +
  xlab("Tools") + ylab("Coupled Branches Coverage") +
  stat_summary(fun.y=mean, geom="point", shape=23, size=2, fill = 'white')
ggsave(plot = p_total, filename = 'data_analysis/figures/cbc-total.pdf', width=160, height=105, units = "mm" )
