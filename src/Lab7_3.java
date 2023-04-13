/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab 7
* Question 3
*/

import java.util.Scanner;

public class Lab7_3 {
	public static Scanner sc = new Scanner(System.in);
	public static double quizAvg;
	public static double asgmtAvg;
	public static double markMid;
	public static double markFinal;
	
	public static void main(String[] args) {
		boolean hasNext = false;
		
		do {
			System.out.print("Enter student's name: ");
			String name = sc.nextLine();
			readMark();
			double total = calcTotal(quizAvg, asgmtAvg, markMid, markFinal);
			char grade = calcGrade(total);
			displayFinal(name, total, grade);
			System.out.print("\nMore grade computation? y/n: ");
			hasNext = Character.toLowerCase(sc.next().charAt(0)) == 'y';
			sc.nextLine();
			System.out.println();
		} while (hasNext);
		
		System.out.println("Thank you!");
	}
	
	public static void readMark() {
		System.out.print("\nEnter mark for Quiz 1: ");
		double quiz1 = sc.nextDouble();
		System.out.print("Enter mark for Quiz 2: ");
		double quiz2 = sc.nextDouble();
		System.out.print("Enter mark for Quiz 3: ");
		double quiz3 = sc.nextDouble();
		quizAvg = calcQuizAvg(quiz1, quiz2, quiz3);
		System.out.printf("Quizzes average is: %.2f\n\n", quizAvg);
		
		System.out.print("Enter mark for Assignment 1: ");
		double asgmt1 = sc.nextDouble();
		System.out.print("Enter mark for Assignment 2: ");
		double asgmt2 = sc.nextDouble();
		asgmtAvg = calcAsgmtAvg(asgmt1, asgmt2);
		System.out.printf("Assignment average is: %.2f\n\n", asgmtAvg);
		
		System.out.print("Enter Mid-Term Exam mark: ");
		markMid = sc.nextDouble();
		System.out.print("Enter Final Exam mark: ");
		markFinal = sc.nextDouble();
	}
	
	public static double calcQuizAvg(double quiz1, double quiz2, double quiz3) {
		return (quiz1 + quiz2 + quiz3)/3.0;
	}
	
	public static double calcAsgmtAvg(double asgmt1, double asgmt2) {
		return (asgmt1 + asgmt2)/2;
	}
	
	public static double calcTotal(double markQuiz, double markAsgmt, double markMid, double markFinal) {
		return markQuiz + markAsgmt + (markMid*20/50) + (markFinal*40/80);
	}
	
	public static char calcGrade(double total) {
		if (total >= 80) return 'A';
		if (total >= 70) return 'B';
		if (total >= 55) return 'C';
		if (total >= 45) return 'D';
		return 'F';
	}
	
	public static void displayFinal(String name, double total, char grade) {
		System.out.printf("\n%s, your final mark for CSC3100 is %.2f and grade %c\n", name, total, grade);
	}
}
