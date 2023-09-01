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
        return isLengthValid(length) && isOnlyLettersAndDigits(password) && isUppercaseCharacters(password);

    }

    public static boolean isLengthValid(int validLength) {
        return validLength >= 8;

    }
    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {

            char check = password.charAt(i);
            if (!(Character.isDigit(check) || Character.isLetter(check))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isUppercaseCharacters(String password) {
        for (int i = 0; i < password.length(); i++) {

            char check = password.charAt(i);
            if (Character.isLowerCase(check)) {
                return true;
            }
        }
        return false;


    }
}
