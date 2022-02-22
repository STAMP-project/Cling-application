INPUT="subject_generator/subjects.csv"
ModeIndicator=$1



if [[ "$ModeIndicator" == "1" ]]; then
 echo "Collect first depth of dependencies"
elif [[ "$ModeIndicator" == "2" ]]; then
 echo "Collect first 2 depths of dependencies"
elif [[ "$ModeIndicator" == "R" ]]; then
 echo "Collect all dependencies recursively"
else
echo "Invalid input argument."
return
fi

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




  echo "Caller: $caller_clean_name | Callee: $callee_clean_name"



if [[ "$ModeIndicator" == "1" ]]; then
   if [ ! -f "$caller_file" ]; then
    echo "$caller_file does not exist."
    jdeps -apionly -v -cp "$preparedCPs" "$caller_clean_name" \
    | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  > "$caller_file"
  fi

  if [ ! -f "$callee_file" ]; then
    echo "$callee_file does not exist."
    jdeps -apionly -v -cp "$preparedCPs" "$callee_clean_name" \
    | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  > "$callee_file"
  fi

elif [[ "$ModeIndicator" == "2" ]]; then


  caller_file2="deps/$caller_clean_name-temp2.txt"
  callee_file2="deps/$callee_clean_name-temp2.txt"
  caller_file3="deps/$caller_clean_name-temp3.txt"
  callee_file3="deps/$callee_clean_name-temp3.txt"
 echo "Collect first 2 depths of dependencies"

 if [ ! -f "$caller_file" ]; then
    echo "$caller_file does not exist."
    jdeps -apionly -v -cp "$preparedCPs" "$caller_clean_name" \
    | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  > "$caller_file2"

    while read line;
    do
     echo ">> $line"; 

    if [[ "$line" == java.* ]]; then
      echo "Ignore $line"
    else
      jdeps -apionly -v -cp "$preparedCPs" "$line" \
        | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  >> "$caller_file3"
    fi

    done < $caller_file2

    sort $caller_file3 $caller_file2 | uniq > $caller_file
  fi


    if [ ! -f "$callee_file" ]; then
    echo "$callee_file does not exist."

    echo "Find first level of dependencies for $callee_clean_name" 
    jdeps -apionly -v -cp "$preparedCPs" "$callee_clean_name" \
    | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  > "$callee_file2"
     echo "Find second level of dependencies for $callee_clean_name" 
    while read line;
    do

     echo "analyzing $line"; 

    if [[ "$line" == java.* ]]; then
      echo "Ignore $line"
    else
      jdeps -apionly -v -cp "$preparedCPs" "$line" \
        | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  >> "$callee_file3"

        cat $callee_file3
    fi
    

    done < $callee_file2


    sort $callee_file3 $callee_file2 | uniq > $callee_file

  fi


  

elif [[ "$ModeIndicator" == "R" ]]; then
   if [ ! -f "$caller_file" ]; then
    echo "$caller_file does not exist."
    jdeps -apionly -v -R -cp "$preparedCPs" "$caller_clean_name" \
    | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  > "$caller_file"
  fi

  if [ ! -f "$callee_file" ]; then
    echo "$callee_file does not exist."
    jdeps -apionly -v -R -cp "$preparedCPs" "$callee_clean_name" \
    | grep -v '^[A-Za-z]' | sed -E 's/^.* -> ([^ ]+) .*$/\1/' | sort | uniq  > "$callee_file"
  fi
else
echo "Invalid input argument."
return
fi

  


  # Here, we have deps both for caller and callee. Hence, we need to merge them to a file
  final_file_java="deps/$caller_clean_name-$callee_clean_name-randoopdeps-java-temp.txt"
  final_file="deps/$caller_clean_name-$callee_clean_name-randoopdeps.txt"

  caller_callee_list="deps/caller_callee_list/$caller_clean_name-$callee_clean_name.txt"
  echo "$caller_clean_name\n$callee_clean_name" > $caller_callee_list

  sort $caller_file $callee_file $caller_callee_list | uniq > $final_file_java

  grep -v '^java\.lang' $final_file_java > $final_file
done < $INPUT





find deps/ -name "*-temp*.txt" -type f -delete
rm $caller_callee_list