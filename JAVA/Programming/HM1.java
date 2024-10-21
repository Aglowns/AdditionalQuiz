
import java.util. Scanner;
public class HM1 {
public static void main (String[] args) {
Scanner scanner = new Scanner (System. in);
System.out.print("Enter value for a: ");
double a = scanner.nextDouble(); 
System.out.print("Enter value for b: ");
double b = scanner.nextDouble(); 
System.out.print("Enter value for c: ");
double c = scanner.nextDouble(); // 
double disc = (b * b) - (4 * a * c);
System.out.println("Its discriminant is (" + b + ")^2 - 4*" + a + "*" + c + ", which is " + disc);
scanner.close();
}
}
