package def;
import java.util.Scanner;
public class part3 {
	Gacha gacha = new Gacha();
	Scanner sc = new Scanner(System.in);
	Scanner enter = new Scanner(System.in);
	int playerHP;
	String playerWeapon;
	String playerName;
	int choice;
	int river = 10;
	int monHP;
	int monD;
	int silverRing;
//	monster mon = new monster();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		part3 game;
		game = new part3();
		
		game.playerSetup();
		game.townGate();
		
	}

	public void playerSetup() {
		
		playerHP = 15;
		monHP = 30;
		
		playerWeapon = "Knife";
		
		System.out.println("Your Player HP : " + playerHP);
		System.out.println("Your Weapon : " + playerWeapon);
				
		
		
		System.out.println("Please enter your Name");		
		playerName = sc.nextLine();
		
		System.out.println("Hello " + playerName + ", let's start your Advanture!" );
		
	}
	public void playerSetup1() {
		
		playerHP = 15;
		monHP = 30;
		
		playerWeapon = "Knife";
		
		System.out.println("Your Player HP : " + playerHP);
		System.out.println("Your Weapon : " + playerWeapon);
				
		
		
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
			if(silverRing==1) {
				ending();
				
			}else if(silverRing==0) {
			System.out.println("Guard: Hello there Stranger, so ur name is " + playerName + "?\n i'm sorry, stranger not allowed to entry the Town");
			enter.nextLine();
			townGate();
				}
			}
		else if(choice==2) {
			playerHP = playerHP-2;
			System.out.println("Guard: Who the fuck are you?\n The Guard punch " + playerName +"\n You receive 2 damage");
			System.out.println("Your HP : " + playerHP);
			enter.nextLine();
			townGate();
		}
		if(choice==3) {
			
			crossRoad();
		}else {
			townGate();
				}
			}
	
	
	public void crossRoad() {
		System.out.println("\n============================================");
		System.out.println("You are at a Crossroad. If You go to south, You will go back to the town\n\n");
		System.out.println("1. Go to North");
		System.out.println("2. Go to East");
		System.out.println("3. Go to South");
		System.out.println("4. Go to West");
		System.out.println("\n\n============================================");
		
		choice = sc.nextInt();
		if(choice == 1) {
			north();
			
		}
		
		if(choice == 2) {
			east();
		}
		
		if(choice == 3) {
			townGate();
			
		}
		
		if(choice == 4) {
			west();
			
			
		}
		else {
			crossRoad();
		}
	
	}
	
	public void north() {
		System.out.println("\n============================================");
		System.out.println("There is a river. You can drink the water and rest at the riverside");
		playerHP = playerHP + river;
		System.out.println("Your  HP Recovered\nYour HP : " + playerHP);
				
		System.out.println("");
		System.out.println("\n\n1. Go back to crossroad");
		System.out.println("\n============================================");
		choice = sc.nextInt();
		if(choice == 1) {
			crossRoad();
		}
		else {
			north();
		}
	}
	public void east() {
		System.out.println("\n============================================");
		System.out.println("You walked into a forest. \nYou can search for herb and Observe");
		System.out.println("1. Observe");
		System.out.println("2. Collect Herb");
		System.out.println("3. Take a little Rest");
		choice = sc.nextInt();
		if(choice == 1) {
			gacha.observe();
			
			}
		
		else if(choice == 2) {
			
			gacha.collectHerb();
			
			}
		
		else if(choice == 3) {

			gacha.rest();
			}

		System.out.println("\n\n1. Go back to crossroad");
		System.out.println("2. Stay");
		System.out.println("\n============================================");
		choice = sc.nextInt();
		if(choice == 1) {
			crossRoad();
		} else {
			east();
		}
		
	
	}
	public void west() {
		System.out.println("===========================================\n You enchounter a monster"); //mon.mon1();
		System.out.println("\n");
		System.out.println("1. Fight");
		System.out.println("2. Run");
		System.out.println("===========================================");
		
		
		choice = sc.nextInt();
		if(choice == 1) {
			fight();
			
		}
		if (choice == 2){
			
			crossRoad();
		}
		else {
			west();
		}
		
}
public void fight() {
	System.out.println("===========================================");
	System.out.println("Your HP : " + playerHP);
	System.out.println("monster HP : " + monHP);
	System.out.println("\n1 : Attack\n2 : Run");
	System.out.println("===========================================");
	
	choice = sc.nextInt();
	
	if(choice == 1) {
		attack();
		
	}
	if (choice == 2){
		
		crossRoad();
	}
	else {
		fight();
	}
	
}
public void attack() {
	int playerD = 0;
	
	if(playerWeapon.equals("Knife")) {
		playerD = new java.util.Random().nextInt(4); 
		
	}
	if (playerWeapon.equals("Longsword")) {
		playerD = new java.util.Random(4).nextInt(10); 
	}
	
	System.out.println("You attack the Monster and gave " + playerD + " Damage!!!");
	monHP = monHP - playerD;
	System.out.println("Monster HP : " + monHP);
	
	if(monHP >=0&&playerHP>0) {
		int monD = 0;
		monD = new java.util.Random().nextInt(5);
		System.out.println("the Monster attacked You and gave : " + monD + " Damage!!!");
		playerHP = playerHP-monD;
		System.out.println("Player HP : " + playerHP);
		fight();
		}
	else if(monHP <0) {
			win();
			}
//	else if(monHP >=0&&playerHP>0) {
//		int monD = 0;
//		monD = new java.util.Random().nextInt(5);
//		System.out.println("the Monster attacked You and gave : " + monD + " Damage!!!");
//		playerHP = playerHP-monD;
//		System.out.println("Player HP : " + playerHP);
//		fight();
//		}
		else {
			dead();
			
		}
	}
	
	
