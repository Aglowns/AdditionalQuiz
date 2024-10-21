import java.util.Scanner;
public class salestax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the purchase amount:");
		double purchaseamount = scan.nextDouble();
		double salestax;
		if(purchaseamount>=20) {
			System.out.println("Are you a uncp student (yes/no)");
			String Studentstatus = scan.next();
			salestax = 0.10 * purchaseamount;
			}else {
				salestax = 0.05 *purchaseamount;
			}
	}

}
