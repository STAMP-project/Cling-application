import sys,os
import csv
from HTMLParser import HTMLParser

def find_value(execution_id,project,caller_class,callee_class,index):
    finishedCasesDir = os.path.join(dir_path,"..","..","..","data","rq2","mutation-scores.csv")
    csv_file = csv.reader(open(finishedCasesDir, "r"), delimiter=",")
    #loop through the csv list
    for row in csv_file:
        if len(row) < 5 or len(row) < index +1:
            continue
        if row[0] == "cling" and row[1] == execution_id and row[2] == project and row[3] == caller_class and row[4] == callee_class:
            # print row , index
            return row[index]


def find_total_lines(execution_id,project,caller_class,callee_class):
    index=7
    return find_value(execution_id,project,caller_class,callee_class,index)


def find_total_mutants(execution_id,project,caller_class,callee_class):
    index=10
    return find_value(execution_id,project,caller_class,callee_class,index)


append=False
if len(sys.argv) > 1 and sys.argv[1] == "-append":
    append=True

dir_path = os.path.dirname(os.path.realpath(__file__))

finishedCasesDir = os.path.join(dir_path,"..","..","..","data","rq2","mutation-scores.csv")
if append:
    finishedCasesFile = open(finishedCasesDir,"a")
else:
    finishedCasesFile = open(finishedCasesDir,"wb")

finishedCasesWriter = csv.writer(finishedCasesFile)
fieldnames = ['tool', 'execution_id','project', 'caller_class', 'callee_class','type','covered_lines','total_lines','line_coverage_perc','killed_mutants','total_mutants','mutation_coverage_perc']
if not append:
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
        elif tool == "evosuite-callee5" or tool == "randoop-callee5":
            pitestResultDir=os.path.join(dir_path,"..","..","..","data","rq2","pit",tool,project+"-"+callee_class+"-"+execution_id)
        elif tool == "evosuite-caller5" or tool == "randoop-caller5":
            pitestResultDir=os.path.join(dir_path,"..","..","..","data","rq2","pit",tool,project+"-"+caller_class+"-"+callee_class+"-"+execution_id)
        elif tool == "randoop":
            pitestResultDir=os.path.join(dir_path,"..","..","..","data","rq2","pit","randoop10",project+"-"+caller_class+"-"+callee_class+"-"+execution_id)
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
        elif not tool.startswith("randoop") or tool == "randoop":
            finalRow.append(0)
            finalRow.append(190)
            finalRow.append(0)
            finalRow.append(0)
            finalRow.append(509)
            finalRow.append(0)
            finishedCasesWriter.writerow(finalRow)
        else:
            # find total lines and total mutants from cling results
            total_lines=find_total_lines(row['execution_id'],row['project'],row['caller_class'],row['callee_class'])
            total_mutants=find_total_mutants(row['execution_id'],row['project'],row['caller_class'],row['callee_class'])
            finalRow.append(0)
            finalRow.append(total_lines)
            finalRow.append(0)
            finalRow.append(0)
            finalRow.append(total_mutants)
            finalRow.append(0)
            finishedCasesWriter.writerow(finalRow)
        
finishedCasesFile.close()