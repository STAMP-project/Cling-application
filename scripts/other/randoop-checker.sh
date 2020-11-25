INPUT="subject_generator/subjects.csv"


OLDIFS=$IFS
IFS=,

counter=0
resultcounter=0
while read tool execution_id project caller_class callee_class type
do
  # skip the title row
  if [[ "$counter" -eq "0" ]]; then
    counter=1
    continue
  fi

  timeInMinute=${tool//[!0-9]/}
  target_class=$callee_class

  TestsDir="results/randoop$timeInMinute/$project-$target_class-$execution_id"

  if [ -f "$TestsDir/RegressionTest0.java" ]; then
    continue
        # find ${TestsDir} -name "RegressionTest0.java" -print0 | while read -d $'\0' testsuite
        # do
        #     continue
        # done 
  fi

  pattern1="You provided no methods to test, so no tests for them can be generated."


  if grep -q "$pattern1" "logs/randoop$timeInMinute/$project-$target_class-$execution_id-out.txt"; then
    continue
  fi


  resultcounter=$((resultcounter+1))
  echo $TestsDir
  echo "logs/randoop$timeInMinute/$project-$target_class-$execution_id-out.txt"
  echo "logs/randoop$timeInMinute/$project-$target_class-$execution_id-err.txt"
  echo "___________________________"

done < $INPUT


echo $resultcounter