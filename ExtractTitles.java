import java.util.Scanner;

// This class extracts titles from a file.
public class ExtractTitles{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String buffer = "";
	int reloadScanner = 0;

	while(sc.hasNextLine()){
	    if(sc.hasNextInt()){
		reloadScanner = sc.nextInt();
	    }else{
		//hopefully the video title
		buffer = sc.nextLine();
		if(buffer.equals("No") || buffer.length() == 0){
		    //"No" is short for "No Views" aka 0
		}else{
		    System.out.println(buffer);
		}
	    }
	}
    }
}
