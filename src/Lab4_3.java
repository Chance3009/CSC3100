import java.util.Scanner;

public class Lab4_3 {

	public static void main(String[] args) {
		String program = "";
		int index = -1;
		int fees = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Code Program: ");
		String code = sc.nextLine().toUpperCase().trim();
		System.out.print("Semester No: ");
		int sem = sc.nextInt();
		System.out.print("Credit Hours Registred: ");
		int credit = sc.nextInt();
		
		System.out.println("----------------------------------------------------");
		
		int[][] feesArr = {{1250,1000,250}, {1400,1100,250}, {1250,1000,275}, {1250,1000,350}};
		switch(code) {
			case "MCS":	
				program = "Master of Computer Science";
				index = 0;
				break;
			case "ME":
				program = "Master of Environment";
				index = 1;
				break;
			case "MPM":
				program = "Master in Plantation Management";
				index = 2;
				break;
			case "MEOH":
				program = "Master of Environmental and Occupational Health";
				index = 3;
			default:
				System.out.println("Invalid input");
				System.exit(0);
		}
		
		try { 
			if (sem == 1) {
				fees = credit * feesArr[index][2] + feesArr[index][0];
			} else {
				fees = credit * feesArr[index][2] + feesArr[index][1];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		
		System.out.println("Master Program: " + program);
		System.out.println("Semester No: " + sem);
		System.out.println("Credit Hours: " + credit);
		System.out.println("Total Tuition Fees: RM" + fees);
	}

}
