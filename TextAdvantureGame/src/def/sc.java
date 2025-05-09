package def;
import java.util.Scanner;


public class sc {

	public static void main(String[] args) {
		
	Scanner myScanner;
	myScanner = new Scanner(System.in);
	
	String playerName;
	
	System.out.println("Please enter your Name:");
	
	playerName = myScanner.nextLine();
	
	System.out.println("Hello " + playerName);
	
	
	int number;
	
	System.out.println("Please enter a Number :");
	
	number = myScanner.nextInt();
	
	System.out.println("The Number you typed is " + number);
	
	
	}

}
