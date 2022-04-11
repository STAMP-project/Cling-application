import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

with open(os.path.join(data_path,'cling-randoopR.csv'), 'r') as CR:
    with open(os.path.join(data_path,'cling-randoopR-raw.csv'), 'w') as outFile:
        for lineCR in CR:
            tempCR = ",".join(lineCR.split(',')[0:-1])
            outFile.write(tempCR+"\r\n")


with open(os.path.join(data_path,'cling-randoopE.csv'), 'r') as CE:
    with open(os.path.join(data_path,'cling-randoopE-raw.csv'), 'w') as outFile:
        for lineCE in CE:
            tempCE = ",".join(lineCE.split(',')[0:-1])
            outFile.write(tempCE+"\r\n")



with open(os.path.join(data_path,'cling-randoop10.csv'), 'r') as CE:
    with open(os.path.join(data_path,'cling-randoop10-raw.csv'), 'w') as outFile:
        for lineCE in CE:
            tempCE = ",".join(lineCE.split(',')[0:-1])
            outFile.write(tempCE+"\r\n")


with open(os.path.join(data_path,'cling-randoopE-raw.csv'), 'r') as t1, open(os.path.join(data_path,'cling-randoopR-raw.csv'), 'r') as t2, open(os.path.join(data_path,'cling-randoop10-raw.csv'), 'r') as t3:
    fileone = frozenset(t1)
    filethree = frozenset(t3)

    with open(os.path.join(data_path,'cling-randoop.csv'), 'w') as outFile:
        counter = 0
        for line in t2:
            counter+=1
            print counter
            if line in fileone and line in filethree:
                outFile.write(line)


with open(os.path.join(data_path,'cling-randoop.csv'), 'r') as CER:
    with open(os.path.join(data_path,'cling-randoop-final.csv'), 'w') as outFile:
        outFile.write("executionId"+",project"+",caller"+",callee"+",mutator"+",method"+",line"+",TRstatus"+",TEstatus"+",T10status"+"\r\n")
        counter = 0
        for line in CER:
            tempArr = line.split(',')
            execution_id = tempArr[0]
            project = tempArr[1]
            caller = tempArr[2]
            callee = tempArr[3]
            targetmutator = tempArr[4]
            targetmethod = tempArr[5]
            targetline = tempArr[6].replace('\n', '').replace('\r', '')

#             # open E:
            randoopEReportDir = os.path.join(data_path,"pit","randoop-callee5",project+"-"+callee+"-"+execution_id,"mutations.csv")
            print randoopEReportDir
            Estatus=""
            if os.path.isfile(randoopEReportDir):
                with open(randoopEReportDir, 'r') as _reporthandler:
                    for mutant in csv.reader(_reporthandler):
                        # print
                        if len(mutant) < 7:
                            continue
                        targetClass = mutant[1]
                        mutator = mutant[2]
                        method = mutant[3]
                        mline = mutant[4]
                        status = mutant[5]
                        killer = mutant[6]
                        if mutator == targetmutator and targetmethod == method and targetline == mline:
                            Estatus=status
            else:
                Estatus="NO_COVERAGE"

            if Estatus == "":
                print "Empty: "+line
                Estatus="NO_COVERAGE"

#             # open R
            randoopRReportDir = os.path.join(data_path,"pit","randoop-caller5",project+"-"+caller+"-"+callee+"-"+execution_id,"mutations.csv")
            print randoopRReportDir
            Rstatus=""
            if os.path.isfile(randoopRReportDir):
                with open(randoopRReportDir, 'r') as _reporthandler:
                    for mutant in csv.reader(_reporthandler):
                        # print
                        if len(mutant) < 7:
                            continue
                        targetClass = mutant[1]
                        mutator = mutant[2]
                        method = mutant[3]
                        mline = mutant[4]
                        status = mutant[5]
                        killer = mutant[6]
                        if mutator == targetmutator and targetmethod == method and targetline == mline:
                            Rstatus=status
            else:
                Rstatus="NO_COVERAGE"

            if Rstatus == "":
                print "Empty: "+line
                Rstatus="NO_COVERAGE"


             # open 10
            randoop10ReportDir = os.path.join(data_path,"pit","randoop10",project+"-"+caller+"-"+callee+"-"+execution_id,"mutations.csv")
            print randoop10ReportDir
            tenstatus=""
            if os.path.isfile(randoop10ReportDir):
                with open(randoop10ReportDir, 'r') as _reporthandler:
                    for mutant in csv.reader(_reporthandler):
                        # print
                        if len(mutant) < 7:
                            continue
                        targetClass = mutant[1]
                        mutator = mutant[2]
                        method = mutant[3]
                        mline = mutant[4]
                        status = mutant[5]
                        killer = mutant[6]
                        if mutator == targetmutator and targetmethod == method and targetline == mline:
                            tenstatus=status
            else:
                tenstatus="NO_COVERAGE"

            if tenstatus == "":
                print "Empty: "+line
                tenstatus="NO_COVERAGE"




            outFile.write(line.replace('\n', '').replace('\r', '')+","+Rstatus+","+Estatus+","+tenstatus+"\r\n")

