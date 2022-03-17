INPUT="subject_generator/subjects.csv"
OLDIFS=$IFS
IFS=,
[ ! -f $INPUT ] && { echo "$INPUT file not found"; }
LIMIT=$1

counter=0
while read tool execution_id project caller_class callee_class type
do
  # skip the title row
  if [[ "$counter" -eq "0" ]]; then
    counter=1
    continue
  fi
  if [[ "$tool" == "randoop-caller5" ]]; then
    # echo "Find the compiled test class. tool: $tool, execution id: $execution_id, project: $project, target class: $caller_class"
    resultDir="results/randoop5/$project-$caller_class-$execution_id"
    testClass="ErrorTest"
  elif [[ "$tool" == "randoop-callee5" ]]; then
    # echo "Find the compiled test class. tool: $tool, execution id: $execution_id, project: $project, target class: $callee_class"
    resultDir="results/randoop5/$project-$callee_class-$execution_id"
    testClass="ErrorTest"
  elif [[ "$tool" == "randoop" ]]; then
    resultDir="results/randoop10/$project-$caller_class-$callee_class-$execution_id"
    testClass="ErrorTest"
  else
    continue
  fi

  if [[ -d $resultDir ]]; then
    if [[ -f "$resultDir/ErrorTest.class" ]]; then
        echo "$resultDir/ErrorTest.class found!"
        CPEntriesDir="projects/$project/cp-entries.txt"
        CPEntriesContent=$( cat $CPEntriesDir)
        preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
        outputDir="data/rq3/stack-traces/$project-$caller_class-$callee_class-$execution_id"
        if [[ ! -d "$outputDir" ]]; then
            mkdir "$outputDir"
        fi
        echo "Executing test: by $tool. execution id: $execution_id, project: $project, caller class: $caller_class, callee class: $callee_class"
        java -cp "$preparedCPs:$resultDir:$(cat libs/test_execution/classpath.txt)" org.junit.runner.JUnitCore $testClass > "$outputDir/$tool.txt" &
    else
        echo "Compiled tests $resultDir/ErrorTest.class does not exist!"
    fi
  else
    echo "Directory $resultDir does not exist!"
  fi

  while (( $(pgrep -l java | wc -l) >= $LIMIT ))
    do
                sleep 3
    done
done < $INPUT
