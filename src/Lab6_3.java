/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab 6
* Question 3
*/

import java.util.Scanner;

public class Lab6_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String status;
		String name;
		char gender;
		double height;
		double weight;
		double waist;
		double BMI;
		boolean hasNext;
		
		do {
			System.out.println("BMI information:\n"
					+ "BMI (18.5-24.9) -> Normal\n"
					+ "BMI (25-29.9) -> Over Weight\n"
					+ "BMI (30-34.9) -> Obese\n"
					+ "BMI (35-39.9) -> Severely Obeser\n"
					+ "BMI (>=40) -> Morbidly Obese\n"
					+ "********************************************\n"
					+ "CAUTION!!\n"
					+ "Women - waist size > 35 inches\n"
					+ "Men - waist size > 40 inches  \n"
					+ "----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------\n\n"
					+ "*******************************************\n\n"
					+ "HEALTH CALCULATOR");
					
			System.out.print("Enter your name : ");
			name = sc.nextLine();
			System.out.print("Enter your gender ([M]en | [W]omen) : ");
			gender = Character.toUpperCase(sc.next().charAt(0));
			System.out.print("Enter your height in meters : ");
			height = sc.nextDouble();
			System.out.print("Enter your weight in kilogram : ");
			weight = sc.nextDouble();
			BMI = weight/(height*height);
			System.out.print("Enter your waist size in inches : ");
			waist = sc.nextDouble();
			sc.nextLine();
			status = calcStatus(BMI);
			
			if (status == null || waist <= 0) {
				System.out.println("Invalid input. Please input again.");
				hasNext = true;
				continue;
			}
			
			System.out.printf("\n%s, your BMI is %f, so that means you are %s\n", name, BMI, status);
			
			if ((gender == 'W' && waist > 35) || (gender == 'M' && waist > 40)) 
				System.out.println("HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!\n");
			
			System.out.print("Continue with next person? ");
			hasNext = ('Y' == Character.toUpperCase(sc.next().charAt(0)));
			sc.nextLine();
			System.out.println();
		} while (hasNext);
				
		System.out.println("Thank you for using this system!");
	}
	
	public static String calcStatus(double BMI) {
		String status;
		if (BMI >= 40) 
			status = "morbidly obese";
		else if (BMI >= 35)
			status = "severely obese";
		else if (BMI >= 30)
			status = "obese";
		else if (BMI >= 25)
			status = "over weight";
		else if (BMI >= 18.5)
			status = "normal";
		else if (BMI >= 0)
			status = "underweight";
		else 
			status = null;
		return status;
	}
}
