import java.util.Scanner;
public class Absoultevalue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("read a number");
		int number = scan.nextInt();
		if(number<0){
			number = -1 * number;
			System.out.println("number" +number);
		}else {
			System.out.println("number" +number);		}

	}

}
