execution_id=$1
project=$2
caller_class=$3
callee_class=$4

# 1- run cling with the right configurations
CPEntriesDir="projects/$project/cp-entries.txt"
CPEntriesContent=$( cat $CPEntriesDir)
preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")

java -d64 -Xmx4000m -jar tools/cling.jar -project_cp "$preparedCPs" -target_classes "$caller_class:$(echo -e "$callee_class" | tr -d '[:space:]')" -fitness "Branch_Pairs" "-Dsandbox=true" "-Dsearch_budget=300" -Dtest_dir="results/cling/$project-$caller_class-$callee_class-$execution_id" > "logs/cling/$project-$caller_class-$callee_class-$execution_id-out.txt" 2> "logs/cling/$project-$caller_class-$callee_class-$execution_id-err.txt" &
pid=$!
# 2- call observe
. scripts/run/cling-observer.sh $pid "$project-$caller_class-$callee_class-$execution_id-out.txt" $execution_id $project $caller_class $callee_class &
