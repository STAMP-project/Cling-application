## inputs
pid=$1

tool=$2
execution_id=$3
project=$4
caller_class=$5
callee_class=$6
type=$7

logFile=$8
resultDir=$9
outDir=${10}
##


## wait for the process to finish
while kill -0 "$pid"; do
    sleep 1
done

exists=$(python scripts/python/mutation/exists_in_file.py "$logFile" "did not pass without mutation")


if [[ "$exists" == "TRUE" ]]
then
    echo "A problem in the PIT execution has been found."
    echo "Fixing the problem ..."
    failedClass=$(python scripts/python/mutation/detect_failing_class.py "$logFile" "did not pass without mutation")
    failedTest=$(python scripts/python/mutation/detect_failing_test.py "$logFile" "did not pass without mutation")

    # Add @Ignore to failing tests
    for mainTest in `find $resultDir -name "*_ESTest.java" -type f`; do
          echo "Add ignore to $failedTest in $mainTest"
          java -jar tools/IgnoreAdder.jar $mainTest "$failedTest"
          CPEntriesDir="projects/$project/cp-entries.txt"
          CPEntriesContent=$( cat $CPEntriesDir)
          preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
          javac -cp "$preparedCPs:$resultDir:$(cat libs/test_execution/classpath.txt)" $mainTest
    done

    echo "Problem has been fixed."
    echo "Rerunning the PIT execution ..."
    . scripts/mutation/run-pit.sh $tool $execution_id $project $caller_class $callee_class $type $resultDir $outDir &
else
    echo "PIT execution is finished. Execution log: $logFile"
fi