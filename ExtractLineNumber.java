import java.util.Scanner;

public class ExtractLineNumber{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String buffer = "";
	final int numberOfVideoUrls = 232;
	String[] lineNumbersInStrings = new String[numberOfVideoUrls];
	int lineNumbersCounter = 0;

	//initialize to prevent null value
	for(int i = 0; i < numberOfVideoUrls; i++){
	    lineNumbersInStrings[i] = "";
	}
	
	while(sc.hasNextLine()){
	    buffer = sc.nextLine();
	    if(buffer.charAt(0) == '<' | buffer.charAt(0) == '>'){
		//System.out.println("out:" + buffer);
	    }else{
		//extract line number char by char
		for(int i = 0; i < buffer.length(); i++){
		    if(buffer.charAt(i) == 'd'){
			i = buffer.length(); //end loop
			lineNumbersCounter++;
		    }else if(buffer.length() < 2){
			//empty line
		    }else if(buffer.charAt(i) == ','){
			lineNumbersCounter++; //next Number (Unix Tool <diff> specific syntax)
		    }else{
			lineNumbersInStrings[lineNumbersCounter] += "" + buffer.charAt(i);
			//System.out.println(lineNumbersInStrings[lineNumbersCounter]);
		    }
		}
	    }
	}
	for(int i = 0; i < lineNumbersCounter; i++){
	    System.out.println(lineNumbersInStrings[i]);
	}
	//System.out.println(lineNumbersCounter);
    }
}
