package programming;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        if (letter.length() != 1) {
            System.out.println("Invalid input");
        } else {
            char ch = Character.toLowerCase(letter.charAt(0));
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(letter + " is a vowel");
                } else {
                    System.out.println(letter + " is a consonant");
                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
