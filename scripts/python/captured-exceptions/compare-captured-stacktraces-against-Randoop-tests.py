import sys,os

#check each of the interesting stacktraces to see if we have them in randoop or not


def checkTrace(trace,current_directory_without_execution_id,against):
    exists=False
    # Check all of the rounds
    for execId in range(1,20+1):
        current_directory=current_directory_without_execution_id+"-"+str(execId)
        #Randoop_callee
        against_log = os.path.join(current_directory,against+".txt")
        if not os.path.exists(against_log):
            continue
        # Check each stacktrace with the given trace
        with open(against_log) as file_in:
            monitor=False
            index=0
            for line in file_in:
                if ") test" in line:
                    monitor=True
                    index=0
                    continue
                elif monitor:
                    if index == len(trace):
                        return True
                    elif index < len(trace):
                        if "at " in line:
                            modified_line = line.split("at ")[1]
                        else:
                            modified_line = line
                        if modified_line.strip() == trace[index].strip():
                            # print "bingo "+modified_line.strip()+" VS. "+trace[index].strip()
                            index+=1
                        else:
                            print "X in "+against_log+" -->"+line.strip()+" VS. "+trace[index].strip()
                            monitor=False
                    else:
                        print "ERROR!"
                else:
                    continue
    # If the execution raches here, we could not find any match, so we return false
    return False





dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq3")


stackTraces_path = os.path.join(data_path,"stack-traces")
# First lets loop on interesting stacktraces
interesting_stackTraces_path = os.path.join(stackTraces_path,"interesting")

for filename in os.listdir(interesting_stackTraces_path):
    if filename.endswith(".txt"):
        basename=filename[:-4]
        arr=basename.split("-")
        project=arr[0]
        caller=arr[1]
        callee=arr[2]
        execution_id=arr[3]
        print "project: "+project+", caller: "+caller+", callee: "+callee+", execution_id: "+execution_id

        # ToDo: Loop on stacktraces in interesting files

        with open(os.path.join(interesting_stackTraces_path,filename)) as file_in:
            current_stacktrace = []
            for line in file_in:
                # print line + str(len(current_stacktrace))
                # print line.strip()
                if "----------" in line and len(current_stacktrace) > 1:
                    # TODO: end of the stacktrace. Lets check randoop can capture this stacktrace or not
                    current_directory_without_execution_id = os.path.join(stackTraces_path,project+"-"+caller+"-"+callee)
                    exists_in_randoop_callee=checkTrace(current_stacktrace,current_directory_without_execution_id,"randoop-callee5")
                    exists_in_randoop_caller=checkTrace(current_stacktrace,current_directory_without_execution_id,"randoop-caller5")
                    if exists_in_randoop_callee or exists_in_randoop_caller:
                        print current_stacktrace
                        print exists_in_randoop_callee
                        print exists_in_randoop_caller
                        print "------------"
                elif line.startswith("test"):
                    current_stacktrace = []
                    # We are begining a new stacktrace
                elif len(line.strip()) > 0:
                    #Skip the empty lines
                    current_stacktrace.append(line)
                

        # Now, we should check if Randoop throws any exception for this caller and callee
        

        
    

        continue