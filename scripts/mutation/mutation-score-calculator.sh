# Check input CSV file
INPUT="subject_generator/subjects.csv"
[ ! -f $INPUT ] && { echo "$INPUT file not found"; }
# Add new separator
OLDIFS=$IFS
IFS=,

# number of parallel processes
LIMIT=$1


# Main loop
counter=0
while read tool execution_id project caller_class callee_class type
do
    # skip the title row
    if [[ "$counter" -eq "0" ]]; then
        counter=1
        continue
    fi

    if [[ "$tool" == "cling" ]]; then
        echo "Applying PIT on the generated test suite by $tool. execution id: $execution_id, project: $project, caller class: $caller_class, callee class: $callee_class"
        resultDir="results/$tool/$project-$caller_class-$callee_class-$execution_id"
        outDir="data/rq2/pit/$tool/$project-$caller_class-$callee_class-$execution_id"
  elif [[ "$tool" == "evosuite-callee5" ]]; then
        echo "Applying PIT on the generated test suite by EvoSuite. execution id: $execution_id, project: $project, target class: $callee_class"
        resultDir="results/evosuite5/$project-$callee_class-$execution_id"
        outDir="data/rq2/pit/$tool/$project-$callee_class-$execution_id"
  elif [[ "$tool" == "evosuite-caller5" ]]; then
        echo "Applying PIT on the generated test suite by EvoSuite. execution id: $execution_id, project: $project, target class: $caller_class"
        resultDir="results/evosuite5/$project-$caller_class-$execution_id"
        outDir="data/rq2/pit/$tool/$project-$caller_class-$callee_class-$execution_id"
  else
    echo "WARNING: coud not find tool $tool"
  fi
  if [[ -d $resultDir ]]; then
    # Do not repeat the analysis
    # if [[ -f "$outDir/index.html" ]]; then
    #   echo "Already exists"
    #   continue
    # fi
    . scripts/mutation/run-pit.sh $tool $execution_id $project $caller_class $callee_class $type $resultDir $outDir
  else
    echo "WARNING: Directory $resultDir does not exist."
  fi

  while (( $(pgrep -l java | wc -l) >= $LIMIT ))
  do
    sleep 1
  done
done < $INPUT