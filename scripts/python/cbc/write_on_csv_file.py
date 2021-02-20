import sys
import os
import fcntl
import csv

execution_id=sys.argv[1]
print execution_id
project=sys.argv[2]
caller_class=sys.argv[3]
callee_class=sys.argv[4]
log_dir=sys.argv[5]
tool=sys.argv[6]


dir_path = os.path.dirname(os.path.realpath(__file__))
out_dir = os.path.join(dir_path, "..","..","..","data","rq1","cbc-coverage.csv")



### functions
def write_on_csv_file(csv_result,csv_file_dir):
    title_order = [
                   'tool',
                   'execution_id',
                   'project',
                   'caller_class',
                   'callee_class',
                   'total_cb',
                   'covered_cb'
                   ]

    fields = []

    for cell in title_order:
        if cell in csv_result.keys():
            fields.append(csv_result[cell])
        else:
            fields.append("")

    with open(csv_file_dir, "a") as  g:
        fcntl.flock(g, fcntl.LOCK_EX)
        writer = csv.writer(g)
        writer.writerow(fields)
        fcntl.flock(g, fcntl.LOCK_UN)
###




csv_result = {
                   'tool': tool,
                   'execution_id': execution_id,
                   'project': project,
                   'caller_class': caller_class,
                   'callee_class': callee_class,
                   'total_cb': -1,
                   'covered_cb': -1
                   }

try:
    with open(log_dir, "r") as ins:
        for stdout_line in ins:
            if  "Total number of coupled branches goals:" in stdout_line:
                splitted_line_1 = stdout_line.split(": ")
                csv_result["total_cb"] = int(splitted_line_1[1])
            elif  "Number of covered coupled branches by test suite:" in stdout_line:
                splitted_line_1 = stdout_line.split(": ")
                csv_result["covered_cb"] = int(splitted_line_1[1])
except IOError:
    print("File not accessible")

write_on_csv_file(csv_result,out_dir)