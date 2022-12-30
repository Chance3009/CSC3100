import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Item 1: ");
		String item1 = sc.nextLine();
		System.out.print("Quantity: ");
		int n1 = sc.nextInt();
		System.out.print("Unit Price: RM");
		double price1 = sc.nextDouble();
		double totalPrice1 = price1 * n1;
		sc.nextLine();
		
		System.out.print("\nItem 2: ");
		String item2 = sc.nextLine();
		System.out.print("Quantity: ");
		int n2 = sc.nextInt();
		System.out.print("Unit Price: RM");
		double price2 = sc.nextDouble();
		double totalPrice2 = price2* n2;
		
		double subtotal = totalPrice1 + totalPrice2;
		double tax = 0.06 * subtotal;
		double charge = 0.1 * subtotal;
		double total = subtotal + tax + charge;
		
		System.out.println("\n*****************************************************\n");
		System.out.println("Item 1: " + item1);
		System.out.println("Quantity: " + n1);
		System.out.printf("Unit Price: RM%.2f\n", price1);
		System.out.printf("Amount: RM%.2f\n", totalPrice1);
		System.out.println("\nItem 2: " + item2);
		System.out.println("Quantity: " + n2);
		System.out.printf("Unit Price: RM%.2f\n", price2);
		System.out.printf("Amount: RM%.2f\n", totalPrice2);
		
		System.out.printf("\nSubtotal: RM%.2f\n", subtotal);
		System.out.printf("Government Tax: RM%.2f\n", tax);
		System.out.printf("Service Charge: RM%.2f\n", charge);
		System.out.printf("\nTotal: RM%.2f\n", total);
	}

}
