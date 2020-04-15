import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")


clingKilledDir = os.path.join(data_path,"clingKilled.csv")
clingKilledFile = open(clingKilledDir,"wb")
clingKilledWriter = csv.writer(clingKilledFile)
fieldnames = ['execution_id','project', 'caller_class', 'callee_class','mutator','method','line','killer']
clingKilledWriter.writerow(fieldnames)


# csvwriter of mutation scores
mutationCoverageDir = os.path.join(data_path,"mutation-scores-2.csv")
mutationCoverageFile = open(mutationCoverageDir,"a")
mutationCoverageWriter = csv.writer(mutationCoverageFile)
fieldnames = ['tool', 'execution_id','project', 'caller_class', 'callee_class','perc','killed_mutants','total_mutants']
# mutationCoverageWriter.writerow(fieldnames)


with open(os.path.join(root_path, "subject_generator", "subjects.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        tool=row["tool"]
        project=row["project"]
        execution_id=row["execution_id"]
        if tool == "cling":
            caller_class=row["caller_class"]
            callee_class=row["callee_class"]
            # Run EvoE
            pitestReportDir=os.path.join(data_path,"pit","cling",project+"-"+caller_class+"-"+callee_class+"-"+execution_id)

            totalMutants = 0.0
            clingKilled = 0.0
            if not os.path.isfile(os.path.join(pitestReportDir, "mutations.csv")):
                print ",".join(["cling",execution_id, project, caller_class, callee_class,row["type"]])
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
                        clingKilled+=1
                        clingKilledWriter.writerow(row)
            if totalMutants != 0:
                MSRow = ["Cling",execution_id, project, caller_class, callee_class, str(clingKilled/totalMutants),int(clingKilled),int(totalMutants)]
                mutationCoverageWriter.writerow(MSRow)
            else:
                string=row["tool"]+","+row["execution_id"]+","+row["project"]+","+row["caller_class"]+","+row["callee_class"]+","+row["type"]
                print string
