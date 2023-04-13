import java.util.Scanner;

public class Topic7 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	
	public static double calcGross(double hour, double payRate) {
		return hour * payRate;
	}
	
	public static double calcNet(double gross) {
		return gross; 
	}
}
