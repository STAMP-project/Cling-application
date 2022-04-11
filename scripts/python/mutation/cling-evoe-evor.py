import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

with open(os.path.join(data_path,'cling-evor.csv'), 'r') as CR:
    with open(os.path.join(data_path,'cling-evor-raw.csv'), 'w') as outFile:
        for lineCR in CR:
            tempCR = ",".join(lineCR.split(',')[0:-1])
            outFile.write(tempCR+"\r\n")


with open(os.path.join(data_path,'cling-evoe.csv'), 'r') as CE:
    with open(os.path.join(data_path,'cling-evoe-raw.csv'), 'w') as outFile:
        for lineCE in CE:
            tempCE = ",".join(lineCE.split(',')[0:-1])
            outFile.write(tempCE+"\r\n")

with open(os.path.join(data_path,'cling-evoe-raw.csv'), 'r') as t1, open(os.path.join(data_path,'cling-evor-raw.csv'), 'r') as t2:
    fileone = frozenset(t1)

    with open(os.path.join(data_path,'cling-evoe-evor.csv'), 'w') as outFile:
        counter = 0
        for line in t2:
            counter+=1
            print counter
            if line in fileone:
                outFile.write(line)


with open(os.path.join(data_path,'cling-evoe-evor.csv'), 'r') as CER:
    with open(os.path.join(data_path,'cling-evoe-evor-final.csv'), 'w') as outFile:
        outFile.write("executionId"+",project"+",caller"+",callee"+",mutator"+",method"+",line"+",TRstatus"+",TEstatus"+"\r\n")
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
            # open E:
            EvoEReportDir = os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+execution_id,"mutations.csv")
            print "-->"+EvoEReportDir
            

            Estatus=""
            if os.path.exists(EvoEReportDir):
                print "EXISTS-->"+EvoEReportDir
                with open(EvoEReportDir, 'r') as _reporthandler:
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
                            print "We get the status: "+status
                            Estatus=status
                if Estatus == "":
                    print "Empty: "+line
                    exit()
            else:
                Estatus = "NO_COVERAGE"

            # open R
            EvoRReportDir = os.path.join(data_path,"pit","evosuite-caller5",project+"-"+caller+"-"+callee+"-"+execution_id,"mutations.csv")
            print EvoRReportDir
            Rstatus=""
            if os.path.exists(EvoEReportDir):
                with open(EvoRReportDir, 'r') as _reporthandler:
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
                if Rstatus == "":
                    print "Empty: "+line
                    exit()
            else:
                Rstatus = "NO_COVERAGE"




            outFile.write(line.replace('\n', '').replace('\r', '')+","+Rstatus+","+Estatus+"\r\n")

