
LIMIT=$1

echo "Set class separator to false"
. scripts/test/prepare_tests.sh

# compile the generated tests
echo "compiling the generated tests"
. scripts/test/compile_tests.sh

# detect and remove flaky tests from the generated test suites
echo "Detecting the flaky tests"
. scripts/test/detect_flaky_tests.sh

echo "Re-compile the modified tests"
. scripts/test/compile_tests.sh

echo "Running pitest"
. scripts/mutation/mutation-score-calculator.sh $LIMIT
