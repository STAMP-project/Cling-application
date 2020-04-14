# Check input CSV file
INPUT="subject_generator/subjects.csv"
[ ! -f $INPUT ] && { echo "$INPUT file not found"; }
# Add new separator
OLDIFS=$IFS
IFS=,

# Number of execution repeat
RunLimit=5


containsElement () {
  local e match="$1"
  shift
  for e; do [[ "$e" == "$match" ]] && return 1; done
  return 0
}


#Read CSV file
counter=0
while read tool execution_id project caller_class callee_class type
do
    # skip the title row
    if [[ "$counter" -eq "0" ]]; then
        counter=1
        continue
    fi
    if [[ "$tool" == "cling" ]]; then
        echo "Find the compiled test class. tool: $tool, execution id: $execution_id, project: $project, caller class: $caller_class, callee class: $callee_class"
        resultDir="results/$tool/$project-$caller_class-$callee_class-$execution_id"
        testClass=$caller_class"_ESTest"
    elif [[ "$tool" == "evosuite-caller5" ]]; then
        echo "Find the compiled test class. tool: EvoSuite, execution id: $execution_id, project: $project, target class: $caller_class"
        resultDir="results/evosuite5/$project-$caller_class-$execution_id"
        testClass=$caller_class"_ESTest"
    elif [[ "$tool" == "evosuite-caller5" ]]; then
        echo "Find the compiled test class. tool: EvoSuite, execution id: $execution_id, project: $project, target class: $callee_class"
        resultDir="results/evosuite5/$project-$callee_class-$execution_id"
        testClass=$callee_class"_ESTest"
    else
        echo "WARNING: The tool $tool does not exist."
        continue
    fi

    
    if [[ -d $resultDir ]]; then
        # Run test for 5 times
        for ((run=1;run<=RunLimit;run++))
        do
            echo "Run test in $resultDir for $run(th) time"
            CPEntriesDir="projects/$project/cp-entries.txt"
            CPEntriesContent=$( cat $CPEntriesDir)
            preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
            java -cp "$preparedCPs:$resultDir:$(cat libs/test_execution/classpath.txt)" org.junit.runner.JUnitCore $testClass > "$resultDir/junit_result$run.txt" &
        done
        
        # Wait till all of the test executions finish
        while (( $(pgrep -l java | wc -l) > 0 ))
        do
            sleep 1
        done
        echo "Test execution is finished"
        # Detect Flaky tests
        flaky_tests=()
        for ((run=1;run<=RunLimit;run++))
        do
            echo "Collect results of test in $resultDir for $run(th) time"
            failingTestsOutput=$(python scripts/python/test/parse_failing_tests.py "$resultDir/junit_result$run.txt")
            read -r -a array <<< "$failingTestsOutput"
            for index in "${!array[@]}"
            do
                containsElement "${array[index]}" "${flaky_tests[@]}"
                if [[ "$?" -eq "0" ]]; then
                    flaky_tests+=("${array[index]}")
                fi
            done
        done

        # Add @Ignore to flaky tests
        if (( ${#flaky_tests[@]} )); then
          for mainTest in `find $resultDir -name "*_ESTest.java" -type f`; do
            java -jar tools/IgnoreAdder.jar $mainTest "${flaky_tests[@]}"
          done
        else
            echo "No flaky test in $resultDir"
        fi
    fi

done < $INPUT