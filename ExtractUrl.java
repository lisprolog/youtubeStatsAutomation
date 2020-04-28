import java.util.Scanner;
import java.io.File;

public class ExtractUrl{
    public static void main(String[] args){

	File file1;
	File file2;
	Scanner sc1;
	Scanner sc2;
	String[] urls_array;
	final int URLS_NUMBER = 234; //add one to start array at 1
	int lineNumber = 0;
	int index = 1;
	
	try{
	    file1 = new File("videoList2.txt");// allURLs("videoList2.txt");
	    file2 = new File("lineNumbers1.txt");// missingURLsIndexes("lineNumbers1.txt");

	    sc1 = new Scanner(file1); // all URLs
	    sc2 = new Scanner(file2); // missing URLsIndexes

	    //String buffer = "";
	    urls_array = new String[URLS_NUMBER];

	    //initialization
	    for(int i = 0; i < URLS_NUMBER; i++){
		urls_array[i] = "";
	    }
	    
	    //fill urls_array with file1
	    while(sc1.hasNextLine()){
		urls_array[index++] += "" + sc1.nextLine();
	    }

	    while(sc2.hasNextInt()){
		lineNumber = sc2.nextInt();
		System.out.println(urls_array[lineNumber]);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
    }
}
