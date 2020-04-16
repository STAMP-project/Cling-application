from sys import argv
import os


resultDir=argv[1]
testClass=argv[2]
tempArr = testClass.split(".")
testName= tempArr[len(tempArr)-1]+".java"

exists="0"

for root, dirs, files in os.walk(resultDir):
            for file in files:
                if file.endswith(testName):
                    exists="1"

print exists