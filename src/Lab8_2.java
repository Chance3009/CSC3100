/**
* Matric number: 215035
* matric: Chan Ci En
* Program: Software Engineering
* Lab 8
* Question 2
*/

import java.util.Scanner;

public class Lab8_2 {
	public static Scanner sc = new Scanner(System.in);
	public static final int NUM = 5;
	public static int count = 0;
	public static double[][] arr = new double[NUM][6];
	public static char[] arrGrade = new char[NUM];
	public static int[] countList = new int[5];
	
 	public static void main(String[] args) {
		for(; count < NUM; count++) {
			System.out.print("Enter student's matric: ");
			arr[count][0] = sc.nextDouble();
			readMark();
			arr[count][5] = calcTotal(arr[count][1], arr[count][2], arr[count][3], arr[count][4]);
			arrGrade[count] = calcGrade(arr[count][5]);
			sc.nextLine();
			System.out.println();
		} 
		
		displayFinal();
	}
	
	public static void readMark() {
		System.out.print("Enter mark for Quiz 1: ");
		double quiz1 = sc.nextDouble();
		System.out.print("Enter mark for Quiz 2: ");
		double quiz2 = sc.nextDouble();
		System.out.print("Enter mark for Quiz 3: ");
		double quiz3 = sc.nextDouble();
		arr[count][1] = calcQuizAvg(quiz1, quiz2, quiz3);
		
		System.out.print("Enter mark for Assignment 1: ");
		double asgmt1 = sc.nextDouble();
		System.out.print("Enter mark for Assignment 2: ");
		double asgmt2 = sc.nextDouble();
		arr[count][2] = calcAsgmtAvg(asgmt1, asgmt2);
		
		System.out.print("Enter Mid-Term Exam mark: ");
		arr[count][3] = sc.nextDouble();
		System.out.print("Enter Final Exam mark: ");
		arr[count][4] = sc.nextDouble();
	}
	
	public static double calcQuizAvg(double mark1, double mark2, double mark3) {
		return (mark1 + mark2 + mark3)/3.0;
	}
	
	public static double calcAsgmtAvg(double mark1, double mark2) {
		return (mark1 + mark2)/2.0;
	}
	
	public static double calcTotal(double markQuiz, double markAsgmt, double markMid, double markFinal) {
		return markQuiz + markAsgmt + (markMid*20/50) + (markFinal*40/80);
	}
	
	public static char calcGrade(double total) {
		if (total >= 80) {
			countList[0]++;
			return 'A';
		}
		if (total >= 70) {
			countList[1]++;
			return 'B';
		}
		if (total >= 55) {
			countList[2]++;
			return 'C';
		}
		if (total >= 45) {
			countList[3]++;
			return 'D';
		}
		countList[4]++;
		return 'F';
	}
	
	public static void displayFinal() {
		System.out.println("Matric\t\tQuiz\t\tAssign\t\tMidTerm\t\tFExam\t\tTotalMark\tGrade");
		for(int i=0; i<NUM; i++) {
			System.out.printf("%-16.0f%-17.1f%-16.1f%-15.1f%-18.1f%-16.1f%c\n", arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4], arr[i][5], arrGrade[i]);
		}	
		
		System.out.printf("\nGrade A - %d students , %.1f%%\n", countList[0], (countList[0]*100.0/NUM));
		System.out.printf("Grade B - %d students , %.1f%%\n", countList[1], (countList[1]*100.0/NUM));
		System.out.printf("Grade C - %d students , %.1f%%\n", countList[2], (countList[2]*100.0/NUM));
		System.out.printf("Grade D - %d students , %.1f%%\n", countList[3], (countList[3]*100.0/NUM));
		System.out.printf("Grade F - %d students , %.1f%%\n", countList[4], (countList[4]*100.0/NUM));
	}
}
