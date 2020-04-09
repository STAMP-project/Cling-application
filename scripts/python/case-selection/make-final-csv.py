import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))

root=os.path.join(dir_path,"..","..","..", "temp-csvs")

callCSVFileDir = os.path.join(dir_path,"..","..","..","data","filtered-class-pairs.csv")
callCSVFile = open(callCSVFileDir,"wb")
CallWriter = csv.writer(callCSVFile)

# subsuperCSVFileDir = os.path.join(dir_path,"supSuper.csv")
# subsuperCSVFile = open(subsuperCSVFileDir,"wb")
# subsuperWriter = csv.writer(subsuperCSVFile)

fieldnames = ['project', 'caller_class','caller_complexity', 'callee_class', 'callee_complexity','call_sites','type']
CallWriter.writerow(fieldnames)
for path, subdirs, files in os.walk(root):
    for name in files:
        if name.endswith("method-calls-coupling.csv"):
            print "call-> "+os.path.join(path,name)
            project=path.split("/")[-1]
            print "*** "+project

            # # read csv rows
            with open(os.path.join(path, name), 'r') as _filehandler:
                csv_file_reader = csv.DictReader(_filehandler)
                for row in csv_file_reader:
                    score1 = int(row['Class1CallScore'])
                    score2 = int(row['Class2CallScore'])
                    if score1 == score2 and score1 == 0:
                        continue
                    if score1 >= score2:
                        print "winner is class 1"
                        caller=row['Class1Name']
                        caller_complexity= row['Class1ComplexityScore']
                        callee=row['Class2Name']
                        callee_complexity= row['Class2ComplexityScore']
                        call_sites= score1
                    else:
                        print "winner is class 2"
                        caller=row['Class2Name']
                        caller_complexity= row['Class2ComplexityScore']
                        callee=row['Class1Name']
                        callee_complexity= row['Class1ComplexityScore']
                        call_sites= score2

            #
                    if caller is not None:
                        print "Caller-> "+caller
                        print "Callee-> "+callee
                        finalRow = [project, caller, caller_complexity, callee,callee_complexity, call_sites,"call"]
                        CallWriter.writerow(finalRow)


        elif name.endswith("super-sub-classes-coupling.csv"):
            print "subsuper-> "+os.path.join(path, name)
            project=path.split("/")[-1]
            print "*** "+project
            # # read csv rows
            with open(os.path.join(path, name), 'r') as _filehandler:
                csv_file_reader = csv.DictReader(_filehandler)
                for row in csv_file_reader:
                    subClassScore = int(row['subClassScore'])
                    superClassScore = int(row['superClassScore'])
                    if subClassScore == superClassScore and subClassScore == 0:
                        continue
                    if subClassScore >= superClassScore:
                        print "winner is sub class"
                        caller=row['subClass']
                        caller_complexity= row['subClassComplexityScore']
                        callee=row['superClass']
                        callee_complexity= row['superClassComplexityScore']
                        call_sites=subClassScore
                    else:
                        print "winner is super class"
                        caller=row['superClass']
                        caller_complexity= row['superClassComplexityScore']
                        callee=row['subClass']
                        callee_complexity= row['subClassComplexityScore']
                        call_sites=superClassScore
                    finalRow = [project, caller, caller_complexity, callee,callee_complexity, call_sites,"sub/super"]
                    CallWriter.writerow(finalRow)


callCSVFile.close()
# subsuperCSVFile.close()
