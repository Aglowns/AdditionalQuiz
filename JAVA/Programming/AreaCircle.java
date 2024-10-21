import java.util.Scanner;
public class AreaCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a radius of the circle");
		double radius = scan.nextDouble();
		if(radius>0) {
			double area = 3.14 * radius;
			System.out.println("the area of the circle:" +area);
			
		}
	}

}
