import sys,os
import csv
import mmap

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq3")


def saveTrace(trace, testNumber, logFileDir, logFileDirName):
    dir_path = os.path.dirname(os.path.realpath(__file__))
    root_path = os.path.join(dir_path,"..","..","..")
    data_path = os.path.join(root_path,"data","rq3")
    
    filename=os.path.join(data_path,"stack-traces","interesting",logFileDirName+".txt")
    if os.path.exists(filename):
        append_write = 'a' # append if already exists
    else:
        append_write = 'w' # make a new file if not

    with open(filename, append_write) as f:
        f.write("----------\n")
        f.write(testNumber+"\n")
        for item in trace:
            f.write("%s\n" % item)

def checkTrace(trace,testNumber,logFileDir,logFileDirName,caller_class,callee_class,rounds):
    dir_path = os.path.dirname(os.path.realpath(__file__))
    root_path = os.path.join(dir_path,"..","..","..")
    data_path = os.path.join(root_path,"data","rq3")
    if len(trace) < 2: # We should have at least two frames for caller and callee class
        return
    containsCaller = False
    for fr in trace:
        if caller_class in fr:
            containsCaller = True

    containsCallee = False
    for fr in trace:
        if callee_class in fr:
            containsCallee = True

    if not containsCaller or not containsCallee:
        return
    exceptionType=trace[0].split(":")[0]
    # check evosuite5 and 10 logs
    for evoBudg in ["evosuite5","evosuite10"]:
        logFileDirWithoutRound = '-'.join(logFileDir.split('-')[:-1])
        print logFileDirWithoutRound
        # check in all pf the 10
        for ro in range(1,10+1):
            traceCounter = 0
            newLogFileDir=logFileDirWithoutRound+"-"+str(ro)
            if os.path.isfile(os.path.join(newLogFileDir,evoBudg+".txt")):
                for line in open(os.path.join(newLogFileDir,evoBudg+".txt")):
                    if exceptionType in line:
                        traceCounter+=1
                        continue
                    
                    if traceCounter > 0:
                        if "_ESTest" in line:
                            # trace is finished and it is similar
                            # we should skip the given trace trace this trace
                            traceCounter = 0
                            return
                            
                        
                        if len(trace) <= traceCounter:
                            traceCounter = 0
                            continue
                        print "HERE!!"+str(line)
                        if "at " not in line:
                            traceCounter = 0
                            continue
                        # exit()
                        evosuiteFrame=line.split("at ")[1].rstrip()
                        if trace[traceCounter] != evosuiteFrame:
                            traceCounter = 0
                            continue

                        traceCounter+=1
    # we could not find sth similar in evosuite5 or evosuite10 we have some cool stack trace :D So, we save it.
    saveTrace(trace,testNumber, logFileDir, logFileDirName)
    
            

            
            





with open(os.path.join(root_path, "subject_generator", "subjects.csv"), 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        tool=row["tool"]
        if tool != "cling":
            continue
        project=row["project"]
        execution_id=row["execution_id"]
        caller_class=row["caller_class"]
        callee_class=row["callee_class"]
        print "tool: "+tool+"--> "+project+"-"+caller_class+"-"+callee_class+"-"+execution_id
        logFileDirName=project+"-"+caller_class+"-"+callee_class+"-"+execution_id
        logFileDir=os.path.join(data_path,"stack-traces",logFileDirName)
        logFilePath=os.path.join(logFileDir,tool+".txt")
        if not os.path.isfile(logFilePath):
            continue
        logFile = open(logFilePath)
        # check if log file of cling contains name of callee class or not
        s = mmap.mmap(logFile.fileno(), 0, access=mmap.ACCESS_READ)
        if s.find(callee_class) == -1:
            print('No target class in log file of Cling: '+logFileDirName)
            continue

        # Here, we are sure that we have callee class name in Cling log file
        frameCounter = -1
        finished = True
        testNumber =""
        trace = []
        print "**&&^^"
        for line in logFile:
            if ") test" in line:
                frameCounter=0
                testNumber=line.split(") ")[1].split("(")[0]
                continue
            if frameCounter == -1:
                continue
            elif frameCounter == 0:
                # exception type
                if "evosuite" in line:
                    finished = True
                    trace = []
                else:
                    finished = False
                    trace = [line.rstrip()]
                frameCounter+=1
                continue
                    
                
            
            if frameCounter > 0 and not finished:

                if "at " not in line:
                    # This one is not a frame. skip it
                    continue
                
                # check if we are in test frame or not
                if "_ESTest" in line:
                    finished = True 
                    checkTrace(trace,testNumber,logFileDir,logFileDirName,caller_class,callee_class,10)
                    continue
                # we are in an interesting frame
                print line+"~"+str(frameCounter)
                frame=line.split("at ")[1].rstrip()
                trace.append(frame)
                frameCounter+=1

                
                



            
            
            

