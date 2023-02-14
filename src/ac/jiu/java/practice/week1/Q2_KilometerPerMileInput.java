package ac.jiu.java.practice.week1;
import java.util.Scanner;
public class Q2_KilometerPerMileInput {
    public static void main(String[] args) {

        final double KILOMETERS_PER_MILES = 1.609;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for miles : ");
        double miles = input.nextDouble();

        double kilometers = miles * KILOMETERS_PER_MILES;
        System.out.println("Kilometers : " + kilometers);

    }
}
