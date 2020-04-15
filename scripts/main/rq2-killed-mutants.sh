# Detect mutants killed by EvoSuite
python scripts/python/mutation/find-mutants-killed-by-evosuite.py

# Detect mutants killed by Cling
python scripts/python/mutation/find-mutants-killed-by-cling.py

# Detect mutants killed by Cling but not by TE
python scripts/python/mutation/cling-evoe.py

# Detect mutants killed by Cling but not by TR
python scripts/python/mutation/cling-evor.py

# Detect mutants killed only by Cling
python scripts/python/mutation/cling-evoe-evor.py

# Save the final csv file which contains the information about the killed mutants by Cling
Rscript data_analysis/r-scripts/killedM.r 
python scripts/python/mutation/generate-final-mutants-table.py