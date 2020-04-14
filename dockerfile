ARG experiment


FROM	  	  fedora:latest

RUN         dnf upgrade --assumeyes
RUN         dnf install findutils --assumeyes
RUN         dnf install python2 --assumeyes
RUN         ln -sfn /usr/bin/python2 /usr/bin/python
RUN         dnf install java-1.8.0-openjdk --assumeyes
RUN         dnf install java-1.8.0-openjdk-devel --assumeyes
RUN         dnf install java-1.8.0-openjdk-openjfx --assumeyes
RUN         dnf install java-1.8.0-openjdk-openjfx-devel --assumeyes
RUN         dnf install procps --assumeyes
# RUN         dnf install R --assumeyes

WORKDIR /experiment
#
COPY logs /experiment/logs
# COPY results /experiment/results
COPY defects4j /experiment/defects4j
# COPY data /experiment/data
COPY projects /experiment/projects
COPY scripts /experiment/scripts
COPY tools /experiment/tools
COPY libs /experiment/libs
COPY consoleLog /experiment/consoleLog
