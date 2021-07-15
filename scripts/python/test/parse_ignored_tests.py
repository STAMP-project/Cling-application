import sys, os, csv, glob

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
tests_path = os.path.join(root_path,"results")
subjects_file_dir= os.path.join(root_path, "subject_generator", "subjects.csv")

##### Functions #####
# Return detected tools
def get_test_file(test_dir):
    print test_dir
    fname = []
    for root,d_names,f_names in os.walk(test_dir):
        for f in f_names:
            if f.endswith("_ESTest.java"):
		        fname.append(os.path.join(root, f))

	print fname
    sys.exit()

# Loop on subjects
with open(subjects_file_dir, 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        tool=row["tool"]
        project=row["project"]
        execution_id=row["execution_id"]
        caller_class=row["caller_class"]
        callee_class=row["callee_class"]
        current_test_dir = os.path.join(tests_path, tool, project+"-"+caller_class+"-"+callee_class+"-"+execution_id+"/")
        test_file = get_test_file(current_test_dir)
        # print test_file
