import java.util.Scanner;
// exchanges the words "No views" and "Keine Aufrufe" to integer Zero => 0
public class KeineToZero{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String buffer = "";
	while(sc.hasNextLine()){
	    buffer = sc.nextLine();
	    if(buffer.equals("Keine")){
		System.out.println(0);
	    }else if(buffer.equals("No")){
		System.out.println(0);
	    }else{
		System.out.println(buffer);
	    }
	}
    }
}
		
	    
	    
