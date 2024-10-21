
import java.util.Scanner;
public class Conversation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter bits in second");
		long totalBits = input.nextLong();
		long totalBytes = totalBits/8;
		long KiloBytes = totalBytes/1024;
		long remainingBytes = totalBytes % 1024;
		long remainingBits = totalBits % 8;
		System.out.println(KiloBytes+"KB" + remainingBytes + "Bytes and " + remainingBits + "bits" );
	}

}
