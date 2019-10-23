#!/bin/sh
file="/patch/to/resultFile.txt"

java Extract < "$file" > extractedFile.txt
java TopTenPriority < extractedFile.txt > TopTen.txt
rm youtubefile.txt
