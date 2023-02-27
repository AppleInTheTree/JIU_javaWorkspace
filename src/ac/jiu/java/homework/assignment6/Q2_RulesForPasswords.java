package ac.jiu.java.homework.assignment6;
import java.util.Scanner;


public class Q2_RulesForPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String input = scanner.nextLine();
        if (isVaild(input)) {
            System.out.println("Valid password");
        }
        else {
            System.out.println("Invaild password");
        }

    }
    public static boolean isVaild(String password) {
        int length = password.length();
        if (isLengthValid(password, length) && isOnlyLettersAndDigits(password) && isUppercaseCharacters(password)) {
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean isLengthValid(String password, int validLength) {
        if (validLength < 8) {
            return false;
        }
        else {
            return true;
        }

    }
    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {

            char check = password.charAt(i);
            if (Character.isDigit(check) || Character.isLetter(check)) {
                continue;
            }
            else {
                return false;
            }

        }
        return true;
    }
    public static boolean isUppercaseCharacters(String password) {
        int cnt = 0;
        for (int i = 0; i < password.length(); i++) {

            char check = password.charAt(i);
            if (Character.isLowerCase(check) && cnt == 0) {
                return true;
            }
            else {
                continue;
            }
        }
        return false;


    }
}
