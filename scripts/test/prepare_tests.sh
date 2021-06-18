INPUT="subject_generator/subjects.csv"
OLDIFS=$IFS
IFS=,
[ ! -f $INPUT ] && { echo "$INPUT file not found"; }

counter=0
while read tool execution_id project caller_class callee_class type
do
  # skip the title row
  if [[ "$counter" -eq "0" ]]; then
    counter=1
    continue
  fi


  if [[ "$tool" == "cling" ]]; then
        echo "Detecting the generated test suite by $tool. execution id: $execution_id, project: $project, caller class: $caller_class, callee class: $callee_class"
        resultDir="results/cling/$project-$caller_class-$callee_class-$execution_id"
    elif [[ "$tool" == "evosuite-caller5" ]]; then
        echo "Detecting the generated test suite by EvoSuite. execution id: $execution_id, project: $project, target class: $caller_class"
        resultDir="results/evosuite5/$project-$caller_class-$execution_id"
    elif [[ "$tool" == "evosuite-callee" ]]; then
        echo "Detecting the generated test suite by EvoSuite. execution id: $execution_id, project: $project, target class: $callee_class"
        resultDir="results/evosuite5/$project-$callee_class-$execution_id"
    else 
      continue
    fi

# edit tests
if [[ -d $resultDir ]]; then

  echo "Edit the main test class"
  for mainTest in `find $resultDir -name "*_ESTest.java" -type f`; do
      python scripts/python/test/separate-loader-editor.py $mainTest
  done
else
    echo "WARNING: directory $resultDir does not exist!"
fi
done < $INPUT
