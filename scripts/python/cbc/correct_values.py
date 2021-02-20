import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq1")
pit_path = os.path.join(data_path, "pit")
##### Functions #####
# Return detected tools
def get_tools(subjects):
    detected_tools = []
    with open(subjects, 'r') as _filehandler:
        csv_file_reader = csv.DictReader(_filehandler)
        for row in csv_file_reader:
            tool=row["tool"]
            if tool not in detected_tools:
                detected_tools.append(tool)
    return detected_tools


def find_total_cb(cbc_coverage_file_dir, project, execution_id, caller_class, callee_class):
    with open(cbc_coverage_file_dir, 'r') as _filehandler:
        csv_file_reader = csv.DictReader(_filehandler)
        for row in csv_file_reader:
            if row["project"] == project and row["execution_id"] == execution_id and row["caller_class"] == caller_class and row["callee_class"] == callee_class:
                if row["total_cb"] != "-1":
                    return row["total_cb"]

##### Main script #####
# First, we collect the available tools
subjects_file_dir=os.path.join(root_path, "subject_generator", "subjects.csv")
detected_tools = get_tools(subjects_file_dir)

#Prepare new CSV writer
newCBCDir = os.path.join(data_path,"corrected-cbc-coverage.csv")
newCBCFile = open(newCBCDir,"wb")
newCBCWriter = csv.writer(newCBCFile)

fieldnames = ['tool','execution_id','project', 'caller_class', 'callee_class','total_cb','covered_cb']
newCBCWriter.writerow(fieldnames)

cbc_coverage_file_dir=os.path.join(data_path,"cbc-coverage.csv")
# open CBC scores CSV file
with open(cbc_coverage_file_dir, 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        tool=row["tool"]
        project=row["project"]
        execution_id=row["execution_id"]
        caller_class=row["caller_class"]
        callee_class=row["callee_class"]

        corrected_row = [tool, execution_id, project, caller_class, callee_class]

        total_cb=row["total_cb"]
        covered_cb=row["covered_cb"]

        if str(total_cb)!= "-1" and str(covered_cb)!= "-1":
            corrected_row.append(total_cb)
            corrected_row.append(covered_cb)
        else:
            if str(total_cb)== "-1":
                found_total_cb = find_total_cb(cbc_coverage_file_dir, project, execution_id, caller_class, callee_class)
                corrected_row.append(found_total_cb)
            else:
                corrected_row.append(total_cb)

            if str(covered_cb)== "-1":
                corrected_row.append("0")
            else:
                corrected_row.append(covered_cb)
        
        newCBCWriter.writerow(corrected_row)
newCBCFile.close()


os.remove(cbc_coverage_file_dir)
os.rename(newCBCDir,cbc_coverage_file_dir)

        