/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab Assignment 5
* Question 1
*/

import java.util.Scanner;

public class Lab5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String string1 = sc.nextLine();
		if (string1.length() >= 10) {
			System.out.println("Substring from 5 to 10 " + string1.substring(4, 10) + ", length is " + string1.length());
		} else {
			System.out.println("String length less than 10");
		}
		
		System.out.print("\nEnter second string: ");
		String string2 = sc.nextLine();
		if (string1.contains(string2)) {
			System.out.println("Second String exists in First String\n");
			System.out.println("New statement in String 1: " + string1.replace(string2, "Selamat datang")); 
		} else {
			System.out.println("Second String not exists in First String");
		}
	}
}
