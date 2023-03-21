package ac.jiu.java.practice.week9;
import java.util.*;


public class Q1_SumOfArray {

    public static void main(String[] args) {
        double[][] array = new double[3][4];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 * 4 matrix : ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < array[0].length; i++) {
            System.out.println("Average sum of the column " + i + " " + sumArray(array, i));
        }
    }

    public static double sumArray(double[][] array, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][columnIndex];
        }

        return sum;

    }
}
