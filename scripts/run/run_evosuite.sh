execution_id=$1
project=$2
target_class=$3
budget=$4


timeInMinute=$((budget / 60))

# 1- run evosuite with the right configurations

CPEntriesDir="projects/$project/cp-entries.txt"
CPEntriesContent=$( cat $CPEntriesDir)
preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")

java -d64 -Xmx4000m -jar tools/evosuite.jar -projectCP "$preparedCPs" -class "$(echo -e "$target_class" | tr -d '[:space:]')" -generateMOSuite "-Dalgorithm=DynaMOSA" "-Dsandbox=true" "-Dsearch_budget=$budget" "-Dshow_progress=FALSE" "-Dtimeline_interval=10000" "-Dcriterion=BRANCH" "-Dcatch_undeclared_exceptions=true" -Dtest_dir="results/evosuite$timeInMinute/$project-$target_class-$execution_id" > "logs/evosuite$timeInMinute/$project-$target_class-$execution_id-out.txt" 2> "logs/evosuite$timeInMinute/$project-$target_class-$execution_id-err.txt" &
pid=$!

# 2- call observer
. scripts/run/evosuite-observer.sh $pid $execution_id $project $target_class $budget &