LIMIT=$1

echo "Set class separator to false"
. scripts/test/prepare_tests.sh

echo "compiling the generated tests"
. scripts/test/compile_tests.sh

echo "Runing CBC analyzer"
. scripts/cbc/cbc-coverage.sh $LIMIT

# Replace -1 values from cbc-coverage csv file to their main value according to the other tools' results.

python scripts/python/cbc/correct_values.py