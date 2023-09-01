package ac.indacheong.java.practice.week1;
import java.util.Scanner;
public class ScannerPracticeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        double number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextInt();

        System.out.println(number2 + number1);

        System.out.println(number1 - number2);

        System.out.println((int)(number1 / number2));

        System.out.println(number1 * number2);

    }
}
