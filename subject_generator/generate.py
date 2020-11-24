import os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
csvDir = os.path.join(dir_path,"selected-class-pairs.csv")

tools = ["cling","evosuite-callee5","evosuite-caller5","randoop-callee5","randoop-caller5"]

rounds = range(1, 21)

fieldnames = ['tool', 'execution_id', 'project', 'caller_class', 'callee_class', 'type']


csvFileDir = os.path.join(dir_path,"subjects.csv")
csvFile = open(csvFileDir,"wb")
writer = csv.writer(csvFile)

writer.writerow(fieldnames)

with open(csvDir, 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        case=row['case']
        caller=row['caller']
        callee=row['callee']
        type=row['type']
        for execution_id in rounds:
            for tool in tools:
                tempRow = [tool, execution_id, case, caller, callee, type]
                writer.writerow(tempRow)


csvFile.close()
