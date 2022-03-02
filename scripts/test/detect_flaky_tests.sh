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
    elif [[ "$tool" == "evosuite-callee5" ]]; then
        echo "Find the compiled test class. tool: EvoSuite, execution id: $execution_id, project: $project, target class: $callee_class"
        resultDir="results/evosuite5/$project-$callee_class-$execution_id"
        testClass=$callee_class"_ESTest"
    elif [[ "$tool" == "randoop-callee5" ]]; then
        echo "Find the compiled test class. tool: Randoop, execution id: $execution_id, project: $project, target class: $callee_class"
        resultDir="results/randoop5/$project-$callee_class-$execution_id"
    elif [[ "$tool" == "randoop-caller5" ]]; then
        echo "Find the compiled test class. tool: Randoop, execution id: $execution_id, project: $project, target class: $caller_class"
        resultDir="results/randoop5/$project-$caller_class-$execution_id"
    elif [[ "$tool" == "randoop" ]]; then
        echo "Detecting the generated test suite by Randoop. execution id: $execution_id, project: $project, caller class: $caller_class, callee class: $callee_class"
        resultDir="results/randoop10/$project-$caller_class-$callee_class-$execution_id"
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
            if [[ "$tool" == randoop* ]]; then
                if [[ -f "$resultDir/RegressionTest.class" ]]; then
                    mainRegresstionTest="RegressionTest"
                    java -cp "$preparedCPs:$resultDir:$(cat libs/test_execution/classpath.txt)" org.junit.runner.JUnitCore $mainRegresstionTest > "$resultDir/error_junit_result$run.txt" &
                fi

                # if [[ -f "$resultDir/ErrorTest.class" ]]; then
                #     mainErrorTest="ErrorTest"
                #     java -cp "$preparedCPs:$resultDir:$(cat libs/test_execution/classpath.txt)" org.junit.runner.JUnitCore $mainErrorTest > "$resultDir/error_junit_result$run.txt" &
                # fi 
            else
                java -cp "$preparedCPs:$resultDir:$(cat libs/test_execution/classpath.txt)" org.junit.runner.JUnitCore $testClass > "$resultDir/junit_result$run.txt" &
            fi
        done
        
        # Wait till all of the test executions finish
        while (( $(pgrep -l java | wc -l) > 0 ))
        do
            sleep 1
        done
        echo "Test execution is finished"

        if [[ "$tool" != randoop* ]]; then
            flaky_tests=()
            for ((run=1;run<=RunLimit;run++))
            do
                echo "Collect results of test in $resultDir for $run(th) time"

                failingTestsOutput_reg=$(python scripts/python/test/parse_failing_tests.py "$resultDir/error_junit_result$run.txt")
                read -r -a array <<< "$failingTestsOutput_reg"
                for index in "${!array[@]}"
                do
                    containsElement "${array[index]}" "${flaky_tests[@]}"
                    if [[ "$?" -eq "0" ]]; then
                        flaky_tests+=("${array[index]}")
                        echo "" > "$resultDir/flakyRegressionTest"
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

        else
            flaky_tests=()
            for ((run=1;run<=RunLimit;run++))
            do
                echo "Collect results of test in $resultDir for $run(th) time"

                failingTestsOutput_reg=$(python scripts/python/test/parse_randoop_failing_tests.py "$resultDir/error_junit_result$run.txt")
                read -r -a array <<< "$failingTestsOutput_reg"
                for index in "${!array[@]}"
                do
                    containsElement "${array[index]}" "${flaky_tests[@]}"
                    if [[ "$?" -eq "0" ]]; then
                        flaky_tests+=("${array[index]}")
                        echo "" > "$resultDir/flakyRegressionTest"
                    fi
                done
            done

            # Add @Ignore to flaky tests
            if (( ${#flaky_tests[@]} )); then
            echo ">>"${flaky_tests[@]}
            for index in "${!flaky_tests[@]}"
            do
                currentTest=${flaky_tests[index]}
                testName=${currentTest%|*}
                testClass=${currentTest#*|}
                echo "testcase: $testName, testsuite: $testClass"
                java -jar tools/IgnoreAdder.jar $resultDir/$testClass.java "$testName"
            done
                # for mainTest in `find $resultDir -name "*_ESTest.java" -type f`; do
                #     java -jar tools/IgnoreAdder.jar $mainTest "${flaky_tests[@]}"
                # done
            else
                echo "No flaky test in $resultDir"
            fi
        fi
        # Detect Flaky tests
        
    fi

done < $INPUT