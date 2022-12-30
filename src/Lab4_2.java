import java.util.Scanner;

public class Lab4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String BMI_Info;
		
		System.out.print("Enter gender ('W' for women | 'M' for man): ");
		char gender = Character.toUpperCase(sc.next().charAt(0));
		System.out.print("Enter BMI: ");
		double BMI = sc.nextDouble();
		System.out.print("Enter waist size: ");
		double waist = sc.nextDouble();
		
		if (BMI >= 35) {
			BMI_Info = "Severely Obese";
		} else if (BMI >= 30) {
			BMI_Info = "Obese";
		} else if (BMI >= 25) {
			BMI_Info = "Over Weight";
		} else if (BMI >= 18.5) {
			BMI_Info = "Normal";
		} else {
			BMI_Info = "Underweight";
		}
		
		System.out.println("\nWeight Category: " + BMI_Info );
		if ((gender == 'W' && waist > 35) || (gender == 'M' && waist > 40)) System.out.println("HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!");
	}
}
