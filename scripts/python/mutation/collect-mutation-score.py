import sys,os
import csv
from HTMLParser import HTMLParser

dir_path = os.path.dirname(os.path.realpath(__file__))

finishedCasesDir = os.path.join(dir_path,"..","..","..","data","rq2","mutation-scores.csv")
finishedCasesFile = open(finishedCasesDir,"wb")
finishedCasesWriter = csv.writer(finishedCasesFile)
fieldnames = ['tool', 'execution_id','project', 'caller_class', 'callee_class','type','covered_lines','total_lines','line_coverage_perc','killed_mutants','total_mutants','mutation_coverage_perc']
finishedCasesWriter.writerow(fieldnames)


with open(os.path.join(dir_path, "..","..","..", "subject_generator", "subjects.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        tool=row["tool"]
        project=row["project"]
        execution_id=row["execution_id"]
        caller_class=row["caller_class"]
        callee_class=row["callee_class"]

        if tool == "cling":
            pitestResultDir=os.path.join(dir_path,"..","..","..","data","rq2","pit",tool,project+"-"+caller_class+"-"+callee_class+"-"+execution_id)
        elif tool == "evosuite-callee5":
            pitestResultDir=os.path.join(dir_path,"..","..","..","data","rq2","pit",tool,project+"-"+callee_class+"-"+execution_id)
        elif tool == "evosuite-caller5":
            pitestResultDir=os.path.join(dir_path,"..","..","..","data","rq2","pit",tool,project+"-"+caller_class+"-"+callee_class+"-"+execution_id)
        else:
            print "Warning: "+tool+" is not supported!"

        htmlReport=os.path.join(pitestResultDir,"index.html")
        finalRow = [row['tool'], row['execution_id'], row['project'], row['caller_class'], row['callee_class'], row['type']]

        if os.path.exists(htmlReport):
            counter=0
            for line in open(htmlReport, "r"):
                if '<div class="coverage_bar">' in line:
                    # print "==>"+line
                    percentage=line.split('<td>')[1].split(" <div")[0][:-1]
                    number=line.split('<div class="coverage_legend">')[1].split("</div>")[0]
                    covered=number.split("/")[0]
                    total=number.split("/")[1]
                    finalRow.append(covered)
                    finalRow.append(total)
                    finalRow.append(percentage)
                    counter+=1
                    if counter >= 2:
                        break
            finishedCasesWriter.writerow(finalRow)
        else:
            finalRow.append(0)
            finalRow.append(190)
            finalRow.append(0)
            finalRow.append(0)
            finalRow.append(509)
            finalRow.append(0)
            finishedCasesWriter.writerow(finalRow)
        
finishedCasesFile.close()