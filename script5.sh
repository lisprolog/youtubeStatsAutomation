#!/bin/sh
file="/home/nomozroot/webcrawler/videoListAgain.txt"
c=1
while IFS= read -r line
do
    echo "$c $line"
    let "c+=1"
    curl --keepalive-time 2 "$line" > youtubefile2.txt
    grep "eow-title" youtubefile2.txt >> resultFile2.txt
    grep "watch-view-count" youtubefile2.txt >> resultFile2.txt
done <"$file"
sh script6.sh
