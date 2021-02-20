import sys
import os
import csv

execution_id=sys.argv[1]
project=sys.argv[2]
caller_class=sys.argv[3]
callee_class=sys.argv[4]
tool=sys.argv[5]

dir_path = os.path.dirname(os.path.realpath(__file__))
out_dir = os.path.join(dir_path, "..","..","..","data","rq1","cbc-coverage.csv")
csv_file = csv.reader(open(out_dir, "r"), delimiter=",")


#loop through the csv list
for row in csv_file:
    #if current rows 2nd value is equal to input, print that row
    if tool == row[0] and execution_id == row[1] and project == row[2] and caller_class == row[3] and callee_class == row[4]:
         print "1"
         exit()

print "0"