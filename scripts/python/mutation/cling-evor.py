import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

with open(os.path.join(data_path,'evorKilled.csv'), 'r') as t1, open(os.path.join(data_path,'clingKilled.csv'), 'r') as t2:
    fileone = frozenset(t1)
    filetwo = []
    for fline in fileone:
        filetwo.append(",".join(fline.split(',')[0:-1]))
    filethree = frozenset(filetwo)
    counter = 0
    with open(os.path.join(data_path,'cling-evor.csv'), 'w') as outFile:
        for line in t2:
            counter+=1
            print counter
            line = ",".join(line.split(',')[0:-1])
            if line not in filethree:
                # See the status in EvoR
                tempArr = line.split(',')
                execution_id = tempArr[0]
                project = tempArr[1]
                caller = tempArr[2]
                callee = tempArr[3]
                targetmutator = tempArr[4]
                targetmethod = tempArr[5]
                targetline = tempArr[6]
                # targetstatus = tempArr[7]
                EvoRReportDir = os.path.join(data_path,"pit","evosuite-caller5",project+"-"+caller+"-"+callee+"-"+execution_id,"mutations.csv")
                statusInR=""
                with open(EvoRReportDir, 'r') as _reporthandler:
                    for mutant in csv.reader(_reporthandler):
                        targetClass = mutant[1]
                        mutator = mutant[2]
                        method = mutant[3]
                        mline = mutant[4]
                        status = mutant[5]
                        killer = mutant[6]
                        if mutator == targetmutator and targetmethod == method and targetline == mline:
                            statusInR=status
                if statusInR == "":
                    print "status in caller test mutation report is empty"
                outFile.write(line+", Status in R is "+statusInR+"\r\n")