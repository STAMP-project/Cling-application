
require(DT)
require(dplyr)
library(stringr)
source('data_analysis/r-scripts/inputdata.r')


CER <- unique(getCER())

RAN_CER <- unique(getC_RanE_RanR())
STATUS <- c("NO_COVERAGE","SURVIVED")
df <- CER %>% group_by(project) %>%
  summarise(count = n())


PROJECTS = df$project


mutantPerc <- getFinalForMutation()

outputFile <- "data_analysis/tables/mutant-status-table.tex"
unlink(outputFile)
sink(outputFile, append = TRUE, split = TRUE)
cat("\\begin{tabular}{ l | cc | cc | cc | cc | cc }\n")
cat("\\hline", "\n")
cat("\\textbf{Test Suite}")
for (p in PROJECTS) {
  cat( "& ","\\multicolumn{",length(STATUS),"}{c}{\\textbf{",p,"}}", sep = "")
}
cat(" \\\\", "\n")
for (p in PROJECTS) {

  for (s in STATUS) {
    cat(" & ",ifelse(s == "NO_COVERAGE", "not-covered","survived"), sep = "")
  }
}
cat(" \\\\", "\n")
cat("\\hline", "\n")

# TE
cat("$T_{EvoE}$")
for (p in PROJECTS) {
  for (s in STATUS) {
    tempDF <- CER %>%
      filter(project == p & TEstatus == s)
    tempPerc <- mutantPerc %>%
      filter(project == head(tempDF,1)$project) %>%
      group_by(project,caller_class,callee_class) %>%
      summarise(total = min(totalMutants)) %>%
      group_by(project) %>%
      summarise(total = sum(total))

    totalMutants <- head(tempPerc,1)$total*20 

    cat( "& ",formatC(nrow(tempDF), format = "f", big.mark = ",", drop0trailing = TRUE),"(",
         formatC(nrow(tempDF)/totalMutants, digits = 2, format = "f"),")")
  }
}

cat(" \\\\", "\n")

# TR
cat("$T_{EvoR}$")
for (p in PROJECTS) {
  for (s in STATUS) {
    tempDF <- CER %>%
      filter(project == p & TRstatus == s)
    
    tempPerc <- mutantPerc %>%
      filter(project == head(tempDF,1)$project) %>%
      group_by(project,caller_class,callee_class) %>%
      summarise(total = min(totalMutants)) %>%
      group_by(project) %>%
      summarise(total = sum(total))
      
    #  filter(caller_class == head(tempDF,1)$caller & callee_class == head(tempDF,1)$callee)
    totalMutants <- head(tempPerc,1)$total*20 
    cat( "& ",formatC(nrow(tempDF), format = "f", big.mark = ",", drop0trailing = TRUE),"(",
         formatC(nrow(tempDF)/totalMutants, digits = 2, format = "f"),")")
  }
}

cat(" \\\\", "\n")

# RanE
cat("$T_{RanE}$")
for (p in PROJECTS) {
  for (s in STATUS) {
    tempDF <- RAN_CER %>%
      filter(project == p & TEstatus == s)
    
    tempPerc <- mutantPerc %>%
      filter(project == head(tempDF,1)$project) %>%
      group_by(project,caller_class,callee_class) %>%
      summarise(total = min(totalMutants)) %>%
      group_by(project) %>%
      summarise(total = sum(total))
    
    #  filter(caller_class == head(tempDF,1)$caller & callee_class == head(tempDF,1)$callee)
    totalMutants <- head(tempPerc,1)$total*20 
    cat( "& ",formatC(nrow(tempDF), format = "f", big.mark = ",", drop0trailing = TRUE),"(",
         formatC(nrow(tempDF)/totalMutants, digits = 2, format = "f"),")")
  }
}

cat(" \\\\", "\n")

