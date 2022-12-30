/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab 6
* Question 1
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab6_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int product;
		int quantity;
		double price = 0; 
		double sum = 0;
		
		while (true) {
			try { 
				System.out.print("Enter product number [1-5] (Enter 0 to terminate): ");
				product = sc.nextInt();	
				
				if (product < 0 || product > 5) {
					System.out.println("Please enter a valid product number [1-5]");
					continue;
				}
					
				if (product == 0) {
					break;
				}
					
				System.out.print("Quantity sold: ");
				quantity = sc.nextInt();
				
				System.out.println();
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid number");
				sc.nextLine();
				continue;
			}

			switch (product) {
				case 1:
					price = quantity * 2.98;
					break;
				case 2: 
					price = quantity * 4.50;
					break;
				case 3:
					price =  quantity * 9.98;
					break;
				case 4:
					price = quantity * 4.49;
					break;
				case 5: 
					price = quantity * 6.87;
			}
			sum += price;
		}
		System.out.printf("Total retail value is RM%.2f", sum);
	}
}
