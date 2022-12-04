import java.util.Scanner;

public class Lab2 {
	public static final Scanner CONSOLE = new Scanner(System.in);
			
	public static void main(String[] args) {
		System.out.println("First question: ");
		question1();
		System.out.println("______________________________________________________________");
		System.out.println("Second question: ");
		question2();
		System.out.println("______________________________________________________________");
		System.out.println("Third question: ");
		question3();
		System.out.println("______________________________________________________________");
		System.out.println("Fourth question: ");
		question4();
		System.out.println("______________________________________________________________");
		System.out.println("Fifth question: ");
		question5();
		CONSOLE.close();
	}
	
	public static void question1() {
		System.out.print("First number: ");
		int n1 = CONSOLE.nextInt();
		System.out.print("Second number: ");
		int n2 = CONSOLE.nextInt();
		System.out.print("Third number: ");
		int n3 = CONSOLE.nextInt();
		double avg = (double) (n1 + n2 + n3)/3;
		System.out.println("Average of three numbers is " + avg);
	}
	
	public static void question2() {
		System.out.print("Original price: ");
		double price = CONSOLE.nextDouble();
		System.out.print("Discount (%): ");
		double percent = CONSOLE.nextDouble();
		double discount = (100 - percent)/100.0;
		double salePrice = price * discount;
		System.out.printf("Sale Price of the item is %.2f \n", salePrice);
	}
	
	public static void question3() {
		System.out.print("Weight (pound): ");
		double pound = CONSOLE.nextDouble();
		double kg = pound / 2.205;
		System.out.println("Weight (kilogram): " + kg);
	}
	
	public static void question4() {
		System.out.print("Weight (kg): ");
		double weight = CONSOLE.nextDouble();
		System.out.print("Height (m): ");
		double height = CONSOLE.nextDouble();
		double BMI = weight /(height * height);
		System.out.println("BMI: " + BMI);
	}
	
	public static void question5() {
		System.out.print("Integer: ");
		int n = CONSOLE.nextInt();
		int ans = 1;
		while (n!=0) {
		    ans *= n%10;
		    n /= 10;
		}
		System.out.println("Final answer: " + ans);
	}
}
