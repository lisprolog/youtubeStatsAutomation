#!/bin/sh
file="/path/to/videoList2.txt"
c=1
while IFS= read -r line
do
    echo "$c $line"
    let "c+=1"
    curl "$line" > youtubefile.txt
    grep "eow-title" youtubefile.txt >> resultFile.txt
    grep "watch-view-count" youtubefile.txt >> resultFile.txt
done <"$file"
sh script3.sh
