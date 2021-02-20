execution_id=$1
project=$2
target_class=$3
budget=$4


timeInMinute=$((budget / 60))

# 1- run evosuite with the right configurations

CPEntriesDir="projects/$project/cp-entries.txt"
CPEntriesContent=$( cat $CPEntriesDir)
preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
RANDOOP_JAR="tools/randoop-all-4.2.4.jar"
TestsDir="results/randoop$timeInMinute/$project-$target_class-$execution_id"
java -Xmx4000m -classpath ${preparedCPs}:${RANDOOP_JAR} randoop.main.Main gentests --testclass="$(echo -e "$target_class" | tr -d '[:space:]')" --junit-output-dir=${TestsDir} --time-limit=$budget > "logs/randoop$timeInMinute/$project-$target_class-$execution_id-out.txt" 2> "logs/randoop$timeInMinute/$project-$target_class-$execution_id-err.txt" &
# pid=$!
# echo $pid
# 2- call observer
# . scripts/run/randoop-observer.sh $pid $execution_id $project $target_class $budget $preparedCPs &