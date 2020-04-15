library(dplyr)

source('data_analysis/r-scripts/inputdata.r')
dataDir="data/rq2/"
CERInitialDF <- getCER()
CERDF <- CERInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())


write.csv(CERDF, file = paste(dataDir,"killedM-C-E-R.csv",sep=""))


CRInitialDF <- getCR()

CRDF <- CRInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())
write.csv(CRDF, file = paste(dataDir,"killedM-C-R.csv",sep=""))



CEInitialDF <- getCE()

CEDF <- CEInitialDF %>%
  group_by(executionId,project,caller,callee) %>%
  summarise(killedM=n())
write.csv(CEDF, file = paste(dataDir,"killedM-C-E.csv",sep=""))

CInitialDF <- getC()

CDF <- CInitialDF %>%
  group_by(execution_id,project,caller_class,callee_class) %>%
  summarise(killedM=n())
write.csv(CDF, file = paste(dataDir,"killedM-C.csv",sep=""))