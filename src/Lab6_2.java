/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab 6
* Question 2
*/

import java.util.Scanner;

public class Lab6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int ticket;
		char nation;
		char category;
		char foreign = ' ';
		double price;
		double total;
		boolean hasNextTicket = false;
		boolean hasNextVisitor = false;
		
		do {
			System.out.println("****** VISITOR " + count + " *******\n");
			System.out.print("Enter your nationality ([M]alaysian | [F]oreigner) : ");
			nation = Character.toUpperCase(sc.next().charAt(0));
			total = 0;
			
			do {				
				if (nation == 'F') {
					System.out.print("From which part? (I-Kad/Working Permit/Dependent Pass | E-Asean | O-Others) : ");
					foreign = Character.toUpperCase(sc.next().charAt(0));
				}
				
				System.out.print("Choose category of visitor ([A]dult | [C]hildren | [S]enior): ");
				category = Character.toUpperCase(sc.next().charAt(0));
				System.out.print("Number of tickets: ");
				ticket = sc.nextInt();
				sc.nextLine();
				price = ticket * calcPrice(nation, category, foreign);
				if (price <= 0) {
					System.out.println("Invalid input, please input again.");
					break;
				}
					
				total += price;
				System.out.printf("Visitor Type %c Charge RM%.2f\n", category, price);
				System.out.print("Buy other ticket ([Y]es | [N]o)? ");
				hasNextTicket = ('Y' == Character.toUpperCase(sc.next().charAt(0)));
				
			} while (hasNextTicket);
			
			System.out.printf("The total payment for VISITOR %d is RM%.2f\n\n", count, total);
			System.out.print("Enter another visitor ([Y]es | [N]o): ");
			System.out.println();
			hasNextVisitor = ('Y' == Character.toUpperCase(sc.next().charAt(0)));
			count++;
			
		} while (hasNextVisitor);
		
		System.out.println("\nThank you!");
	}
	
	public static double calcPrice(char nation, char category, char foreign) {
		double[][] foreignArr = {{50,61,82}, {25,33,43}, {50,61,82}};
		double[] msiaArr = {43, 16, 21};
		int index = -1;
		int index2 = -1;
		double price = 0;
		
		switch (category) {
			case 'A':
				index = 0;
				break;
			case 'C': 
				index = 1;
				break;
			case 'S':
				index = 2;
		}
		
		switch (foreign) {
			case 'I':
				index2 = 0;
				break;
			case 'E': 
				index2 = 1;
				break;
			case 'O':
				index2 = 2;
		}
		
		try {
			switch (nation) {
				case 'M':
					price = msiaArr[index];
					break;
				case 'F':
					price = foreignArr[index][index2];
			} 
		} catch (ArrayIndexOutOfBoundsException e) {
			price = -1;
		}
			
		return price;
	}
}
