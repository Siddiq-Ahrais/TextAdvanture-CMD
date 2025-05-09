package def;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("You are walking in the forest");
		
		String myweapon;
		String myarmor;
		myweapon = "Axe";
		myarmor = "Leather Tunic";
		
		System.out.println("Your current Weapon is " + myweapon);
		System.out.println("Your current Armor is " + myarmor);
		
		int yourHP;
		yourHP = 10;
		
		System.out.println("Your current HP is " + yourHP);
		
		System.out.println("A monster attacked You and gave 4 damage!");
		yourHP = yourHP - 4;
		System.out.println("Your current HP is " + yourHP);
		
	
	}

}
