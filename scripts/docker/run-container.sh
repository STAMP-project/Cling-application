# After building the the image, we run the container
docker run -dit --name cling-application-container  \
--mount type=bind,source="$(pwd)/consoleLog",target=/experiment/consoleLog \
--mount type=bind,source="$(pwd)/logs",target=/experiment/logs \
--mount type=bind,source="$(pwd)/results",target=/experiment/results \
--mount type=bind,source="$(pwd)/defects4j",target=/experiment/defects4j \
--mount type=bind,source="$(pwd)/data",target=/experiment/data \
--mount type=bind,source="$(pwd)/projects",target=/experiment/projects \
--mount type=bind,source="$(pwd)/scripts",target=/experiment/scripts \
--mount type=bind,source="$(pwd)/tools",target=/experiment/tools \
cling-application