INPUT="subject_generator/subjects.csv"
OLDIFS=$IFS
IFS=,
[ ! -f $INPUT ] && { echo "$INPUT file not found"; }
LIMIT=15

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
    resultDir="data/rq3/tests-with-exception/$tool-$project-$caller_class-$callee_class-$execution_id"
    testClass=$caller_class"_ESTest"
    file_count=$(python scripts/python/test/test_exists.py $resultDir $testClass)
    if [[ $file_count -eq 0 ]]; then
      testClass=$callee_class"_ESTest"
    fi

  elif [[ "$tool" == "evosuite-caller5" ]]; then
    echo "Find the compiled test class. tool: $tool, execution id: $execution_id, project: $project, target class: $caller_class"
    resultDir="data/rq3/tests-with-exception/evosuite5-$project-$caller_class-$execution_id"
    testClass=$caller_class"_ESTest"
  elif [[ "$tool" == "evosuite-callee5" ]]; then
    echo "Find the compiled test class. tool: $tool, execution id: $execution_id, project: $project, target class: $callee_class"
    resultDir="data/rq3/tests-with-exception/evosuite5-$project-$callee_class-$execution_id"
    testClass=$callee_class"_ESTest"
  else
    echo "WARNING: coud not find tool $tool"
  fi

  if [[ -d $resultDir ]]; then
    CPEntriesDir="projects/$project/cp-entries.txt"
    CPEntriesContent=$( cat $CPEntriesDir)
    preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
    outputDir="data/rq3//stack-traces/$project-$caller_class-$callee_class-$execution_id"
    if [[ ! -d "$outputDir" ]]; then
        mkdir "$outputDir"
    fi
    echo "Executing test: by $tool. execution id: $execution_id, project: $project, caller class: $caller_class, callee class: $callee_class"
    java -cp "$preparedCPs:$resultDir:$(cat libs/test_execution/classpath.txt)" org.junit.runner.JUnitCore $testClass > "$outputDir/$tool.txt" &

  else
    echo "Directory $resultDir does not exist!"
  fi

  while (( $(pgrep -l java | wc -l) >= $LIMIT ))
    do
                sleep 3
    done
done < $INPUT
