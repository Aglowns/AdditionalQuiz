import java.util.Scanner;
public class Augmentedassigmentoperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter i value");
		int i = scan.nextInt();
		int sum =  i += 8;
		System.out.println("After:"+i);
	}

}
