import sys,os
import csv
import shutil

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq3")


exceptionListDir = os.path.join(data_path,"exception_list.csv")
exceptionListFile = open(exceptionListDir,"wb")
exceptionListWriter = csv.writer(exceptionListFile)
fieldnames = ['tool', 'execution_id','project', 'caller_class', 'callee_class','type', 'testName', 'exception_type']
exceptionListWriter.writerow(fieldnames)

with open(os.path.join(root_path, "subject_generator", "subjects.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        tool=row["tool"]
        project=row["project"]
        execution_id=row["execution_id"]
        if tool == "cling":
            caller_class=row["caller_class"]
            callee_class=row["callee_class"]
            generatedTestDirName=project+"-"+caller_class+"-"+callee_class+"-"+execution_id
            generatedTestRoot=os.path.join(root_path,"results","cling",generatedTestDirName)
        elif tool == "evosuite-caller5":
            target_class=row["caller_class"]
            generatedTestDirName=project+"-"+target_class+"-"+execution_id
            generatedTestRoot=os.path.join(root_path,"results","evosuite5",generatedTestDirName)
        else:
            target_class=row["callee_class"]
            generatedTestDirName=project+"-"+target_class+"-"+execution_id
            generatedTestRoot=os.path.join(root_path,"results","evosuite5",generatedTestDirName)
        
        
        print generatedTestRoot
        for root, dirs, files in os.walk(generatedTestRoot):
            for file in files:
                if file.endswith("_ESTest.java"):
                    # open file
                    pattern='fail("Expecting exception: '
                    testInitPattern="public void test"
                    testNumber=-1
                    hasException=False
                    for line in open(os.path.join(root, file),'r'):
                        if testInitPattern in line:
                            testNumber+=1
                        if pattern in line:
                            hasException=True
                            exceptionType=line.split(pattern)[1].split('");')[0]
                            print "tool: "+tool+" test"+str(testNumber)+"() -> "+exceptionType
                            finalRow = [row['tool'], row['execution_id'], row['project'], row['caller_class'], row['callee_class'], row['type'], "test"+str(testNumber), exceptionType]
                            exceptionListWriter.writerow(finalRow)
                    if hasException:
                        if tool == "cling":
                            dirName=root.split(tool+"/")[1].split("/")[0]
                        else:
                            dirName=root.split("evosuite5/")[1].split("/")[0] 
                        classPath=root.split(dirName)[1][1:]
                        src=os.path.join(root.split(dirName)[0],dirName)
                        if tool == "cling":
                            dst= os.path.join(data_path, "tests-with-exception",tool+"-"+generatedTestDirName)
                        else:
                            dst= os.path.join(data_path, "tests-with-exception","evosuite5-"+generatedTestDirName)
                        if os.path.isdir(dst):
                            shutil.rmtree(dst)
                        shutil.copytree(src, dst)


                        src=os.path.join(root, file)
                        # Remove .class files
                        for root2, dirs2, files2 in os.walk(dst):
                            for file2 in files2:
                                if file2.endswith(".class"):
                                    compiledFile = os.path.join(root2,file2)
                                    os.remove(compiledFile)
                        # Remove try/catches
                        classToModify=os.path.join(dst,classPath,file)
                        with open(classToModify, 'r') as file:
                        # read a list of lines into data
                            data = file.readlines()
                        
                        modifiedData = []
                        inCatch=False
                        for line in data:
                            if inCatch:
                                if " }\n" in line:
                                    inCatch=False
                                modifiedData.append("//"+line)
                                continue
                            
                            if "} catch(" in line:
                                inCatch=True
                                modifiedData.append("//"+line)
                                continue

                            if "fail(" in line:
                                modifiedData.append("//"+line)
                                continue

                            if "try {" in line:
                                modifiedData.append("//"+line)
                                continue
                            modifiedData.append(line)
                        with open(classToModify, 'w') as file:
                            file.writelines(modifiedData)

                            
                            


                        
                    
            