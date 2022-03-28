import sys

fileDir=sys.argv[1]
pattern=sys.argv[2]
caseNumber=sys.argv[3]

counter=0
for line in open(fileDir, "r"):
    if "did not pass without mutation." in line:
        counter+=1
        if counter == int(caseNumber):
            testName=line.split("[testClass=")[1].split(",")[0]
            print testName
            break

# Description [testClass=RegressionTest65, name=test13057(RegressionTest65)]