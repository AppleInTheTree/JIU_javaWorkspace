package ac.jiu.java.homework.assignment5;
import java.util.Scanner;
public class Q2_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int cnt = 0;
        int primeCount = 0;
        for (int i = 2; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                if ( i % j == 0) {
                    primeCount++;
                }

            }
            if (primeCount == 2){
                cnt++;

                if (cnt % 8 != 0) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.println(i);
                }
            }

            primeCount = 0;

        }

    }
}
