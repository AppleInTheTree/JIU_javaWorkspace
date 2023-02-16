package ac.jiu.java.homework.assignment5;
import java.util.Scanner;
public class Q3_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String input = scan.nextLine();
        int len = input.length();
        String reversedString = "";

        for (int i = 1;  i < len + 1; i++) {
            reversedString += input.charAt(len - i);

        }

        System.out.println(reversedString);







    }



}
