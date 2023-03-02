package ac.jiu.java.grammer.chapter7;
import java.util.*;

public class SevenThreeAnalyzingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();
        double[] numberList = new double[numberOfItems];
        double sum = 0;


        System.out.println("Enter the numbers");
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = scanner.nextDouble();

            sum += numberList[i];
        }
        double avg = sum / numberOfItems;
        int count = 0;

        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] > avg) {
                count++;
            }
        }
        System.out.println("Average is " + avg);
        System.out.println("Number of elements above the average is " + count);
    }

}
