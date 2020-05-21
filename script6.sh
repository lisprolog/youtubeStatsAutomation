#!/bin/sh
file="/pathTo/resultFile2.txt"
day=$(date +%d)
month=$(date +%m)
year=$(date +%y)
java Extract < "$file" > extractedFile2.txt
java KeineToZero < extractedFile2.txt > extractedFileZero2.txt
java TopTenPriority < extractedFileZero2.txt > TopTen2.txt
rm youtubefile2.txt
#mkdir "$year$month$day" #thnx
mv extractedFile.txt extractedFile2.txt resultFile2.txt TopTen2.txt lineNumbers1.txt diffTitleList1.txt titlesOnly.txt videoListAgain.txt extractedFileZero2.txt extractedFileZero.txt "$year$month$day"
