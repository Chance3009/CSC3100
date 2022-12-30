import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		System.out.print("Park Type ('T' for theme park|'W' for water park|'B' for both park): ");
		char parkType = Character.toUpperCase(sc.next().charAt(0));
		
		System.out.print("Age: ");
		int age = sc.nextInt();
		
		int ageGroup;
		
		int[][] parks = {{10, 25, 20, 10, 0}, 
						{15, 30, 25, 15, 7}, 
						{20, 45, 40, 20, 5}};
			  
		if (age > 54) {
			ageGroup = 0;
		} else if (age > 20) {
			ageGroup = 1;
		} else if (age > 12) {
			ageGroup = 2;
		} else if (age > 2) {
			ageGroup = 3;
		} else {
			ageGroup = 4;
		}

		switch (parkType) {
			case 'T':
				price = parks[0][ageGroup];
				break;
			case 'W':
				price = parks[1][ageGroup];
				break;
			case 'B':
				price = parks[2][ageGroup];
				break;
			default:
				System.out.println("\nError. Invalid input");
				System.exit(0);
		}
	
		System.out.println("\nThe ticket price is RM" + price);

	}
}