public void dead() {
	System.out.println("===========================================");
	System.out.println("You are Dead "+ playerName +"!!!\nGAME OVER");
	System.out.println("===========================================");
	System.out.println("1. continue(Start New Life)");
	System.out.println("2. Surrender");
	System.out.println("3. ???");
	System.out.println("===========================================");
	choice = sc.nextInt();
	if(choice == 1) {
		contie();
		
	}
	
	if(choice == 2) {
		sur();
	}
	
//	if(choice == 3) {
//	
//	
//		}
	}
public void contie() {
	System.out.println("===========================================");
	System.out.println("You choose to continue, Welcome to Ur new Life.");
	System.out.println("===========================================");
	enter.nextLine();	
	enter.nextLine();
	playerSetup1();
	enter.nextLine();
	townGate();
	}

public void sur() {
		System.out.println("===========================================");
		System.out.println("You choose to Surrender");
		System.out.println("===========================================");
	
		}

//public void contie() {
//		System.out.println("===========================================");
//		System.out.println("You choose to continue, Welcome to Ur new Life.");
//		System.out.println("===========================================");
//		enter.nextLine();	
//		enter.nextLine();
//		playerSetup();
//		enter.nextLine();
//		townGate();
//		}
//	

public void win() {
	System.out.println("===========================================");
	System.out.println("You Kill the Monster!!!");
	System.out.println("The Monster dropped a Ring!");
	System.out.println("You obtain a Silver Ring lower-Grade");
	System.out.println("1. Go East");
	System.out.println("===========================================");
	silverRing = 1;
	choice = sc.nextInt();
	if(choice == 1) {
		crossRoad();
	}
	else {
		win();
	}
}

public void ending() {
	int rad;
	System.out.println("===========================================");
	System.out.println("Guard : oh You kill the Monster? Great!");
	System.out.println("Guard : it seems you are trusted guy.\n Welcome to Noel Town");
	System.out.println("1. Yes\n2. No");
	rad = enter.nextInt();
	if(rad == 1) {
		
		System.out.println("\n\n THE END \n\n");
		System.out.println("===========================================");
		ending();
	}else{
		System.out.println("You can't dodge the Ending.");
		ending();
		
	}
	
}























}
