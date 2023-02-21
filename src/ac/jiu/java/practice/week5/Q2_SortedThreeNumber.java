package ac.jiu.java.practice.week5;
import java.util.Scanner;

public class Q2_SortedThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three number: ");
        double input1 = scanner.nextInt();
        double input2 = scanner.nextInt();
        double input3 = scanner.nextInt();

        displaySortedNumbers(input1, input2, input3);


    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max = 0;
        double temp = 0;
        double min = 0;
        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
                if (num2 > num3) {
                    min = num3;
                    temp = num2;
                }
            }
            else {
                if (num2 > num3) {
                    min = num3;
                    temp = num2;
                    max = num1;
                }
                else {
                    min = num2;
                    temp = num1;
                    max = num3;
                }
            }
        }
        else {
            if (num2 > num3) {
                max = num2;
                if (num1 > num3) {
                    min = num3;
                    temp = num1;
                }
            }
            else {
                if (num1 > num3) {
                    min = num3;
                    temp = num1;
                    max = num2;
                }
                else {
                    min = num1;
                    temp = num2;
                    max = num3;
                }
            }
        }
        System.out.println(min + " " + temp + " " + max);
    }


}
