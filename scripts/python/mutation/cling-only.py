import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

with open(os.path.join(data_path,'cling-evoe-evor.csv'), 'r') as t1, open(os.path.join(data_path,'cling-randoop.csv'), 'r') as t2:
    fileone = frozenset(t1)
    with open(os.path.join(data_path,'cling-only.csv'), 'w') as outFile:
        counter = 0
        for line in t2:
            counter+=1
            print counter
            if line in fileone:
                outFile.write(line)

with open(os.path.join(data_path,'cling-only.csv'), 'r') as clingOnly:
    with open(os.path.join(data_path,'cling-only-final.csv'), 'w') as outFile:
        outFile.write("executionId"+",project"+",caller"+",callee"+",mutator"+",method"+",line"+",EvoRstatus"+",EvoEstatus"+",RandoopRstatus"+",RandoopEstatus"+"\r\n")
        counter = 0
        for line in clingOnly:
            tempArr = line.split(',')
            execution_id = tempArr[0]
            project = tempArr[1]
            caller = tempArr[2]
            callee = tempArr[3]
            targetmutator = tempArr[4]
            targetmethod = tempArr[5]
            targetline = tempArr[6].replace('\n', '').replace('\r', '')
            
            reportDirs=[
                os.path.join(data_path,"pit","evosuite-caller5",project+"-"+caller+"-"+callee+"-"+execution_id,"mutations.csv"),
                os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+execution_id,"mutations.csv"),
                os.path.join(data_path,"pit","randoop-caller5",project+"-"+caller+"-"+callee+"-"+execution_id,"mutations.csv"),
                os.path.join(data_path,"pit","randoop-callee5",project+"-"+callee+"-"+execution_id,"mutations.csv")]
            statuses = []

            for report in reportDirs:
                print report
                if os.path.isfile(report):
                    if "randoop-callee5" in report:
                        print "YEEES"
                        exit()
                    with open(report, 'r') as _reporthandler:
                        for mutant in csv.reader(_reporthandler):
                            
                            if len(mutant) < 7:
                                continue
                            targetClass = mutant[1]
                            mutator = mutant[2]
                            method = mutant[3]
                            mline = mutant[4]
                            status = mutant[5]
                            killer = mutant[6]
                            if mutator == targetmutator and targetmethod == method and targetline == mline:
                                statuses.append(status)
                else:
                    statuses.append("NO_COVERAGE")
            statusesString=",".join(statuses)
            print statusesString
            outFile.write(line.replace('\n', '').replace('\r', '')+","+statusesString+"\r\n")