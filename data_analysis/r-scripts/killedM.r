library(dplyr)

source('data_analysis/r-scripts/inputdata.r')
dataDir="data/rq2/"

# Collect mutants killed by Cling but not by EvoSuite
CERInitialDF <- getCER()
CERDF <- CERInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())

write.csv(CERDF, file = paste(dataDir,"killedM-C-E-R.csv",sep=""))

# Collect mutants killed by Cling but not by EvoSuiteR
CRInitialDF <- getCR()

CRDF <- CRInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())

write.csv(CRDF, file = paste(dataDir,"killedM-C-R.csv",sep=""))

# Collect mutants killed by Cling but not by EvoSuiteE

CEInitialDF <- getCE()

CEDF <- CEInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())

write.csv(CEDF, file = paste(dataDir,"killedM-C-E.csv",sep=""))

# Collect mutants killed by Cling but not by Randoop
CERInitialDF <- getC_RanE_RanR()
CERDF <- CERInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())

write.csv(CERDF, file = paste(dataDir,"killedM-C-RanE-RanR.csv",sep=""))

# Collect mutants killed by Cling but not by RandoopR
CRInitialDF <- getC_RanR()

CRDF <- CRInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())

write.csv(CRDF, file = paste(dataDir,"killedM-C-RanR.csv",sep=""))

# Collect mutants killed by Cling but not by RandoopE
CEInitialDF <- getC_RanE()

CEDF <- CEInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())

write.csv(CEDF, file = paste(dataDir,"killedM-C-RanE.csv",sep=""))


# Collect mutants killed by Cling

CInitialDF <- getC()

CDF <- CInitialDF %>%
  group_by(execution_id,project,caller_class,callee_class) %>%
  summarise(killedM=n())

write.csv(CDF, file = paste(dataDir,"killedM-C.csv",sep=""))

