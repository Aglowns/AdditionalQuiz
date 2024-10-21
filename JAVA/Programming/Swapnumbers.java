import java.util.Scanner;
public class Swapnumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("give a original number: ");
		System.out.println("num1 =");
		int num1 = input.nextInt();
		System.out.println("num2 =");
		int num2 = input.nextInt();
		System.out.println("original number are: num1=" +num1+ ", num2="+num2);
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("now the numbers are: num1=" +num1 +"num2=" +num2);
		}
	}

}
