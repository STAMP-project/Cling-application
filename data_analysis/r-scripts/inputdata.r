library(tidyverse)
SIGNIFICANCE_LEVEL=0.05

COLOR_PALETTE="Spectral" # Use photocopy friendly colors (http://colorbrewer2.org/)
dataDir="data/rq2/"
# Labels to use in the graphs
EVO_NAME="E.10"
APPROACH_NAME="Cling"

# Produces an easy to process dataframe from rq1 results csv file.
getResultsOfRQ1 <- function(){
  df <- read.csv("data/rq1/cbc-coverage.csv", stringsAsFactors = FALSE) %>%
    inner_join(read.csv("data/filtered-class-pairs.csv", stringsAsFactors = FALSE))
  df$testsuite[df$tool %in% "evosuite-callee5"] <- "EvoE"
  df$testsuite[df$tool %in% "evosuite-caller5"] <- "EvoR"
  df$testsuite[df$tool %in% "randoop-callee5"] <- "RanE"
  df$testsuite[df$tool %in% "randoop-caller5"] <- "RanR"
  df$testsuite[df$tool %in% "cling"] <- "Cling"
  df$testsuite_f <- factor(df$testsuite,levels = c("EvoE","EvoR", "RanE","RanR","Cling"))
  df$project_f = factor(df$project, levels=c('closure','mockito','time','lang','math','all'))
  return(df)
}

getMutationScores <- function(){
  df <- read.csv("data/rq2/mutation-scores.csv", stringsAsFactors = FALSE)
  return(df)
}

# Produces an easy to process dataframe from rq2 results csv file.
getResultsOfRQ2 <- function(){
  df <- read.csv("../../main/RQ1-2/final_result.csv", stringsAsFactors = FALSE)
  return(df)
}

# Get randoop-related killed muntants
getRanR <- function(){
  df <- read.csv("data/rq2/randoopRKilled.csv", stringsAsFactors = FALSE)
  return(df)
}

getRanE <- function(){
  df <- read.csv("data/rq2/randoopEKilled.csv", stringsAsFactors = FALSE)
  return(df)
}

getC_RanE <- function(){
  df <- read.csv("data/rq2/cling-randoopE.csv", stringsAsFactors = FALSE)
  return(df)
}


getC_RanR <- function(){
  df <- read.csv("data/rq2/cling-randoopR.csv", stringsAsFactors = FALSE)
  return(df)
}

getC_RanE_RanR <- function(){
  df <- read.csv("data/rq2/cling-randoop-final.csv", stringsAsFactors = FALSE)
  return(df)
}

getOnlyC <- function(){
  df <- read.csv("data/rq2/cling-only-final.csv", stringsAsFactors = FALSE)
  return(df)
}

getCER <- function(){
  df <- read.csv("data/rq2/cling-evoe-evor-final.csv", stringsAsFactors = FALSE)
  return(df)
}


getCE <- function(){
  df <- read.csv(paste(dataDir,"cling-evoe.csv",sep=""), stringsAsFactors = FALSE)
  return(df)
}

getCR <- function(){
  df <- read.csv(paste(dataDir,"cling-evor.csv",sep=""), stringsAsFactors = FALSE)
  return(df)
}

getE <- function(){
  df <- read.csv("../../main/new/evoeKilled.csv", stringsAsFactors = FALSE)
  return(df)
}

getFinalForMutation <- function(){
  df <- read.csv(paste(dataDir,"final_mutants-table.csv",sep=""), stringsAsFactors = FALSE)
  return(df)
}

getE <- function(){
  df <- read.csv("../../main/new/evoeKilled.csv", stringsAsFactors = FALSE)
  return(df)
}

getR <- function(){
  df <- read.csv("../../main/new/evorKilled.csv", stringsAsFactors = FALSE)
  return(df)
}


getC <- function(){
  df <- read.csv(paste(dataDir,"clingKilled.csv",sep=""), stringsAsFactors = FALSE)
  return(df)
}

getTotalMutants <- function(){
  df <- read.csv("../../main/new/total_mutants.csv", stringsAsFactors = FALSE)
  return(df)
}


# Line coverage inputs

getLineCoverageDF <- function(){
  df <- read.csv("data/line-coverage/line-coverage.csv", stringsAsFactors = FALSE)
  return(df)
}

getLineStatusesDF <- function(){
  df <- read.csv("data/line-coverage/all-lines.csv", stringsAsFactors = FALSE)
  return(df)
}