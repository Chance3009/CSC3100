public class AnotherLab2 {
	public double question1(int n1, int n2, int n3) {
		double avg = (double) (n1 + n2 + n3)/3;
		return avg;
	}
	
	public double question2(double price, double percent) {
		double discount = (100 - percent)/100.0; 
		double salePrice = price * discount;
		return salePrice;
	}
	
	public double question3(double pound) {
		double kg = pound / 2.205;
		return kg;
	}
	
	public double question4(double weight, double height) {
		double BMI = weight /(height * height);
		return BMI;
	}
	
	public int question5(int n) {
		int ans = 1;
		while (n!=0) {
		    ans *= n%10;
		    n /= 10;
		}
		return ans;
	}
}
