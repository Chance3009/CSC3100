/**
* Matric number: 215035
* Name: Chan Ci En
* Program: Software Engineering
* Lab 8
* Question 1
*/


import java.util.Scanner;
import java.util.ArrayList;

public class Lab8_1 {
	static Scanner sc = new Scanner(System.in);	
	static int unhealthy = 0;
	static int[] countList = new int[6];
	static double[] totalList = new double[6];
	
 	public static void main(String[] args) {
		boolean hasNext = true;
		int count = 0;
		
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<Integer> ageList = new ArrayList<Integer>();
		ArrayList<Double> weightList = new ArrayList<Double>();
		ArrayList<Double> heightList = new ArrayList<Double>();
		ArrayList<Double> BMIList = new ArrayList<Double>();
		ArrayList<String> statusList = new ArrayList<String>();
		
		do {
			nameList.add(getName());
			ageList.add(getAge());
			weightList.add(getWeight());
			heightList.add(getHeight());
			BMIList.add(calcBMI(weightList.get(count), heightList.get(count)));
			statusList.add(calcStatus(BMIList.get(count)));
			
			System.out.print("Do you want to continue? (Y|N): ");
			hasNext = Character.toUpperCase(sc.next().charAt(0)) == 'Y';
			System.out.println("\n****************************************************\n");
			count++;
		} while (hasNext);
		
		System.out.println("Name\t\tAge\t\tWeight\t\tHeight\t\tBMI\t\tWeight Category");
		
		for(int i=0; i<count; i++) {
			System.out.printf("%-16s%-18d%-15.0f%-14.0f%-18.2f%s\n", nameList.get(i), ageList.get(i), weightList.get(i), heightList.get(i), BMIList.get(i), statusList.get(i));
		}
		
		double average0 = countList[0] == 0? 0: totalList[0]/countList[0];
		double average1 = countList[1] == 0? 0: totalList[1]/countList[1];
		double average2 = countList[2] == 0? 0: totalList[2]/countList[2];
		double average3 = countList[3] == 0? 0: totalList[3]/countList[3];
		double average4 = countList[4] == 0? 0: totalList[4]/countList[4];
		double average5 = countList[5] == 0? 0: totalList[5]/countList[5];

		System.out.println("\nThe number of user that has a BMI greater than 25 = " + unhealthy);
		System.out.printf("\nThe average BMI for underweight category = %.2f\n", average0);
		System.out.printf("The average BMI for normal category = %.2f\n", average1);
		System.out.printf("The average BMI for overweight category = %.2f\n", average2);
		System.out.printf("The average BMI for obese category = %.2f\n", average3);
		System.out.printf("The average BMI for severely obese category = %.2f\n", average4);
		System.out.printf("The average BMI for morbidly obese category = %.2f\n", average5);
	}
	
	public static String getName() {	
		System.out.print("Enter name: ");
		return sc.next();
	}
	
	public static int getAge() {	
		System.out.print("Enter age: ");
		return sc.nextInt();
	}
	
	public static double getWeight() {
		System.out.print("Enter weight (kg): ");
		return sc.nextDouble();
	}

	public static double getHeight() {
		System.out.print("Enter height (cm): ");
		return sc.nextDouble();
	}
	
	public static double calcBMI(double weight, double height) {
		height /= 100;
		return weight/(height*height);
	}
	
	public static String calcStatus(double BMI) {
		if (BMI < 18.5) {
			countList[0] ++;
			totalList[0] += BMI;
			return "Underweight";
		}
		if (BMI < 25) {
			countList[1] ++;
			totalList[1] += BMI;
			return "Normal";		
		}
		
		unhealthy ++;
		
		if (BMI < 30) {
			countList[2] ++;
			totalList[2] += BMI;
			return "Over Weight";
		}
		if (BMI < 35) {
			countList[3] ++;
			totalList[3] += BMI;
			return "Obese";
		}
		if (BMI < 40) {
			countList[4] ++;
			totalList[4] += BMI;
			return "Severely Obese";
		}
		
		countList[5] ++;
		totalList[5] += BMI;
		return "Morbidly Obese";
	}
	
}
