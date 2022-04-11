import sys,os
import csv

dir_path = os.path.dirname(os.path.realpath(__file__))
root_path = os.path.join(dir_path,"..","..","..")
data_path = os.path.join(root_path,"data","rq2")
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



# Returns the html report in the given report dir.
# Returns None if the report is not available.
def find_html_report(pit_report_dir):
    if not os.path.isdir(pit_report_dir):
        return None
    
    available_directories = []
    for content in os.listdir(pit_report_dir):
        content_dir = os.path.join(pit_report_dir,content)
        if os.path.isdir(content_dir):
            available_directories.append(content_dir)
    
    if len(available_directories) > 1:
        print "Error: more than one directory here: "+available_directories
        exit()
    
    available_reports = []
    for content in os.listdir(available_directories[0]):
        content_dir = os.path.join(available_directories[0],content)
        if os.path.isfile(content_dir) and content.endswith(".java.html"):
            available_reports.append(content_dir)
    
    if len(available_reports) > 1:
        print "Error: more than one report here: "+available_reports
        exit()
    elif len(available_reports) == 0:
        return None
    else:
        return available_reports[0]

def get_pit_report_dir(pit_path, tool, project, caller_class, callee_class, execution_id):
    if "-callee" in tool :
        # It is a case applying the given tool only on the callee class
        return os.path.join(pit_path, tool, project+"-"+callee_class+"-"+execution_id)
    else:
        # It is a case applying the given tool on either only caller or both of the classes
        return os.path.join(pit_path ,tool, project+"-"+caller_class+"-"+callee_class+"-"+execution_id)
        
def find_an_available_report(detected_tools, project, caller_class, callee_class, pit_path):
    for tool in detected_tools:
        # Find an available report
        for execution_id in range(1,21):
            pit_report_dir = get_pit_report_dir(pit_path, tool, project, caller_class, callee_class, str(execution_id))
            report=find_html_report(pit_report_dir)
            
            if report is not None:
                return report
    return None

def find_an_available_index_page(detected_tools, project, caller_class, callee_class, pit_path):
    for tool in detected_tools:
        # Find an available report
        for execution_id in range(1,21):
            pit_report_dir = get_pit_report_dir(pit_path, tool, project, caller_class, callee_class, str(execution_id))
            index_html=find_index_html(pit_report_dir)
            
            if index_html is not None:
                return index_html
    return None

def get_lines_list_from_report(report):
    lines = {}

    with open(report) as report_in:
        checking_a_line=False
        is_na = False
        line_counter=0

        for current_html_line in report_in:
            line_counter+=1
            if "<tr><td></td><td></td><td><h2>Mutations</h2></td></tr>" in current_html_line:
                break

            if "<tr>" in current_html_line and  "</tr>" not in current_html_line:
                if checking_a_line:
                    print "Error! we are still checking previous line in report "+ report+ " line "+str(line_counter)+": "+ current_html_line
                    exit()

                checking_a_line= True
                is_na = False
                covered= False
                
            elif "</tr>" in current_html_line and "<tr>" not in current_html_line:
                if not checking_a_line:
                    print "Error! we are not working on a line"
                    exit()

                checking_a_line=False
            elif checking_a_line and "<td class='na'>" in current_html_line:
                is_na = True
            elif checking_a_line and "<td class='covered'>" in current_html_line:
                covered = True
            elif checking_a_line and current_html_line.strip().isdigit() and not is_na:
                line_number = current_html_line.strip()
                if line_number in lines.keys():
                    print "ERROR: line is already available!"
                    exit()
                lines[line_number] = covered
        if len(lines) == 0:
            return None
        else:
            return(lines)

def get_index_line_coverages_data_from_index(index_page):

    next_line_contains_line_coverage_data = False
    with open(index_page) as report_in:
        for current_html_line in report_in:
            if "<td>1</td>" in current_html_line:
                next_line_contains_line_coverage_data = True
            elif next_line_contains_line_coverage_data:
                if "coverage_bar" not in current_html_line:
                    print "Error! there is no coverage bar!"
                    exit()
                temp_str = current_html_line.split('<div class="coverage_legend">')[1].split("</div>")[0]
                
                return temp_str.split("/")
                

                
                
def get_index_line_coverages_data(detected_tools, project, caller_class, callee_class, pit_path):
    index_page = find_an_available_index_page(detected_tools, project, caller_class, callee_class, pit_path)
    
    if index_page == None:
        print "Couldn't find index html file for "+ caller_class + callee_class
        exit()

    return get_index_line_coverages_data_from_index(index_page)

def get_lines_list(detected_tools, project, caller_class, callee_class, pit_path):
    report = find_an_available_report(detected_tools, project, caller_class, callee_class, pit_path)

    if report == None:
        print "Couldn't find report for "+ caller_class + callee_class
        exit()
    
    # Here, we know that we have an html report. So, we just need to parse the line numbers from it.
    return get_lines_list_from_report(report)

def find_index_html(pit_report_dir):
    result = os.path.join(pit_report_dir,"index.html")
    if os.path.isfile(result):
        return result
    
    return None


