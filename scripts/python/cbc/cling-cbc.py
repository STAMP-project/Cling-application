import sys,os
import csv
from HTMLParser import HTMLParser




dir_path = os.path.dirname(os.path.realpath(__file__))
finishedCasesDir = os.path.join(dir_path,"..","..","..","data","rq1","cbc-coverage.csv")
finishedCasesFile = open(finishedCasesDir,"wb")
finishedCasesWriter = csv.writer(finishedCasesFile)
fieldnames = ['tool', 'execution_id','project', 'caller_class', 'callee_class', 'total_cb', 'covered_cb']
finishedCasesWriter.writerow(fieldnames)
with open(os.path.join(dir_path, "..","..","..", "subject_generator", "subjects.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        finalRow = []
        tool=row["tool"]
        if tool != "cling":
            continue
        finalRow.append(tool)
        execution_id=row["execution_id"]
        finalRow.append(execution_id)
        project=row["project"]
        finalRow.append(project)
        caller_class=row["caller_class"]
        finalRow.append(caller_class)
        callee_class=row["callee_class"]
        finalRow.append(callee_class)
        testGenerationLog=os.path.join(dir_path,"..","..","..","logs","cling",project+"-"+caller_class+"-"+callee_class+"-"+execution_id+"-out.txt")
        totalCB="-1"
        coveredCB=0
        for logLine in open(testGenerationLog, "r"):
            if "Number of covered goals are " in logLine:
                tempArr=logLine.split('Number of covered goals are ')[1].split('/')
                if coveredCB != int(tempArr[0]):
                    coveredCB=int(tempArr[0])
            elif "The number of goals are" in logLine:
                totalCB=logLine.split('The number of goals are ')[1].split(':')[0]
        finalRow.append(totalCB)
        finalRow.append(coveredCB)
        finishedCasesWriter.writerow(finalRow)



