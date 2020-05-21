#!/bin/sh
file="/pathTo/resultFile.txt"
day=$(date +%d)
month=$(date +%m)
year=$(date +%y)
java Extract < "$file" > extractedFile.txt
java KeineToZero < extractedFile.txt > extractedFileZero.txt
java TopTenPriority < extractedFileZero.txt > TopTen.txt
rm youtubefile.txt
mkdir "$year$month$day"
mv resultFile.txt TopTen.txt "$year$month$day" #extractedFile.txt
sh script4.sh
