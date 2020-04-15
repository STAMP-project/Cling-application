# Detect killed mutants by EvoSuite
python scripts/python/mutation/find-mutants-killed-by-evosuite.py

# Detect killed mutants by Cling
python scripts/python/mutation/find-mutants-killed-by-cling.py

python scripts/python/mutation/cling-evoe.py

python scripts/python/mutation/cling-evor.py

python scripts/python/mutation/cling-evoe-evor.py

Rscript data_analysis/r-scripts/killedM.r 

python scripts/python/mutation/generate-final-mutants-table.py