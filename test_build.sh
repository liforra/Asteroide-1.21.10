#!/bin/bash
cd /home/liforra/projects/Asteroide/Asteroide
./gradlew compileJava 2>&1 | tee build_output.txt
