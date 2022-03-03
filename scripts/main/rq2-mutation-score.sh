
LIMIT=$1
toolTyoe=$2

# if [[ "$toolTyoe" != "randoop" ]]; then
#     echo "Set class separator to false"
#     . scripts/test/prepare_tests.sh
#     # compile the generated tests
#     echo "compiling the generated tests"
#     . scripts/test/compile_tests.sh
# fi

# detect and remove flaky tests from the generated test suites
# echo "Detecting the flaky tests"
# . scripts/test/detect_flaky_tests.sh


# if [[ "$toolTyoe" != "randoop" ]]; then
#     echo "Re-compile the tests"
#     . scripts/test/compile_tests.sh
# else
#     echo "Re-compile the modified tests"
    . scripts/test/compile_modified_randoop_tests.sh
# fi


echo "Running pitest"
. scripts/mutation/mutation-score-calculator.sh $LIMIT
