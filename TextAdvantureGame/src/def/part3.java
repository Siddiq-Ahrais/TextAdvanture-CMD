package def;
import java.util.Scanner;
public class part3 {

	Scanner sc;
	int playerHP;
	String playerWeapon;
	String playerName;
	int choice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		part3 game;
		game = new part3();
		
		game.playerSetup();
		game.townGate();
		
	}

	public void playerSetup() {
		
		playerHP = 15;
		
		
		playerWeapon = "Knife";
		
		System.out.println("Your Player HP : " + playerHP);
		System.out.println("Your Weapon : " + playerWeapon);
				
		
		sc = new Scanner(System.in);
		
		System.out.println("Please enter your Name");		
		playerName = sc.nextLine();
		
		System.out.println("Hello " + playerName + ", let's start your Advanture!" );
		
	}
	public void townGate(){
		System.out.println("\n============================================");
		System.out.println("You are at the gate of the Town Noel");
		System.out.println("============================================\n");
		System.out.println("A Guard is standing in font of you \n What do You want to do?");
		System.out.println("");
		System.out.println("1. Talk to  ");
		System.out.println("2. Attack the Guard");
		System.out.println("3. Leave");
		
		choice = sc.nextInt(); 
		
		if(choice==1) {
			System.out.println("Guard: Hello there Stranger");
			
		}
		if(choice==2) {
			System.out.println("Guard: Who the fuck are you? \n You Arrested by Guard \n He kill  you in the Jail \n\n\n Game Over");
			
		}
		if(choice==3) {
			
		}
		
	}
	
}
