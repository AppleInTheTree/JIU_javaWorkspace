package ac.jiu.java.practice.week4;
import java.util.Scanner;
public class Q2_OddsPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scan.nextLine();

        int length = input.length();
        //System.out.println(length);
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                System.out.print(input.charAt(i));
            }
        }
    }
}
