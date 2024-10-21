import java.util.Scanner;
public class Balance {

	public static void main(String[] args) {
		double currentbalance = 5000;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the deposit amount: ");
		double deposit = input.nextDouble();
		double finalBalance = currentbalance + deposit;
		System.out.println("FinalBalance: $" + finalBalance);
		
	}

}
