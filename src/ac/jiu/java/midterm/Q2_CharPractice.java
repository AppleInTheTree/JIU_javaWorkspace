package ac.jiu.java.midterm;
import java.util.*;
 public class Q2_CharPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the letters :");
        String letters = scanner.nextLine();

        if (validate(letters)) {
            System.out.println("The letter is a palindrome");
        }
        else {
            System.out.println("The letter is not a palindrome");
        }


    }

    private static boolean validate(String letters) {
        for (int i = 0; i < (letters.length()/2); i++) {
            if (letters.charAt(i) != letters.charAt(letters.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
