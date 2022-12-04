/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab Assignment 5
* Question 2
*/

import java.util.Scanner;

public class Lab5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first String: ");
		String string1 = sc.nextLine();
		if (string1.length() > 8) {
			System.out.println("Valid password!!");
		} else {
			System.out.println("Invalid password");
		}
		System.out.println("First String: \"" + string1 + "\" with length " + string1.length());
		
		System.out.print("\nEnter second string: ");
		String string2 = sc.nextLine();
		if (string1.contains(string2)) {
			System.out.println("Second String exists in First String");
		} else {
			System.out.println("Second String not exists in First String\n");
			System.out.println("New statement in String1: " + string1 + string2);
		}
	}
}