# RanR
cat("$T_{RanR}$")
for (p in PROJECTS) {
  for (s in STATUS) {
    tempDF <- RAN_CER %>%
      filter(project == p & TRstatus == s)
    
    tempPerc <- mutantPerc %>%
      filter(project == head(tempDF,1)$project) %>%
      group_by(project,caller_class,callee_class) %>%
      summarise(total = min(totalMutants)) %>%
      group_by(project) %>%
      summarise(total = sum(total))
    
    #  filter(caller_class == head(tempDF,1)$caller & callee_class == head(tempDF,1)$callee)
    totalMutants <- head(tempPerc,1)$total*20 
    cat( "& ",formatC(nrow(tempDF), format = "f", big.mark = ",", drop0trailing = TRUE),"(",
         formatC(nrow(tempDF)/totalMutants, digits = 2, format = "f"),")")
  }
}

cat(" \\\\", "\n")

cat("\\hline", "\n")
cat("\\end{tabular}")
sink()

# Analyze Cling - EvoSuite mutators
interestingCases <- CER %>%
  group_by(caller,callee,mutator,method,line,TRstatus,TEstatus) %>%
  summarise(count = n())

mutators <- interestingCases %>%
  group_by(mutator) %>%
  summarise(count = n()) %>%
  arrange(desc(count)) 

switchMutators <- mutators%>% 
  filter(str_detect(mutators$mutator,"RemoveSwitchMutator"))

switchMutatorsCount <- sum(switchMutators$count)

mutators <- mutators %>%
  filter(!str_detect(mutators$mutator,"RemoveSwitchMutator"))

mutators[nrow(mutators) + 1,] = c("RemoveSwitchMutator",switchMutatorsCount)
# print the most 20 operators in a tex table
outputFile <- "data_analysis/tables/mutation-operators-table-cling.tex"
unlink(outputFile)
# Redirect cat outputs to file
sink(outputFile, append = TRUE, split = TRUE)
# cats
cat("\\begin{tabular}{ l l | c}\n")
cat("\\hline", "\n")
cat(" ", "&",
    "\\textbf{operator}", "&",
    "\\textbf{Number of Occurrences}")
cat(" \\\\", "\n")
cat("\\hline", "\n")
for(row in seq(from=1, to=nrow(mutators),by=1)){
  cat(row, "&",
      mutators[[row, 'mutator']], "&", 
      mutators[[row, 'count']])
  cat(" \\\\", "\n")
}
cat("\\end{tabular}")
sink()
# Analyze Cling - Randoop mutators


interestingCases <- RAN_CER %>%
  group_by(caller,callee,mutator,method,line,TRstatus,TEstatus) %>%
  summarise(count = n())

mutators <- interestingCases %>%
  group_by(mutator) %>%
  summarise(count = n()) %>%
  arrange(desc(count)) 

switchMutators <- mutators%>% 
  filter(str_detect(mutators$mutator,"RemoveSwitchMutator"))

switchMutatorsCount <- sum(switchMutators$count)

mutators <- mutators %>%
  filter(!str_detect(mutators$mutator,"RemoveSwitchMutator"))

mutators[nrow(mutators) + 1,] = c("RemoveSwitchMutator",switchMutatorsCount)
# print the most 20 operators in a tex table

outputFile <- "data_analysis/tables/mutation-operators-table-randoop.tex"
unlink(outputFile)
# Redirect cat outputs to file
sink(outputFile, append = TRUE, split = TRUE)
# cats
cat("\\begin{tabular}{ l l | c}\n")
cat("\\hline", "\n")
cat(" ", "&",
    "\\textbf{operator}", "&",
    "\\textbf{Number of Occurrences}")
cat(" \\\\", "\n")
cat("\\hline", "\n")
for(row in seq(from=1, to=nrow(mutators),by=1)){
  cat(row, "&",
      mutators[[row, 'mutator']], "&", 
      mutators[[row, 'count']])
  cat(" \\\\", "\n")
}
cat("\\end{tabular}")
sink()