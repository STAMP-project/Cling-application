# Check input CSV file
INPUT="subject_generator/subjects.csv"
[ ! -f $INPUT ] && { echo "$INPUT file not found"; }
# Add new separator
OLDIFS=$IFS
IFS=,

# number of parallel processes
LIMIT=$1

# Prepare job lists
echo "Reading tasks"
job_list=()

counter=0
while read tool execution_id project caller_class callee_class type
do
  # skip the title row
  if [[ "$counter" -eq "0" ]]; then
    counter=1
    continue
  fi

  task_json=$(python scripts/python/test-generation/task_to_string.py $tool $execution_id $project $caller_class $callee_class)
  job_list+=($task_json)

done < $INPUT

# Here, we have the list of jobs in job_list
echo "The number of tasks is "${#job_list[@]}""

# Start the test generation

counter=0
for t in ${job_list[@]}; do
  ((counter++))
  # Read values
  tool=$(python scripts/python/test-generation/get_from_json.py $t "tool")
  execution_id=$(python scripts/python/test-generation/get_from_json.py $t "execution_id")
  project=$(python scripts/python/test-generation/get_from_json.py $t "project")
  caller_class=$(python scripts/python/test-generation/get_from_json.py $t "caller_class")
  callee_class=$(python scripts/python/test-generation/get_from_json.py $t "callee_class")

  

  # Execute the test generation tool
  if [[ "$tool" == evosuite* ]]; then
    # Run EvoSuite
    budgetInMinute=${tool//[!0-9]/}
    budget=$((budgetInMinute * 60))
    target_class=$callee_class
    if [[ "$tool" == evosuite-caller* ]]; then
      target_class=$caller_class
    fi
    echo "Task #$counter executes EvoSuite with search_budget $budget seconds for the $execution_id(th) time on project $project. target class: $target_class"
    . scripts/run/run_evosuite.sh $execution_id $project $target_class $budget
  elif [[ "$tool" == "cling" ]]; then
    echo "Task #$counter executes $tool for the $execution_id(th) time on project $project. caller class: $caller_class, callee class: $callee_class"
    . scripts/run/run_cling.sh $execution_id $project $caller_class $callee_class
  elif [[ "$tool" == randoop* ]]; then
    budgetInMinute=${tool//[!0-9]/}
    budget=$((budgetInMinute * 60))
    target_class=$callee_class
    if [[ "$tool" == randoop-caller* ]]; then
      target_class=$caller_class
    fi
    echo "Task #$counter executes Randoop with search_budget $budget seconds for the $execution_id(th) time on project $project. target class: $target_class"
    . scripts/run/run_randoop.sh $execution_id $project $target_class $budget

  else
    echo "WARNING: coud not find tool $tool"
  fi

  # Stop the script execution if we reach to the indicated maximum number of parallel processes
  while (( $(pgrep -l java | wc -l) >= $LIMIT ))
  do
    sleep 1
  done
done

#After finishing tasks, wit for tools to finish their test generation processes.
while (( $(pgrep -l java | wc -l) > 0 ))
do
  sleep 60
  # Check if all of the tests are generated
  finished=true
  while read tool execution_id project caller_class callee_class
    do
      if [[ "$tool" == evosuite-callee* ]]; then
        resultDir="results/evosuite5/$project-$callee_class-$execution_id"
      elif [[ "$tool" == evosuite-caller* ]]; then
        resultDir="results/evosuite5/$project-$caller_class-$execution_id"
      elif [[ "$tool" == "botsing" ]]; then
        resultDir="results/$tool/$project-$caller_class-$callee_class-$execution_id"
      elif [[ "$tool" == randoop-callee* ]]; then
        resultDir="results/randoop5/$project-$callee_class-$execution_id"
      elif [[ "$tool" == randoop-caller* ]]; then
        resultDir="results/randoop5/$project-$caller_class-$execution_id"
      fi

      if [ ! -d "$resultDir" ]; then
        echo "$resultDir is not available yet!"
        finished=false
        break
      fi
    done

    if [ "$finished" = true ] ; then
      echo 'Killing all of the processes'
      kill -9 $(pgrep java)
    fi
done

echo "Process is finished."