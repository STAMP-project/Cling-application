# Cling Application
This repository contains the replication package for the application of Cling (automated class integration testing tool) and EvoSuite (automated unit testing tool) on 140 pairs of classes from five different open-source projects.

# Docker image
Docker image of this replication package is available in [DockerHub](https://hub.docker.com/repository/docker/pderakhshanfar/cling-application).

Also, you can build and image by running `build-docker` bash file:

```
. scripts/docker/build-image.sh
```

For running the container, you can use the `run-container` bash file:


```
. scripts/docker/run-container.sh
```

# Run case filtering
Run `subjects-filtering` bash file:


```
. scripts/main/subjects-filtering.sh
```
**docker**

```
docker exec -it cling-application-container bash scripts/main/subjects-filtering.sh
```

The filtered cases will be saved in `data/filtered-class-pairs.csv`.

Also, the sampled class pairs from the filtered ones are avaialable in `subject_generator/selected-class-pairs.csv`.

# Run test generation tools
## Prepare input CSV file
The test generation script works with a CSV file as the input. The csv file is `subjects.csv`, which is located in `subject_generator` directory.
Each row in this CSV file contains a `caller_class` and `calee_class` (one of the selected class pairs).
The rows in this CSV file is categorized by their value for tool column:
* `cling` executes class integration testing for `caller_class` and `callee_class` for 5 minutes.
* `evosuite-caller5` executes EvoSuite (unit testing) on `caller_class` for 5 minutes.
* `evosuite-callee5`  executes EvoSuite (unit testing) on `callee_class` for 5 minutes.


To generate this CSV file, you need to execute `generate.py` python file:
```
python subject_generator/generate.py 
```

**docker**
```
docker exec -it cling-application-container python subject_generator/generate.py 
```

To change number of execution times you need to change this python file (line 9). Also, if you want to cfilter the class pairs, you need to filter them from `subject_generator/selected-class-pairs.csv` and rerun `generate.py`.

## Run test generation script

Run `test-geeration.sh` bash file with one input parameter, which is **number of parallel processes**:

```
. scripts/main/test-generation.sh <number of parallel processes>
```
**docker**

```
docker exec -it cling-application-container bash scripts/main/test-generation.sh <number of parallel processes>
```

## Output

Test cases generated by Cling and EvoSuite will be stored in `results` directory. Also, the execution logs of these two tools will be saved in `logs` directory.