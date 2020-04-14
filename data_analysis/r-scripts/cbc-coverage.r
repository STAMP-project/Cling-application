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


p <- ggplot(results, aes(x = factor(testSuite), y= CBC, fill = factor(project))) +
  geom_boxplot() +
  stat_summary(fun.data = "mean_cl_boot", geom="point", shape=23, size=2, fill = 'white') +
  xlab("Test Suites") + ylab("Coupled Branches Coverage") +
  labs(fill = "Projects") +
  facet_grid(. ~ project, margins = TRUE, scales = "free_x") +
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
