package programming;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		// Generate a random number to be guessed
		int number = (int)(Math.random()* 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between o and 100");
		
		int guess = -1;
		while (guess != number) {
			//Prompt the user to guess the number
			System.out.println("Enter your guess:");
			
		}

	}

}
