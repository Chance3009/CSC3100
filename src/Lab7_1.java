import java.util.Scanner;

public class Lab7_1 {
	public static Scanner CONSOLE = new Scanner(System.in);
	public static void main(String[] args) {
		char hasNext = 'Y';
		do {
			int response;
			int age = getAge();
			double weight = getWeight();
			double height = getHeight();
			char gender = getGender();
			double BMI;
			double BMR;
			
			while (true) {
				response = getChoice();	
				if (response == 1) {
					BMI = calcBMI(weight, height);
					displayBMI(BMI, weight, height);
					break;
				} else if (response == 2) {
					BMR = calcBMR(age, gender, weight, height);
					displayBMR(BMR, age, gender);
					break;
				} else {
					System.out.println("Wrong code. Please enter 1 or 2 only.");
					continue;
				}
			}
			
			System.out.print("Do you want to continue? (Y|N): ");
			hasNext = Character.toUpperCase(CONSOLE.next().charAt(0));
			System.out.println("\n****************************************************\n");
		} while (hasNext == 'Y');
	}
	
	public static int getAge() {	
		System.out.print("Enter age: ");
		return CONSOLE.nextInt();
	}
	
	public static double getWeight() {
		System.out.print("Enter weight (kg): ");
		return CONSOLE.nextDouble();
	}

	public static double getHeight() {
		System.out.print("Enter height (cm): ");
		return CONSOLE.nextDouble();
	}
	
	public static int getChoice() {
		System.out.print("Enter choice (1-BMI | 2-BMR): ");
		return CONSOLE.nextInt();
	}
	
	public static char getGender() {
		System.out.print("Enter gender (F|M): ");
		return Character.toUpperCase(CONSOLE.next().charAt(0));
	}
	
	public static double calcBMI(double weight, double height) {
		height /= 100;
		return weight/(height*height);
	}
	
	public static double calcBMR(double age, char gender, double weight, double height) {
		if (gender == 'M') {
			return (66 + (6.23 * weight) + (12.7 * height) - (6.8 * age));
		} else {
			return (655 + (9.6 * weight) + (1.8 * height) - ( 4.7 * age));
		}
	}
	
	public static void displayBMI(double BMI, double weight, double height) {
		System.out.printf("Your height is %.2fcm and weight is %.2fkg. So your BMI is %.2f\n", height, weight, BMI);
	}
	
	public static void displayBMR(double BMR, int age, char gender) {
		if (gender == 'F')
			System.out.printf("Your age is %d, and your gender is female. So your BMR is %.2f\n", age, BMR);
		else 
			System.out.printf("Your age is %d, and your gender is male. So your BMR is %.2f\n", age, BMR);

	}
}
