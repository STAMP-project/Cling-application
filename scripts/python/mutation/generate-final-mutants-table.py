import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")

tableDir = os.path.join(data_path,"final_mutants-table.csv")
tableFile = open(tableDir,"wb")
tableWriter = csv.writer(tableFile)
fieldnames = ['tool', 'project','execution_id', 'caller_class', 'callee_class','totalMutants','killedMutants','perc']
tableWriter.writerow(fieldnames)

#CER
with open(os.path.join(data_path, "killedM-C-E-R.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        project= row["project"]
        exeId = row["executionId"]
        caller = row["caller"]
        callee = row["callee"]
        killedMutants = row["killedM"]
        # find total mutants
        report=os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+exeId,"mutations.csv")
        # print report
        if not os.path.isfile(report):
            print "Missing report "+report
            exit()
        totalM = sum(1 for line in open(report))
        perc=float(killedMutants)/float(totalM)
        print perc
        finalRow=['CER',project,exeId,caller,callee,totalM,killedMutants,perc]
        tableWriter.writerow(finalRow)

#CE
with open(os.path.join(data_path, "killedM-C-E.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        project= row["project"]
        exeId = row["executionId"]
        caller = row["caller"]
        callee = row["callee"]
        killedMutants = row["killedM"]
        # find total mutants
        report=os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+exeId,"mutations.csv")
        # print report
        if not os.path.isfile(report):
            print "Missing report "+report
            exit()
        totalM = sum(1 for line in open(report))
        perc=float(killedMutants)/float(totalM)
        print perc
        finalRow=['CE',project,exeId,caller,callee,totalM,killedMutants,perc]
        tableWriter.writerow(finalRow)

#CR
with open(os.path.join(data_path, "killedM-C-R.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        project= row["project"]
        exeId = row["executionId"]
        caller = row["caller"]
        callee = row["callee"]
        killedMutants = row["killedM"]
        # find total mutants
        report=os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+exeId,"mutations.csv")
        # print report
        if not os.path.isfile(report):
            print "Missing report "+report
            exit()
        totalM = sum(1 for line in open(report))
        perc=float(killedMutants)/float(totalM)
        print perc
        finalRow=['CR',project,exeId,caller,callee,totalM,killedMutants,perc]
        tableWriter.writerow(finalRow)
# #C
# with open(os.path.join(data_path, "killedM-C.csv"), 'r') as _filehandler:
#     csv_file_reader = csv.DictReader(_filehandler)
#     for row in csv_file_reader:
#         project= row["project"]
#         exeId = row["execution_id"]
#         caller = row["caller_class"]
#         callee = row["callee_class"]
#         killedMutants = row["killedM"]
#         # find total mutants
#         report=os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+exeId,"mutations.csv")
#         # print report
#         if not os.path.isfile(report):
#             print "Missing report "+report
#             exit()
#         totalM = sum(1 for line in open(report))
#         perc=float(killedMutants)/float(totalM)
#         print perc
#         finalRow=['C',project,exeId,caller,callee,totalM,killedMutants,perc]
#         tableWriter.writerow(finalRow)
# #E
# with open(os.path.join(data_path, "killedM-E.csv"), 'r') as _filehandler:
#     csv_file_reader = csv.DictReader(_filehandler)
#     for row in csv_file_reader:
#         project= row["project"]
#         exeId = row["execution_id"]
#         caller = row["caller_class"]
#         callee = row["callee_class"]
#         killedMutants = row["killedM"]
#         # find total mutants
#         report=os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+exeId,"mutations.csv")
#         # print report
#         if not os.path.isfile(report):
#             print "Missing report "+report
#             exit()
#         totalM = sum(1 for line in open(report))
#         perc=float(killedMutants)/float(totalM)
#         print perc
#         finalRow=['E',project,exeId,caller,callee,totalM,killedMutants,perc]
#         tableWriter.writerow(finalRow)

# #R
# with open(os.path.join(data_path, "killedM-R.csv"), 'r') as _filehandler:
#     csv_file_reader = csv.DictReader(_filehandler)
#     for row in csv_file_reader:
#         project= row["project"]
#         exeId = row["execution_id"]
#         caller = row["caller_class"]
#         callee = row["callee_class"]
#         killedMutants = row["killedM"]
#         # find total mutants
#         report=os.path.join(data_path,"pit","evosuite-callee5",project+"-"+callee+"-"+exeId,"mutations.csv")
#         # print report
#         if not os.path.isfile(report):
#             print "Missing report "+report
#             exit()
#         totalM = sum(1 for line in open(report))
#         perc=float(killedMutants)/float(totalM)
#         print perc
#         finalRow=['R',project,exeId,caller,callee,totalM,killedMutants,perc]
#         tableWriter.writerow(finalRow)