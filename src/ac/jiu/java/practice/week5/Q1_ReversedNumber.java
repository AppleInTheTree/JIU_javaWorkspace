package ac.jiu.java.practice.week5;
import java.util.Scanner;

public class Q1_ReversedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input =  scanner.nextInt();
        reverse(input);


    }
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
}
