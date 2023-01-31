package ac.jiu.java.practice.week2;
import java.util.Scanner;
import java.util.Random;
public class Q6_CoinToss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int coin_filp = rand.nextInt(2);

        System.out.println("Enter a your guess: ");
        int user_number = scan.nextInt();
        System.out.println(coin_filp);
        if (coin_filp == user_number) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Sorry, incorrect");
        }

    }
}
