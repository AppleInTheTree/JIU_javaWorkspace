package ac.jiu.java.practice.week3;
import java.util.Scanner;
public class Q1_VowelsConosonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = scan.next();

        char first_letter = Character.toLowerCase(letter.charAt(0));

        if (!Character.isLetter(first_letter)) {
            System.out.println(first_letter + " is not a letter");
        }
        else {
            switch (first_letter) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(Character.toUpperCase(first_letter) + " is not a vowel");
                    break;
            }
        }
    }
}
