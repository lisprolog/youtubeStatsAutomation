import java.util.Scanner;

public class Extract{
    public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	String line1 = "";
	String line2 = "";
	String name = "";
	String views = "";
	int count = 60;
	char c = 'c';
	boolean run = true;

	while(sc.hasNextLine()){
	    
	    line1 = sc.nextLine();
	    line2 = sc.nextLine();
	    //	    System.out.println(line1);
	    
	    count = 60;
	    run = true;
	    name = "";
	    
	    while(run){
		c = line1.charAt(count++);
		if( c == '"'){
		    run = false;
		}else{
		    name += c;
		}    
	    };
	    System.out.println(name);
	    
	    //	    System.out.println(line2);
	    count = 116;
	    c = 'c';
	    run = true;
	    views = "";
	    while(run){
		c = line2.charAt(count++);
		if(c == ' '){
		    run = false;
		}else{
		    views += c;
		}    
	    };
	    System.out.println(views);	
	}
    }
}
