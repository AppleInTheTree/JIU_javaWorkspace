package ac.jiu.java.homework;
import java.util.Scanner;
public class AssignmentTwoTwo {
    public static void main(String[] args) {

        Scanner sc_one = new Scanner(System.in);
        Scanner sc_two = new Scanner(System.in);
        Scanner sc_three = new Scanner(System.in);

        System.out.println("Enter invesment amount : ");
        double invesment = sc_one.nextDouble();

        System.out.println("Enter annual interest rate in percentage : ");
        double interest_rate = sc_two.nextDouble() / 100;

        System.out.println("Enter number of the year : ");
        double year = sc_three.nextDouble();


        double future_value = invesment * Math.pow((1+((interest_rate)/12)), year * 12);
        System.out.printf("The future value is $ %.2f",future_value); //printf -> String.format,, by using %. we can round up the number


        sc_one.close();
        sc_two.close();
        sc_three.close();

    }
}
