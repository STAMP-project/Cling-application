library(dplyr)
SIGNIFICANCE_LEVEL=0.05

COLOR_PALETTE="Spectral" # Use photocopy friendly colors (http://colorbrewer2.org/)
dataDir="data/rq2/"
# Labels to use in the graphs
EVO_NAME="E.10"
APPROACH_NAME="Cling"

# Produces an easy to process dataframe from rq1 results csv file.
getResultsOfRQ1 <- function(){
  df <- read.csv("data/rq1/cbc-coverage.csv", stringsAsFactors = FALSE)
  return(df)
}

# Produces an easy to process dataframe from rq2 results csv file.
getResultsOfRQ2 <- function(){
  df <- read.csv("../../main/RQ1-2/final_result.csv", stringsAsFactors = FALSE)
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
  df <- read.csv("../../main/new/final_result.csv", stringsAsFactors = FALSE)
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