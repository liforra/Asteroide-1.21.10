#!/bin/bash
cd /home/liforra/projects/Asteroide/Asteroide
./gradlew compileJava --console=plain 2>&1 | tee compile_result.txt
echo "Exit code: $?"
