import sys,os
import csv
from HTMLParser import HTMLParser

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

randoopEKilledDir = os.path.join(data_path,"randoopEKilled.csv")
randoopEKilledFile = open(randoopEKilledDir,"wb")
randoopEKilledWriter = csv.writer(randoopEKilledFile)
fieldnames = ['execution_id','project', 'caller_class', 'callee_class','mutator','method','line','killer']
randoopEKilledWriter.writerow(fieldnames)

# csvwriter of mutation scores
mutationCoverageDir = os.path.join(data_path,"mutation-scores-2.csv")
mutationCoverageFile = open(mutationCoverageDir,"wb")
mutationCoverageWriter = csv.writer(mutationCoverageFile)
fieldnames = ['tool', 'execution_id','project', 'caller_class', 'callee_class','perc','killed_mutants','total_mutants']
mutationCoverageWriter.writerow(fieldnames)


## Same csvs for randoopR


randoopRKilledDir = os.path.join(data_path,"randoopRKilled.csv")
randoopRKilledFile = open(randoopRKilledDir,"wb")
randoopRKilledWriter = csv.writer(randoopRKilledFile)
fieldnames = ['execution_id','project', 'caller_class', 'callee_class','mutator','method','line','killer']
randoopRKilledWriter.writerow(fieldnames)


with open(os.path.join(root_path, "subject_generator", "subjects.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        tool=row["tool"]
        project=row["project"]
        execution_id=row["execution_id"]
        if tool.startswith("randoop"):
            caller_class=row["caller_class"]
            callee_class=row["callee_class"]
            if tool == "randoop-callee5":
                # Run randoopE
                pitestReportDir=os.path.join(data_path,"pit","randoop-callee5",project+"-"+callee_class+"-"+execution_id)

                totalMutants = 0.0
                randoopEKilled = 0.0
                if not os.path.isfile(os.path.join(pitestReportDir, "mutations.csv")):
                    print ">> "+pitestReportDir
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
                            randoopEKilled+=1
                            randoopEKilledWriter.writerow(row)  
                randoopERow = ["randoopE",execution_id, project, caller_class, callee_class, str(randoopEKilled/totalMutants),int(randoopEKilled),int(totalMutants)]
                print randoopERow
                mutationCoverageWriter.writerow(randoopERow)
            else:
                # Run randoopR

                pitestReportDir=os.path.join(data_path,"pit","randoop-caller5",project+"-"+caller_class+"-"+callee_class+"-"+execution_id)

                totalMutants = 0.0
                randoopRKilled = 0.0
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
                            randoopRKilled+=1
                            randoopRKilledWriter.writerow(row)  
                if (totalMutants == 0):
                    print os.path.join(pitestReportDir, "mutations.csv")
                    exit()
                randoopRRow = ["randoopR",execution_id, project, caller_class, callee_class, str(randoopRKilled/totalMutants),int(randoopRKilled),int(totalMutants)]
                print randoopRRow
                mutationCoverageWriter.writerow(randoopRRow)


randoopEKilledFile.close()
mutationCoverageFile.close()
randoopRKilledFile.close()