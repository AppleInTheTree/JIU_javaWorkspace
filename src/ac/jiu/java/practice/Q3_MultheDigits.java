package ac.jiu.java.practice;
import java.util.Scanner;
public class Q3_MultheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10000");
        int input_number = input.nextInt();

        int number = (input_number % 10)  * ((input_number / 10) % 10) * ((input_number / 100) % 10) * ((input_number / 1000) % 10);


        System.out.println(number);


        }
}
