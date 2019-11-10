#!/bin/sh
file="/patch/to/videoList2.txt"
while IFS= read -r line
do
    echo "$line"
    curl "$line" > youtubefile.txt
    grep "eow-title" youtubefile.txt >> resultFile.txt
    grep "watch-view-count" youtubefile.txt >> resultFile.txt
done <"$file"
sh script3.sh
