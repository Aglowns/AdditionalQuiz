package programming;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int count = 0;
		int sum = 0;
		int average;
		while (count <10) {
			System.out.println("Enter your number");
			int in = input.nextInt();
			}
		average = sum/count;
		System.out.println("the average is:" +sum);
		count++;
		
	}

}
