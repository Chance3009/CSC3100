import java.util.Scanner;

public class CaseStudy_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hexadecimal digit: ");
		String hex = sc.nextLine();
		int dec = Integer.parseInt(hex, 16);
		System.out.println("In decimal: " + dec);
	}
}
