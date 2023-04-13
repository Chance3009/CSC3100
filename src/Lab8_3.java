/**
* Matric number: 215035
* matric: Chan Ci En
* Program: Software Engineering
* Lab 8
* Question 3
*/

import java.util.Arrays;
import java.util.Scanner;

public class Lab8_3 {	
	public static final int NUM = 11;
	public static final int DAY = 7;
	public static int overall;
	public static String[] states = new String[NUM];
	public static int[][] cases = new int[NUM][DAY];
	public static int[] total = new int[NUM];
	
	public static void main(String[] args) {
		readCase();
		for(int i=0; i<NUM; i++) {
			total[i] = calcTotal(cases[i]);
		}
		calcOverall();
		displayTable();
		displayGraph();
	}
	
	public static void readCase() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<NUM; i++) {
			System.out.printf("State [%d]: ", (i+1));
			states[i] = sc.nextLine();
			System.out.print("Number of cases a week: ");
			
			for(int j=0; j<DAY; j++) {
				cases[i][j] = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.println();
		}
	}
	
	public static int calcTotal(int[] arr) {
		return Arrays.stream(arr).sum();
	}
	
	public static void calcOverall() {
		overall = Arrays.stream(total).sum();
	}
	
	public static void displayTable() {
		System.out.println("_______________________________________ COVID-19 IN A WEEK _______________________________________");
		System.out.println("Diseases\\Day\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun\tTotal");
		for(int i=0; i<NUM; i++) {
			System.out.printf("%-24s", states[i]);	
			for(int j=0; j<DAY; j++) {
				System.out.printf("%-8d", cases[i][j]);	
			}
			System.out.printf("%-7d\n", total[i]);	
		}
		System.out.println("__________________________________________________________________________________________________");
		System.out.println("Overall Total\t\t\t\t\t\t\t\t\t" + overall);
	}
	
	public static void displayGraph() {
		System.out.println("\nLine Graph >>>>>>\n");
		for(int i=0; i<NUM; i++) {
			System.out.printf("%-24s", states[i]);
			double temp = total[i]*100.0/overall;
			for(int j=0; j<temp; j++) {
				System.out.print("*");
			}
			System.out.printf(" %.2f%%\n", temp);
		}
	}
}
