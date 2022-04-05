import os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
csvDir = os.path.join(dir_path,"selected-class-pairs.csv")

tools = ["cling","evosuite-callee5","evosuite-caller5","randoop"]
# tools = ["randoop"]

rounds = range(1, 21)

fieldnames = ['tool', 'execution_id', 'project', 'caller_class', 'callee_class', 'type']


csvFileDir = os.path.join(dir_path,"subjects.csv")
csvFile = open(csvFileDir,"wb")
writer = csv.writer(csvFile)

writer.writerow(fieldnames)


for execution_id in rounds:
    with open(csvDir, 'r') as _filehandler:
        csv_file_reader = csv.DictReader(_filehandler)
        print(execution_id)
        for row in csv_file_reader:
            case=row['case']
            print(case)
            caller=row['caller']
            callee=row['callee']
            type=row['type']
            for tool in tools:
                tempRow = [tool, execution_id, case, caller, callee, type]
                print(tempRow)
                writer.writerow(tempRow)


csvFile.close()
