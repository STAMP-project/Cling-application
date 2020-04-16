# Copy tests and remove try catches
python scripts/python/captured-exceptions/remove-try-catches.py
# # Compile modified tests
. scripts/test/compile_modified_tests.sh
# # Execute the compiled test cases
. scripts/test/execute_modified_tests.sh