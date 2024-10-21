import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the purcahse amount:");
		double purchaseamount = scan.nextDouble();
		double Discount;
		double finalamount;
		if(purchaseamount >100) {
			Discount = 0.10 * purchaseamount;
			System.out.println("Discount: %2f\n" +Discount);
			finalamount = purchaseamount - Discount;
			System.out.println("finalamount: %2f\n" + finalamount);
		} 
		else {
			Discount = 0.05 * purchaseamount;
			
		}
		
	}

}
