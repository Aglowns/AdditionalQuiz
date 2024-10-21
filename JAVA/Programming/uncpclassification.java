import java.util.Scanner;
public class uncpclassification {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the completed hours: ");
		int credits = scan.nextInt();
		if(credits <0) {
			System.out.println("Invalid credit:");
		} String type = null;
		if(credits <=29){
			type = "freshman";
		}else if(credits <=59) {
			type =  "Sophormore";
		}else if(credits<= 89) {
			type = "juniors";
		} else if(credits>= 90) {
			type = "seniors";
		}
		System.out.println(" Credits:" +credits+" , type: " + type);
	}

}
