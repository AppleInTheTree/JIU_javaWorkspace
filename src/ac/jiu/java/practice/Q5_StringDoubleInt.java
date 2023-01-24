package ac.jiu.java.practice;
import java.util.Scanner;

public class Q5_StringDoubleInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double a = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + a);
        System.out.println("Int: " + i);

    }
}