def get_covered_lines(total_lines):
    if total_lines == None:
        return None
    covered_lines = []
    for line_number in total_lines:
        if total_lines[line_number]:
            covered_lines.append(line_number)
    
    return covered_lines

def save_line_coverage(lineCoverageWriter, tool, project, caller_class, callee_class, execution_id,number_of_covered_lines, number_of_total_lines):
    row = [tool, execution_id, project, caller_class, callee_class, number_of_covered_lines, number_of_total_lines]
    lineCoverageWriter.writerow(row)
    
    
def save_line_statuses(root_path, tool, project, caller_class, callee_class, execution_id,total_lines,allLinesWriter):
    if total_lines is None:
        return None

    lines_status_file_dir = os.path.join(root_path,"data","line-coverage","lines", tool+"-"+project+"-"+caller_class+"-"+callee_class+"-"+execution_id+".csv")
    line_status_file = open(lines_status_file_dir,"wb")
    line_status_writer = csv.writer(line_status_file)

    fieldnames = ['line_number', 'covered']
    line_status_writer.writerow(fieldnames)
    
    for line_number in total_lines:
        row = [line_number,total_lines[line_number]]
        line_status_writer.writerow(row)
        row = [tool,execution_id, project, caller_class,callee_class,line_number,total_lines[line_number]]
        allLinesWriter.writerow(row)

    line_status_file.close()


##### Main script #####
# First, we collect the available tools
subjects_file_dir=os.path.join(dir_path, root_path, "subject_generator", "subjects.csv")
detected_tools = get_tools(subjects_file_dir)
# Then, we prepare csvwriters of line coverage scores and total_statuses
lineCoverageDir = os.path.join(root_path,"data","line-coverage","line-coverage.csv")
lineCoverageFile = open(lineCoverageDir,"wb")
lineCoverageWriter = csv.writer(lineCoverageFile)

allLinesDir = os.path.join(root_path,"data","line-coverage","all-lines.csv")
allLinesFile = open(allLinesDir,"wb")
allLinesWriter = csv.writer(allLinesFile)


fieldnames = ['tool','execution_id','project', 'caller_class', 'callee_class','covered_lines','total_lines']
lineCoverageWriter.writerow(fieldnames)
fieldnames = ['tool','execution_id','project', 'caller_class', 'callee_class','line_number', 'covered']
allLinesWriter.writerow(fieldnames)

totalCounter = 0
foundCounter = 0
# Next, we check the line coverage for each case
with open(subjects_file_dir, 'r') as _filehandler:
    csv_file_reader = csv.DictReader(_filehandler)
    for row in csv_file_reader:
        totalCounter+=1
        tool=row["tool"]
        tool = "randoop10" if tool == "randoop" else tool
        project=row["project"]
        execution_id=row["execution_id"]
        caller_class=row["caller_class"]
        callee_class=row["callee_class"]

        # First, we check if the PIT report is available for the current case

        pit_report_dir = get_pit_report_dir(pit_path, tool, project, caller_class, callee_class, execution_id)

        report=find_html_report(pit_report_dir)
        if report is not None:
            foundCounter+=1
        else:
            print "Not found "+pit_report_dir



        # Get total lines from target class' html report
        if report is None:
            # Report is not available.
            # So, we try to find another report to fine the total lines
            total_lines = get_lines_list(detected_tools, project, caller_class, callee_class, pit_path)
        else:
            # Report is available. So, lets just get the lines out of it
            total_lines = get_lines_list_from_report(report)
            
        # Get total lines from index.html
        index_page=find_index_html(pit_report_dir)
        if index_page is None:
            line_coverage_data = get_index_line_coverages_data(detected_tools, project, caller_class, callee_class, pit_path)
        else:
            line_coverage_data = get_index_line_coverages_data_from_index(index_page)

        if total_lines != None and len(total_lines) != int(line_coverage_data[1]):
            print "ERROR! "+str(len(total_lines))+" VS. "+line_coverage_data[1]+ " total lines in "+ pit_report_dir

        covered_lines = get_covered_lines(total_lines)
        if total_lines != None and len(covered_lines) != int(line_coverage_data[0]):
            print "ERROR! "+str(len(covered_lines))+" VS. "+line_coverage_data[0]+ " covered lines in "+ pit_report_dir
        # Here, we have all of the data we need, and their consistency is already checked.

        # Save line coverage 
        number_of_total_lines = line_coverage_data[1] 
        if report == None:
            number_of_covered_lines = 0
        else:
            number_of_covered_lines = line_coverage_data[0]

        print str(number_of_covered_lines)+"/"+str(number_of_total_lines)
        save_line_coverage(lineCoverageWriter,tool, project, caller_class, callee_class, execution_id,number_of_covered_lines, number_of_total_lines)
        # Save each line status
        save_line_statuses(root_path, tool, project, caller_class, callee_class, execution_id,total_lines,allLinesWriter)

print (str(foundCounter)+"/"+str(totalCounter))
# close csv files
lineCoverageFile.close()
allLinesFile.close()