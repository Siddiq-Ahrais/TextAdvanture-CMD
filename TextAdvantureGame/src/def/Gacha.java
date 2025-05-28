package def;
import java.util.Scanner;
public class Gacha {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		part3 ut = new part3();
		Scanner sc = new Scanner(System.in);
		int choice;
		
	}

public void playerSetup() {
		
		
	
	}

    public static void collectHerb() {
        double chance = Math.random(); // 0.0 - 1.0
        String hasil; // selalu didapat

        if (chance <= 0.02) {
            hasil = "Absolute Nature Glass";
        } else if (chance <= 0.3) {
            hasil = "Nature Glass High-Grade";
        } else if (chance <= 0.5) {
            hasil = "Nature Glass Middle-Grade";
        }else {  
        	hasil = "Nature Glass Low-Grade";
        }   
        
        System.out.println("----------------------------");
        System.out.println("====== Collect Result ======");
        System.out.println("----------------------------\n");
        System.out.println("You get " + hasil);
        System.out.println("\n-----------------------------");
        System.out.println("=============================");
       
        
    }

    public static void observe() {
    	
        System.out.println("----------------------------");
        System.out.println("====== Observe Result ======");
        System.out.println("----------------------------");
        System.out.println("\n- 0,2% Chance Ultimate Grade");
        System.out.println("- 20% Chance Epic Grade");
        System.out.println("- 50% Chance Rare Grade");
        System.out.println("- 100% Chance Common Grade ");
        int weaponr;
        String playerWeapon = "Knife";
        weaponr = new java.util.Random().nextInt(10);
        if (weaponr >= 5) {
        	System.out.println("While you observing, you accidently found a Longsword!!!");
        	playerWeapon = "Longsword";
        	System.out.println("Your currect Weapon is : " + playerWeapon);
        	System.out.println("\n-----------------------------");
            
            System.out.println("=============================");
        }
    }
    public static void rest() {
        System.out.println("---------------------------");
        System.out.println("======= Rest Result =======");
        System.out.println("---------------------------");
        System.out.println("--  You feel Refreshed  --");
        System.out.println("\n-------------------------");
        System.out.println("===========================");
        
        }
    
}
