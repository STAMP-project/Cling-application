execution_id=$1
project=$2
caller_class=$3
callee_class=$4
budget=$5
TIMEOUT=10m

timeInMinute=$((budget / 60))

# 1- run evosuite with the right configurations
# echo "-->$execution_id-$project-$caller_class-$callee_class-$budget"
CPEntriesDir="projects/$project/cp-entries.txt"
CPEntriesContent=$( cat $CPEntriesDir)
preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
RANDOOP_JAR="tools/randoop-all-4.3.0.jar"
RANDOOP_COVERED_CLASS="tools/covered-class-4.3.0.jar"
TestsDir="results/randoop$timeInMinute/$project-$caller_class-$callee_class-$execution_id"

  if [ -f "$TestsDir/RegressionTest0.java" ]; then
    echo "Already exists: $TestsDir/RegressionTest0.java"
  else
    timeout -k $TIMEOUT $TIMEOUT java -Xmx4000m -classpath ${preparedCPs}:${RANDOOP_JAR} randoop.main.Main gentests \
    --classlist="deps/$caller_class-$callee_class-randoopdeps.txt" \
    --junit-output-dir=${TestsDir} --time-limit=$budget > "logs/randoop$timeInMinute/$project-$caller_class-$callee_class-$execution_id-out.txt" 2> "logs/randoop$timeInMinute/$project-$caller_class-$callee_class-$execution_id-err.txt" &
  fi
# --testjar="defects4j/framework/projects/Time/lib/joda-convert-1.2.jar" \
# projects/time/build/classes:defects4j/framework/projects/Time/lib/joda-convert-1.2.jar
# --classlist="deps/$caller_class-$callee_class-randoopdeps.txt" \
# -javaagent:${RANDOOP_COVERED_CLASS}
# --require-covered-classes="deps/caller_callee_list/$caller_class-$callee_class.txt"
#  --testclass="$(echo -e "$target_class" | tr -d '[:space:]')" 
# pid=$!
# echo $pid
# 2- call observer
# . scripts/run/randoop-observer.sh $pid $execution_id $project $target_class $budget $preparedCPs &