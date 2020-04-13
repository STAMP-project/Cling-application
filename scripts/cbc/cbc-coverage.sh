# Cling CBC Coverage
python scripts/python/cbc/cling-cbc.py

# EvoSuite CB Coverage
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
        continue
        # echo "Applying CBC calculator on $resultDir"
    elif [[ "$tool" == "evosuite-caller5" ]]; then
        resultDir="results/evosuite5/$project-$caller_class-$execution_id"
        # echo "Applying CBC calculator on $resultDir"
    else
        # CBC coverage is only for Cling and evosuite on caller class
        continue
    fi

    if [[ -d $resultDir ]]; then
        # Prepare CP entries
        CPEntriesDir="projects/$project/cp-entries.txt"
        CPEntriesContent=$( cat $CPEntriesDir)
        preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
        classPaths="$preparedCPs:$(cat libs/test_execution/classpath.txt)$resultDir"

        # Prepare testSuite name
        for mainTest in `find $resultDir -name "*_ESTest.java" -type f`; do
            filename=$(basename -- "$mainTest")
            filename="${filename%.*}"
            # echo "Filename: "$filename
            callerClassName=$caller_class"_ESTest"
            callerClassName="${callerClassName##*.}"
            # echo "Caller class name: "$callerClassName
            if [ "$filename" = "$callerClassName" ]; then
                testClass=$caller_class"_ESTest"
            else
                testClass=$callee_class"_ESTest"
            fi
        done

        echo "Test case is $testClass"

        echo "Run EvoSuite CBC coverage. testClass: $testClass, CallerClass: $caller_class, CalleeClass: $callee_class, executionId: $execution_id"
        java -Djavax.accessibility.assistive_technologies=" " -jar tools/cbc.jar -project_cp "$classPaths" -test_suite "$testClass" -caller "$caller_class" -callee "$callee_class" > "logs/cbc/$tool-$project-$caller_class-$callee_class-$execution_id-out.txt" 2> "logs/cbc/$tool-$project-$caller_class-$callee_class-$execution_id-err.txt" &
        pid=$!
        . scripts/cbc/observer.sh $pid $execution_id $project $caller_class $callee_class $tool &
    else
        echo "XXXXXXXX $resultDir"
    fi

    while (( $(pgrep -l java | wc -l) >= $LIMIT ))
        do
                sleep 1
        done

done < $INPUT
