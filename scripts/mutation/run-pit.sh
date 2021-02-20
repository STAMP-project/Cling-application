
### Inputs
tool=$1
execution_id=$2
project=$3
caller_class=$4
callee_class=$5
type=$6
resultDir=$7
outDir=$8
###



CPEntriesDir="projects/$project/cp-entries.txt"
CPEntriesContent=$( cat $CPEntriesDir)
preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
classPaths="$(cat libs/pitest/classpath.txt)$preparedCPs:$(cat libs/test_execution/classpath.txt)$resultDir"
mutableClassPaths=$( python scripts/python/mutation/export_mutable_cps.py $classPaths )
sourceDirs="projects/$project/src"

# get the test class and test suite name
if [[ "$tool" != randoop* ]]; then
    for mainTest in `find $resultDir -name "*_ESTest.java" -type f`; do
        testSuiteName=$(basename "$mainTest")

        testSuiteName=${testSuiteName/.java/}

        if [[  $caller_class"_ESTest" == *$testSuiteName ]]; then
            testClass=$caller_class"_ESTest"
        else
            testClass=$callee_class"_ESTest"
        fi
    done
else
    # For randoop
    # Check if the main regression test is compiled
    if [[ -f "$resultDir/RegressionTest.class" ]]; then
        testSuiteName="RegressionTest.java"
        testClass="RegressionTest"
    else
        # skip
        echo "No test available"
        return
    fi

fi



if [[ "$tool" == "cling" ]]; then
    executionLogDir="logs/pit/cling-$project-$caller_class-$callee_class-$execution_id.txt"
elif [[ "$tool" == "evosuite-callee5" ]]; then
    executionLogDir="logs/pit/evocallee5-$project-$caller_class-$callee_class-$execution_id.txt"
elif [[ "$tool" == "evosuite-caller5" ]]; then
    executionLogDir="logs/pit/evocaller5-$project-$caller_class-$callee_class-$execution_id.txt"
elif [[ "$tool" == "randoop-callee5" ]]; then
    executionLogDir="logs/pit/randoopcallee5-$project-$caller_class-$callee_class-$execution_id.txt"
elif [[ "$tool" == "randoop-caller5" ]]; then
    executionLogDir="logs/pit/randoopcaller5-$project-$caller_class-$callee_class-$execution_id.txt"
fi


if [[ "$tool" != randoop* ]]; then
    # Run PIT
    java -cp $classPaths org.pitest.mutationtest.commandline.MutationCoverageReport \
    --reportDir $outDir \
    --targetClasses $callee_class \
    --targetTests $testClass \
    --testPlugin evosuite \
    --sourceDirs "$sourceDirs" \
    --mutableCodePaths "$mutableClassPaths" \
    --mutators ALL \
    --threads 10 \
    --timestampedReports=false \
    --outputFormats "HTML,XML,CSV" > "$executionLogDir" 2>&1 & 

else 
    # Run PIT
    java -cp $classPaths org.pitest.mutationtest.commandline.MutationCoverageReport \
    --reportDir $outDir \
    --targetClasses $callee_class \
    --targetTests $testClass \
    --sourceDirs "$sourceDirs" \
    --mutableCodePaths "$mutableClassPaths" \
    --mutators ALL \
    --threads 10 \
    --timestampedReports=false \
    --outputFormats "HTML,XML,CSV" > "$executionLogDir" 2>&1 & 
fi

pid=$!

. scripts/mutation/parsing.sh $pid $tool $execution_id $project $caller_class $callee_class $type "$executionLogDir" "$resultDir" "$outDir" &
