LIMIT=$1

echo "Set class separator to false"
. scripts/test/prepare_tests.sh

echo "compiling the generated tests"
. scripts/test/compile_tests.sh

echo "Runing CBC analyzer"
. scripts/cbc/cbc-coverage.sh $LIMIT