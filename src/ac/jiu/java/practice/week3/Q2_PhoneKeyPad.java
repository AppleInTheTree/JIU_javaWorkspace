package ac.jiu.java.practice.week3;
import java.util.Scanner;
public class Q2_PhoneKeyPad {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String input = scan.next();
        char first_letter = input.charAt(0);

        int digit = 0;
        if (!Character.isLetter(first_letter)) {
            System.out.println("It is not a letter");
        }
        else {
            for (int i = 0; i < input.length(); i++) {
                switch (Character.toUpperCase(input.charAt(i))) {
                    case 'A':
                    case 'B':
                    case 'C':
                        digit += 2;
                        break;
                    case 'D':
                    case 'E':
                    case 'F':
                        digit = 3;
                        break;
                    case 'G':
                    case 'H':
                    case 'I':
                        digit = 4;
                        break;
                    case 'J':
                    case 'K':
                    case 'L':
                        digit = 5;
                        break;
                    case 'M':
                    case 'N':
                    case 'O':
                        digit = 6;
                        break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                        digit = 7;
                        break;
                    case 'T':
                    case 'U':
                    case 'V':
                        digit = 8;
                        break;
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        digit = 9;
                        break;

                }
                System.out.print(digit);
            }
        }


    }
}
