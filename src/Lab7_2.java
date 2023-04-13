/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab 7
* Question 2
*/

import java.util.Scanner;

public class Lab7_2 {
	static double weightA;
	static double weightB;
	static double weightC;
	static double weightD;
	static int countA;
	static int countB;
	static int countC;
	static int countD;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean hasNext = true;
		do {
			weightA = 0;
			weightB = 0;
			weightC = 0;
			weightD = 0;
			countA = 0;
			countB = 0;
			countC = 0;
			countD = 0;
			
			for(int i=1; i<=10; i++) {
				System.out.printf("Enter weight for egg %d: ", i);
				double weight = sc.nextDouble();
				char grade = getGrade(weight);
				countGrade(grade);
			}
			
			displayReport();
			System.out.print("Enter next 10 eggs?[Y|N]: ");
			hasNext = Character.toUpperCase(sc.next().charAt(0)) == 'Y';
			System.out.println("\n");
		} while (hasNext);
		System.out.println("Thank you!");
	}
	
	public static char getGrade(double weight) {
		if (weight > 44) {
			weightA += weight;
			return 'A';
		}
		
		if (weight >= 30) {
			weightB += weight;
			return 'B';
		}
		
		if (weight >= 25) {
			weightC += weight;
			return 'C';
		}
		
		weightD += weight;
		return 'D';
	}
	
	public static void countGrade(char grade) {
		switch (grade) {
			case 'A':
				countA++;
				break;
			case 'B':
				countB++;
				break;
			case 'C':
				countC++;
				break;
			case 'D':
				countD++;
				break;
		}
	}
	
	public static void displayReport() {
		double averageA = countA == 0? 0: weightA/countA;
		double averageB = countB == 0? 0: weightB/countB;
		double averageC = countC == 0? 0: weightC/countC;
		double averageD = countD == 0? 0: weightD/countD;
		System.out.println("\n\n********************REPORT********************");
		System.out.println("\nTotal Amount of Grade A's Egg : " + countA);
		System.out.println("Total Amount of Grade B's Egg : " + countB);
		System.out.println("Total Amount of Grade C's Egg : " + countC);
		System.out.println("Total Amount of Grade D's Egg : " + countD);
		System.out.printf("\nAverage Weight of Grade A's Egg : %.2fg\n", averageA);
		System.out.printf("Average Weight of Grade B's Egg : %.2fg\n", averageB);
		System.out.printf("Average Weight of Grade C's Egg : %.2fg\n", averageC);
		System.out.printf("Average Weight of Grade D's Egg : %.2fg\n", averageD);
		System.out.printf("\nTotal Weight of All Eggs : %.2fg\n", (weightA+weightB+weightC+weightD));
		
	}
}
