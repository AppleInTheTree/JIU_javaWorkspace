package ac.jiu.java.homework.assignment5;

import java.util.Scanner;
public class Q1_PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int input = scanner.nextInt();

        int pos = 0;
        int neg = 0;
        double total = 0;
        int cnt = 0;

        if (input == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (input != 0) {
            if (input < 0) {
                neg++;
            }
            else {
                pos++;
            }
            cnt++;
            total +=input;
            input = scanner.nextInt(); // nextInt로 그 다음 정수를 계속 읽어온다
        }

        System.out.println("The number of positives is " + pos);
        System.out.println("The number of negatives is " + neg);
        System.out.println("The total is " + total);
        System.out.println("The average is " + total/cnt);


    }
}
