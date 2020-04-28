#!/bin/sh
java ExtractTitles < extractedFile.txt > titlesOnly.txt
diff TitleList1.txt titlesOnly.txt > diffTitleList1.txt
java ExtractLineNumber < diffTitleList1.txt > lineNumbers1.txt
java ExtractUrl > videoListAgain.txt
sh script5.sh
