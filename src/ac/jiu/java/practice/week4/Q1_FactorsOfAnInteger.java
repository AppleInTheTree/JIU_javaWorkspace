package ac.jiu.java.practice.week4;
import java.util.Scanner;
public class Q1_FactorsOfAnInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int input = scan.nextInt();

        int index = 2;
        while (input / index != 1) {
            if (input % index == 0) {
                input /= index;
                System.out.print(index + ", ");
                //index = 2;

            }
            else {
                index++;
            }
        }
        System.out.print(input + ".");

    }
}
