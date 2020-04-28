#!/bin/sh
file="/home/nomozroot/webcrawler/resultFile2.txt"
day=$(date +%d)
month=$(date +%m)
year=$(date +%y)
java Extract < "$file" > extractedFile2.txt
java TopTenPriority < extractedFile2.txt > TopTen2.txt
rm youtubefile2.txt
#mkdir "$year$month$day"
mv extractedFile.txt extractedFile2.txt resultFile2.txt TopTen2.txt lineNumbers1.txt diffTitleList1.txt titlesOnly.txt videoListAgain.txt "$year$month$day"
