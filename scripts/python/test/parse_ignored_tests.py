import sys, os, csv, glob

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
tests_path = os.path.join(root_path,"results")
subjects_file_dir= os.path.join(root_path, "subject_generator", "subjects.csv")

##### Functions #####
# Return detected tools
def get_test_files(test_dir,is_randoop):
    fname = []
    for root,d_names,f_names in os.walk(test_dir):
        for f in f_names:
            if not is_randoop and f.endswith("_ESTest.java"):
                fname.append(os.path.join(root, f))
            elif is_randoop:
                if f == "RegressionTest.java" or f == "ErrorTest.java" or (not f.endswith(".java")):
                    continue
                
                if f.startswith("RegressionTest") or f.startswith("ErrorTest"):
                    fname.append(os.path.join(root, f))


    return (fname)

def get_number_of_ignored_tests(test_file_dir):
    test_file = open(test_file_dir,'r')
    lines = test_file.readlines()

    number_of_tests = 0
    number_of_ignored_tests = 0
    for line in lines:
        if "@Test" in line:
            number_of_tests+=1
            continue
        
        if "@Ignore" in line:
            number_of_ignored_tests+=1
            continue
    
    if number_of_tests < number_of_ignored_tests:
        print("Error: Number of ignored tests are more than test cases:"+str(number_of_ignored_tests)+"/"+str(number_of_tests))
        exit()

    result = [number_of_ignored_tests,number_of_tests]
    return result

def save_to_csv(CSVWriter,tool,test_file,number_of_ignored_tests):
    ignored_tests = number_of_ignored_tests[0]
    total_tests = number_of_ignored_tests[1]

    new_row = [tool,test_file,ignored_tests,total_tests]
    CSVWriter.writerow(new_row)
    return

def get_tool(dir):
    tool = "cling"
    if dir.endswith("/randoop5"):
        tool = "randoop"
    elif dir.endswith("/evosuite5"):
        tool = "evosuite"
    return tool

def update_final_results(final_results,tool,number_of_ignored_tests):
    current_ignored = final_results[tool][0]
    current_total = final_results[tool][1]

    new_ignored = current_ignored + number_of_ignored_tests[0]
    new_total = current_total + number_of_ignored_tests[1]
    final_results[tool] = [new_ignored,new_total]

##### Main Script #####
# Prepare output CSV file
CSVFileDir = os.path.join(dir_path,"..","..","..","data","ignored_tests.csv")
CSVFile = open(CSVFileDir,"wb")
CSVWriter = csv.writer(CSVFile)

fieldnames = ["tool","test_file","ignored_tests","total_tests"]
CSVWriter.writerow(fieldnames)

# Initialize final dictionary
final_results = {}
# Get tools
tool_dirs = [os.path.join(tests_path, o) for o in os.listdir(tests_path) 
                    if os.path.isdir(os.path.join(tests_path,o))]

# Analyze tests for each tool
for dir in tool_dirs:
    print ("Current dir: "+dir)
    is_randoop = (dir.endswith("randoop5")) 
    tests = get_test_files(dir,is_randoop)
    tool = get_tool(dir)
    final_results[tool] = [0,0]
    print ("Number of detected test files: "+str(len(tests)))
    for test_file in tests:
        number_of_ignored_tests = get_number_of_ignored_tests(test_file)
        save_to_csv(CSVWriter,tool,test_file,number_of_ignored_tests)
        update_final_results(final_results,tool,number_of_ignored_tests)
        print (final_results)

CSVFile.close()


percentage = {}
for tool in final_results.keys():
    percentage[tool] = final_results[tool][0]/final_results[tool][0]

print("Final percentage Report:")
print(percentage)
