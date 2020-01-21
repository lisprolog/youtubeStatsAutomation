# youtubeStatsAutomation
I have made a manual on SelfMade Retro Computer Emulation with Raspberry Pi 3B and Tinker Board.
Once the manual was uploaded on Wordpress, I regularly checked which ROMs would attract
most interest via Youtube Videos.
Checking on about 160 videos regularly to find out the 10 most viewed got tedious,
so I was looking to find a way to automate this task.

I was first looking for webcrawlers both on Python and Java.
Then I tried to find a useful youtube API and Youtube Data Tools.

Once I remembered cURL (command line UNIX tool) the task became manageable.
There are two shell scripts.

script2.sh does the curl downloads, guided by videoList2, which contains all the URLs.
Then it greps both the title of the youtube page and the views count, but with HTML source code noise into resultFile.
A index counts the URLs and shows them in CL. (represents progress)

script3.sh starts Extract.java and TopTenPriority.java and puts results into TopTen.txt
Then it creates a folder with current date as name and moves the three files inside.

Extract.java extracts the title and view counts into extracedFile. This way the HTML code gets filtered and
title and views are each in a single line without further HTML code.

TopTenPriority.java will create a PriorityQueue and sort the youtube videos by their view count.
After sorting the result will be printed into TopTen.txt (script3.sh).
(I tried to use TreeMap, but duplicate keys get overwritten.)

TopTen.txt will show both the views and the title, in order of most viewed.
