package bmi;
import java.util.Scanner;

public class raden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Ahmad Raisul Siddiq";
		String b = "202443500970";
		
		
	try (Scanner sc = new Scanner(System.in)) {
		
		System.out.println("Username : ");
		String user = sc.nextLine();
		
		System.out.println("Password : ");
		String pass = sc.nextLine();
		
		if (user.equals(a) && pass.equals(b)) {
			System.out.print("Welcome to Body Mass Index (BMI) ");
			System.out.println(user);
			System.out.println(pass);
										
			
		}
		else {
			System.out.println("You are not Authorized");
			}
		
		System.out.println(" Menghitung BMI");

        System.out.print("Masukkan tinggi badan (dalam cm): ");
        double tinggiCm = sc.nextDouble();
        System.out.print("Masukkan berat badan (dalam kg): ");
        double berat = sc.nextDouble();

        double tinggiMeter = tinggiCm / 100;

        double bmi = berat / (tinggiMeter * tinggiMeter);

        System.out.println("BMI Anda adalah: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Over weight");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obesity");
        } else {
            System.out.println("Severe Obesity");
        }

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status : You are Ideal");
        } else {
            System.out.println("Status : You are Not Ideal");
        }
    		}
	}
}
	


