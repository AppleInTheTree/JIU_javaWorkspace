package ac.jiu.java.homework;
import java.util.Scanner;

public class AssignmentTwoOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println((input % 10) +((input / 10) % 10) + ((input / 100) % 10));

    }
}
