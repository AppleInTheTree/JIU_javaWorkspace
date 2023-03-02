package ac.jiu.java.practice.week6;
import java.util.Scanner;
public class Q1_ReturningMinimum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] list = new double[10];
        System.out.println("Enter the 10 numbers: ");
        list[0] = scanner.nextDouble();
        for (int i = 1; i < 10; i++) {
            double number = scanner.nextDouble();
            list[i] = number;


        };
        double mimNumber = min(list);
        System.out.println(mimNumber);


    }
    public static double min(double[] numList) {
        double min = numList[0];

        for (int i = 1; i < numList.length; i++) {
            if (numList[i] < min) {
                min = numList[i];
            }
        }
        return min;

    }
}
