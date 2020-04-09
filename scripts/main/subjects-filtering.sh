projects=("closure" "math" "lang" "time" "mockito")
prefixes=("com.google.javascript" "org.apache.commons.math" "org.apache.commons.lang" "org.joda.time" "org.mockito")

END=${#projects[@]}


for ((i=0;i<END;i++)); do
    case=${projects[$i]}
    prefix=${prefixes[$i]}
    CPEntriesDir="projects/$case/cp-entries.txt"

    echo "Running coupling analysis on $case"

    if [ -f "$CPEntriesDir" ] && [ ! -z "$( cat $CPEntriesDir)" ]; then
        CPEntriesContent=$( cat $CPEntriesDir)
        preparedCPs=$( python scripts/python/reassemble-cps.py $CPEntriesContent "$case")

        java -jar tools/coupling.jar "-project_prefix" $prefix "-project_cp" "$preparedCPs" "-out_dir" "temp-csvs/$case"
    else
      echo "could not find cp-entries file"
    fi
done


# Merge CSV files


python scripts/python/case-selection/make-final-csv.py
rm -rf temp-csvs