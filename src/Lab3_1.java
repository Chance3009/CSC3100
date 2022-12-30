import java.util.Scanner;

public class Lab3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Matric: ");
		String matric = sc.nextLine();
		
		System.out.print("Enter mark for Assessment 1: ");
		double mark1 = sc.nextInt() * 0.15;
		
		System.out.print("Enter mark for Assessment 2: ");
		double mark2 = sc.nextInt() * 0.2;
		
		System.out.print("Enter mark for Lab Assignment: ");
		double markLab = sc.nextInt() * 0.35;
		
		System.out.print("Enter mark for Final Exam mark: ");
		double markFinal = sc.nextInt() * 0.3;
		
		double avg = mark1 + mark2 + markLab + markFinal;
		System.out.printf("Your average mark for CSC3100 (" + mark1 + "+" + mark2 + "+" + markLab + "+" + markFinal + ") is %.2f", avg);
	}
}
