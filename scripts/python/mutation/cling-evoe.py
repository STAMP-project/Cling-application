import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

with open(os.path.join(data_path,'evoeKilled.csv'), 'r') as t1, open(os.path.join(data_path,'clingKilled.csv'), 'r') as t2:
    fileone = frozenset(t1)
    filetwo = []
    for fline in fileone:
        filetwo.append(",".join(fline.split(',')[0:-1]))
    filethree = frozenset(filetwo)
    counter = 0
    with open(os.path.join(data_path,'cling-evoe.csv'), 'w') as outFile:
        outFile.write("executionId"+",project"+",caller"+",callee"+",mutator"+",method"+",line"+",TEstatus"+"\r\n")
        "executionId","project","caller","callee","mutator","method","line","TEstatus"
        for line in t2:
            if line.startswith("execution_id"):
                continue
            #split
            counter+=1
            print counter
            line = ",".join(line.split(',')[0:-1])
            if line not in filethree:
                tempArr = line.split(',')
                execution_id = tempArr[0]
                project = tempArr[1]
                caller = tempArr[2]
                callee = tempArr[3]
                targetmutator = tempArr[4]
                targetmethod = tempArr[5]
                targetline = tempArr[6]
                EvoEReportDir = os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+execution_id,"mutations.csv")
                statusInE=""
                with open(EvoEReportDir, 'r') as _reporthandler:
                    print "YAY "+ EvoEReportDir
                    for mutant in csv.reader(_reporthandler):
                        if len(mutant) >= 7:
                            targetClass = mutant[1]
                            mutator = mutant[2]
                            method = mutant[3]
                            mline = mutant[4]
                            status = mutant[5]
                            killer = mutant[6]
                            if mutator == targetmutator and targetmethod == method and targetline == mline:
                                statusInE=status
                    if statusInE == "":
                        print "status in callee test mutation report is empty"
                    
                    outFile.write(line+", Status in E is "+statusInE+"\r\n")