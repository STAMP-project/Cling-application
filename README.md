# Cling-application
This repository contains the replication package for the application of Cling (automated class integration testing tool) and EvoSuite (automated unit testing tool) on 140 pairs of classes from five different open-source projects.

## Docker image
Docker image of this replication package is available in [DockerHub](https://hub.docker.com/repository/docker/pderakhshanfar/cling-application).

Also, you can build and image by running `build-docker` bash file:

```
. scripts/docker/build-image.sh
```

For running the container, you can use the `run-container` bash file:


```
. scripts/docker/run-container.sh
```

## Run case filtering
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