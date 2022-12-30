import java.util.Scanner;

public class CaseStudy_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		int code = sc.next().charAt(0);
		System.out.println("ASCII code : " + code);
	}
}
