package programming;
import java.util.Scanner;

public class ifstatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade");
		int n = scan.nextInt();
		 if (n >= 90) {
			 System.out.println("A");
		 }
		 else if(n>=80) {
			 System.out.println("B");
		 }
		 else {
			 System.out.println("You failed the class");
		 }

	}

}
