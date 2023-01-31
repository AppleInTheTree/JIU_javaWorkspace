package ac.jiu.java.practice.week2;
import java.util.Scanner;
public class Q1_ifElseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double score  = scan.nextDouble();

        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

    }
}
