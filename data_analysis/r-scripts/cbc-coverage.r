library(tidyverse)
library(moments)
library(ggplot2)
library(tidyr)
library(Hmisc)
library(latex2exp)

source('data_analysis/r-scripts/inputdata.r')
source('data_analysis/r-scripts/applyfriedmantest.R')


results <- getResultsOfRQ1() %>%
  filter(tool != "randoop-caller5")

results<- results %>%
  filter(total_cb > 0) %>%
  mutate(CBC = if_else(total_cb > 0, covered_cb / total_cb, NaN))

results$coveragePercentage <- results$covered_cb/results$total_cb


# General comparision

cat("Total Average CBC")
show(results %>%
       group_by(tool) %>%
       summarise(avg = mean(CBC),
                 median = median(CBC),
                 IQR = IQR(CBC)))

cat("Total Average CBC per project")
show(results %>%
       group_by(tool, project) %>%
       summarise(avg = mean(CBC),
                 median = median(CBC),
                 IQR = IQR(CBC))%>%
       arrange(tool, avg))

# Comparison per case

avgCBCPerCase <- results %>%
  group_by(testsuite, project, caller_class, callee_class) %>%
  summarise(avgCBC = mean(CBC)) %>%
  mutate(case = paste(caller_class,"-",callee_class))

pdf("data_analysis/figures/cbc-friedman-nemenyi.pdf", width=6, height=3) 
p <- plot_using_friedman_and_nemenyi(avgCBCPerCase)
# ggsave(filename = 'data_analysis/figures/cbc-friedman-nemenyi.pdf', width=160, height=105, units = "mm" )
dev.off()

con <- apply_conover(avgCBCPerCase,
                     avgCBCPerCase$avgCBC,
                     avgCBCPerCase$testsuite,
                     avgCBCPerCase$case,
                     "Coupled Branches Coverage")

cat("Conover post-hoc")
show(con)

ranking <- apply_friedman_test(avgCBCPerCase,
                               avgCBCPerCase$avgCBC,
                               avgCBCPerCase$testsuite,
                               avgCBCPerCase$case,
                               "Coupled Branches Coverage")

cat("Ranking")
show(ranking)

CBC_comparison <- avgCBCPerCase %>%
  inner_join(avgCBCPerCase, by=c('project', 'caller_class', 'callee_class'), suffix = c('.alg1', '.alg2')) %>%
  filter(testsuite.alg1 == "Cling" & testsuite.alg2 %in% c("RanR","Ran") & avgCBC.alg1 < avgCBC.alg2)

avgCBCPP <- results %>%
  group_by(tool, project) %>%
  summarise(avg = mean(CBC))

cat("Average CBC Per Project")
show(avgCBCPP)

higher50 <- results %>%
  group_by(tool,project_f,testsuite,caller_class,callee_class) %>%
  summarise(avgP = max(coveragePercentage)) %>%
  filter(avgP >= 0.5 & tool == "cling") %>%
  group_by(project_f) %>%
  summarise(count = n())

cat("Projects with a CBC >= 50%")
show(higher50)

# Distribution of CBC coverage 

df <- results %>%
  group_by(tool,project_f,testsuite,caller_class,callee_class) %>%
  summarise(avgP = max(coveragePercentage)) %>%
  mutate(status = ifelse(avgP<0.25,"<25%",
                         ifelse(avgP<0.5,"25%< & <50%",
                        ifelse(avgP<0.75, "50%< & <75%",">75%")))) %>%
  filter(tool == "cling") 

dist <- df %>%
  group_by(project_f,status) %>%
  summarise(n = n()) %>%
  mutate(Frequency = n / sum(n), label = paste0(n," (",ceiling((n / sum(n))*100),"%)")) 

dist_all <- df %>%
  group_by(status) %>%
  summarise(n = n()) %>%
  mutate(Frequency = n / sum(n), label = paste0(n," (",ceiling((n / sum(n))*100),"%)")) 

dist_all['project_f'] = factor(c("all"),levels = c("all"))

for (row in 1:nrow(dist_all)) {
  dist[nrow(dist) + 1,] = c("all",dist_all[row,"status"],dist_all[row,"n"],dist_all[row,"Frequency"],dist_all[row,"label"])
  dist_all[row,"status"]
}

dist$stat_f = factor(dist$status, levels= c (">75%", "50%< & <75%", "25%< & <50%", "<25%"))
p <- ggplot(dist, aes(x = project_f, y = Frequency, fill = stat_f)) + 
  geom_bar(stat = "identity") +
  geom_text(aes(label = label), position = position_stack(vjust = 0.5), size = 3) +
  # scale_fill_manual(values=c("#5e3c99", "#b2abd2", "#fdb863","#e66101")) +
  scale_fill_grey(start = 0.5, end = 1.0) +
  coord_flip() +
  xlab("Projects") +
  guides(fill=guide_legend(title="CBC: ")) +
  theme(legend.position="top")
ggsave("data_analysis/figures/cbc-frequency-distribution.pdf", width=180, height=70, units = "mm")


p <- ggplot(data=higher50, aes(x=project_f, y=count)) +
  geom_bar(stat="identity") +
  geom_text(aes(label=count), vjust=-1.0, color="black",
            position = position_dodge(0.9), size=3.5)+
  theme(text = element_text(size=13),axis.text.x = element_text(size=11)) +
  scale_y_discrete(expand = c(0, 0)) +
  expand_limits( y=c(0, 40))+
  scale_fill_manual(values=c('black','lightgray')) +
  ylab("# of class pairs") + xlab("Project") +
ggsave("data_analysis/figures/cbc-higher-than-50.pdf", width=160, height=105, units = "mm")

p <- ggplot(results, aes(x = testsuite_f, y= CBC, fill = factor(testsuite_f))) +
  geom_boxplot() +
  stat_summary(fun.data = "mean_cl_boot", geom="point", shape=23, size=2, fill = 'white') +
  xlab("Test Suites") + ylab("Coupled Branches Coverage") +
  labs(fill = "Projects") +
  facet_grid(. ~ project_f, margins = TRUE, scales = "free_x") +
  scale_fill_grey(start = 0.5, end = 1.0) +
  guides(fill=FALSE) +
  theme(text = element_text(size=15),axis.text.x = element_text(size=13, angle = 90))
ggsave(plot = p, filename = 'data_analysis/figures/cbc-per-project.pdf', width=160, height=105, units = "mm" )

p_total <-  ggplot(results, aes(x = factor(testsuite), y= CBC)) +
  theme(text = element_text(size=15),axis.text.x = element_text(size=11)) +
  geom_boxplot() +
  xlab("Tools") + ylab("Coupled Branches Coverage") +
  stat_summary(fun.y=mean, geom="point", shape=23, size=2, fill = 'white')
ggsave(plot = p_total, filename = 'data_analysis/figures/cbc-total.pdf', width=160, height=105, units = "mm" )
