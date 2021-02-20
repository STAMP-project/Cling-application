import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

with open(os.path.join(data_path,'randoopRKilled.csv'), 'r') as t1, open(os.path.join(data_path,'clingKilled.csv'), 'r') as t2:
    fileone = frozenset(t1)
    filetwo = []
    for fline in fileone:
        filetwo.append(",".join(fline.split(',')[0:-1]))
    filethree = frozenset(filetwo)
    counter = 0
    with open(os.path.join(data_path,'cling-randoopR.csv'), 'w') as outFile:
        outFile.write("executionId"+",project"+",caller"+",callee"+",mutator"+",method"+",line"+",TRstatus"+"\r\n")
        for line in t2:
            counter+=1
            print counter
            line = ",".join(line.split(',')[0:-1])
            if line not in filethree:
                # See the status in randoopR
                tempArr = line.split(',')
                execution_id = tempArr[0]
                project = tempArr[1]
                caller = tempArr[2]
                callee = tempArr[3]
                targetmutator = tempArr[4]
                targetmethod = tempArr[5]
                targetline = tempArr[6]
                # targetstatus = tempArr[7]
                randoopRReportDir = os.path.join(data_path,"pit","randoop-caller5",project+"-"+caller+"-"+callee+"-"+execution_id,"mutations.csv")
                statusInR=""
                if os.path.isfile(randoopRReportDir):
                    with open(randoopRReportDir, 'r') as _reporthandler:
                        for mutant in csv.reader(_reporthandler):
                            targetClass = mutant[1]
                            mutator = mutant[2]
                            method = mutant[3]
                            mline = mutant[4]
                            status = mutant[5]
                            killer = mutant[6]
                            if mutator == targetmutator and targetmethod == method and targetline == mline:
                                statusInR=status
                else:
                    statusInR="NO_COVERAGE"
                if statusInR == "":
                    print "status in caller test mutation report is empty"
                outFile.write(line+", Status in R is "+statusInR+"\r\n")