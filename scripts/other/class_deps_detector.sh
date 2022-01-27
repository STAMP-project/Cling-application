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
  

  outFile="deps/$caller_class-$callee_class.txt"

  CPEntriesDir="projects/$project/cp-entries.txt"
  CPEntriesContent=$( cat $CPEntriesDir)
  preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$project")
  caller_clean_name="$(echo -e "$caller_class" | tr -d '[:space:]')"
  callee_clean_name="$(echo -e "$callee_class" | tr -d '[:space:]')"

  caller_file="deps/$caller_clean_name-temp.txt"
  callee_file="deps/$callee_clean_name-temp.txt"



  echo "Caller: $caller_clean_name"

  if [ ! -f "$caller_file" ]; then
    echo "$caller_file does not exist."
    jdeps -apionly -v -R -cp "$preparedCPs" "$caller_clean_name" \
    | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  > "$caller_file"
  fi

  echo "Callee: $callee_clean_name"

  if [ ! -f "$callee_file" ]; then
    echo "$callee_file does not exist."
    jdeps -apionly -v -R -cp "$preparedCPs" "$callee_clean_name" \
    | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  > "$callee_file"
  fi

  # Here, we have deps both for caller and callee. Hence, we need to merge them to a file
  final_file="deps/$caller_clean_name-$callee_clean_name-randoopdeps.txt"

  caller_callee_list="deps/temp.txt"
  echo "$caller_clean_name\n$callee_clean_name" > $caller_callee_list

  sort $caller_file $callee_file $caller_callee_list | uniq > $final_file
done < $INPUT

find deps/ -name "*-temp.txt" -type f -delete
rm $caller_callee_list