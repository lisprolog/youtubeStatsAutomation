import java.util.Scanner;

/* This program checks duplicate urls in videoList2.txt */
public class Check{
    
    static String [] urls;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	urls = new String[229];
	String temp = "";
	int counter1 = 0;
	
	//fill the array
	while(sc.hasNext()){
	    temp = sc.next();
	    urls[counter1] = temp;
	    counter1++;
	    // System.out.println(counter);
	}
	//count element frequency
	for(int i = 0; i < urls.length; i++){
	    checkArray(urls[i]);
	    //System.out.println(urls[i]);
	}
    }
    //count element frequency
    //element has to occur once in array
    public static void checkArray(String s){
	int counter2 = 0;
	for(int i = 0; i < urls.length; i++){
	    if(s.equals(urls[i])){
		counter2++;
	    }
	    //if it occurs second time print counter and element
	    if(counter2 == 2){
		System.out.println(s);
	    }
	}
	counter2 = 0;
    }
}
	    
	
