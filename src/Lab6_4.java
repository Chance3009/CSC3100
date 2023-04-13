/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab 6
* Question 4
*/

import java.util.Scanner;

public class Lab6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distance;
		double claim; 
		
		for (int i=1; i<=20; i++) {
			System.out.println("Staff " + i);
			System.out.print("Enter distance (in km): ");
			distance = sc.nextDouble();
			claim = calcClaim(distance);
			System.out.printf("Total mileage claim for staff %d is RM%.2f\n\n", i, claim);
		}
	}
	
	public static double calcClaim(double distance) {
		double claim;
		if (distance <= 500) {
			claim = 0.7 * distance;
		} else {
			claim = (0.7 * 500) + (0.5 * (distance - 500));
		}
		return claim;
	}
}
