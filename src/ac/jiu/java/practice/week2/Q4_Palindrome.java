package ac.jiu.java.practice.week2;
import java.util.Scanner;
public class Q4_Palindrome {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int number = scan.nextInt();
        int first_digit = number % 10;
        //int second_digit = (number / 10) % 10;
        int third_digit = number / 100 ;


        System.out.println((first_digit == third_digit) ? "is Palindrome" : "Not a Palindrome");

    }
}
