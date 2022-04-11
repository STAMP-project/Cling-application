# Detect mutants killed by EvoSuite
python scripts/python/mutation/find-mutants-killed-by-evosuite.py

# Detect mutants killed by Cling
python scripts/python/mutation/find-mutants-killed-by-cling.py

# Detect mutants killed by Randoop
python scripts/python/mutation/find-mutants-killed-by-randoop.py

# Detect mutants killed by Cling but not by TE
python scripts/python/mutation/cling-evoe.py

# Detect mutants killed by Cling but not by TR
python scripts/python/mutation/cling-evor.py

# Detect mutants killed only by Cling but not with EvoSuite
python scripts/python/mutation/cling-evoe-evor.py

# Detect mutants killed by Cling but not by RandoopE
python scripts/python/mutation/cling-randoope.py

# Detect mutants killed by Cling but not by RandoopR
python scripts/python/mutation/cling-randoopr.py

# # Detect mutants killed by Cling but not by Randoop10
python scripts/python/mutation/cling-randoop10.py

# Detect mutants killed only by Cling but not with Randoop
python scripts/python/mutation/cling-randoop.py


# Save the final csv file which contains the information about the killed mutants by Cling
Rscript data_analysis/r-scripts/killedM.r 
python scripts/python/mutation/generate-final-mutants-table.py