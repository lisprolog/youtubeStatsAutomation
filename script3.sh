#!/bin/sh
file="/path/to/resultFile.txt"
day=$(date +%d)
month=$(date +%m)
year=$(date +%y)
java Extract < "$file" > extractedFile.txt
java TopTenPriority < extractedFile.txt > TopTen.txt
rm youtubefile.txt
mkdir "$year$month$day"
mv extractedFile.txt resultFile.txt TopTen.txt "$year$month$day"
