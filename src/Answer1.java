import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		System.out.print("Enter mark: ");
		Scanner in = new Scanner(System.in);
		int mark = in.nextInt();
		
		System.out.println("The mark is " + mark);
		 
	    if (mark >= 50) {
	    	System.out.println("PASS");
	    	
	    } else {
	    	System.out.println("FAIL");
	    
	    }
	    
	    System.out.println("DONE");
	}

}
