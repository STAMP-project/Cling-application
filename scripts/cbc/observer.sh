pid=$1
execution_id=$2
project=$3
caller_class=$4
callee_class=$5
tool=$6

filename="logs/cbc/$tool-$project-$caller_class-$callee_class-$execution_id-out.txt"


while kill -0 "$pid"; do
            sleep 30
            modifiedTime=$(date -r "$filename" "+%s")
            currentTime=$(date "+%s")
            inActiveTime=$((currentTime-modifiedTime))
            echo "Process $pid is inactive for $inActiveTime seconds"
            if [[ "$inActiveTime" -gt "120" ]]; then
                kill -9 "$pid"
                echo "killing process $pid"
            fi

done

python scripts/python/cbc/write_on_csv_file.py $execution_id $project $caller_class $callee_class $filename $tool &