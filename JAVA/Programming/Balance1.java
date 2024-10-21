import java.util.Scanner;
public class Balance1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double balance = 5000;
		System.out.println("enter a deposit amount:");
		double deposit = scan.nextDouble();
		if(deposit>0) {
			balance = balance + deposit;
			System.out.println("updated balance:" +balance);
		}
	}

}
