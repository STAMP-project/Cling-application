import sys,os
import csv
from HTMLParser import HTMLParser

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

evoeKilledDir = os.path.join(data_path,"evoeKilled.csv")
evoeKilledFile = open(evoeKilledDir,"wb")
evoeKilledWriter = csv.writer(evoeKilledFile)
fieldnames = ['execution_id','project', 'caller_class', 'callee_class','mutator','method','line','killer']
evoeKilledWriter.writerow(fieldnames)

# csvwriter of mutation scores
mutationCoverageDir = os.path.join(data_path,"mutation-scores-2.csv")
mutationCoverageFile = open(mutationCoverageDir,"wb")
mutationCoverageWriter = csv.writer(mutationCoverageFile)
fieldnames = ['tool', 'execution_id','project', 'caller_class', 'callee_class','perc','killed_mutants','total_mutants']
mutationCoverageWriter.writerow(fieldnames)


## Same csvs for EvoR


evorKilledDir = os.path.join(data_path,"evorKilled.csv")
evorKilledFile = open(evorKilledDir,"wb")
evorKilledWriter = csv.writer(evorKilledFile)
fieldnames = ['execution_id','project', 'caller_class', 'callee_class','mutator','method','line','killer']
evorKilledWriter.writerow(fieldnames)


with open(os.path.join(root_path, "subject_generator", "subjects.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        tool=row["tool"]
        project=row["project"]
        execution_id=row["execution_id"]
        if tool.startswith("evosuite"):
            caller_class=row["caller_class"]
            callee_class=row["callee_class"]
            if tool == "evosuite-callee5":
                # Run EvoE
                pitestReportDir=os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee_class+"-"+execution_id)

                totalMutants = 0.0
                EvoEKilled = 0.0
                with open(os.path.join(pitestReportDir, "mutations.csv"), 'r') as _reporthandler:
                    for mutant in csv.reader(_reporthandler):
                        if len(mutant) < 7:
                            continue
                        totalMutants+=1
                        targetClass = mutant[1]
                        mutator = mutant[2]
                        method = mutant[3]
                        line = mutant[4]
                        status = mutant[5]
                        killer = mutant[6]

                        if status == "KILLED":
                            row = [execution_id, project, caller_class, callee_class, mutator,method,line,killer]
                            EvoEKilled+=1
                            evoeKilledWriter.writerow(row)  
                EvoERow = ["EvoE",execution_id, project, caller_class, callee_class, str(EvoEKilled/totalMutants),int(EvoEKilled),int(totalMutants)]
                print EvoERow
                mutationCoverageWriter.writerow(EvoERow)
            else:
                # Run EvoR

                pitestReportDir=os.path.join(data_path,"pit","evosuite-caller5",project+"-"+caller_class+"-"+callee_class+"-"+execution_id)

                totalMutants = 0.0
                EvoRKilled = 0.0
                if not os.path.isfile(os.path.join(pitestReportDir, "mutations.csv")):
                    print [execution_id, project, caller_class, callee_class, mutator,method,line,killer]
                    continue
                with open(os.path.join(pitestReportDir, "mutations.csv"), 'r') as _reporthandler:
                    for mutant in csv.reader(_reporthandler):
                        if len(mutant) < 7:
                            continue
                        totalMutants+=1
                        targetClass = mutant[1]
                        mutator = mutant[2]
                        method = mutant[3]
                        line = mutant[4]
                        status = mutant[5]
                        killer = mutant[6]

                        if status == "KILLED":
                            row = [execution_id, project, caller_class, callee_class, mutator,method,line,killer]
                            EvoRKilled+=1
                            evorKilledWriter.writerow(row)  
                if (totalMutants == 0):
                    print os.path.join(pitestReportDir, "mutations.csv")
                    exit()
                EvoRRow = ["EvoR",execution_id, project, caller_class, callee_class, str(EvoRKilled/totalMutants),int(EvoRKilled),int(totalMutants)]
                print EvoRRow
                mutationCoverageWriter.writerow(EvoRRow)


evoeKilledFile.close()
mutationCoverageFile.close()
evorKilledFile.close()