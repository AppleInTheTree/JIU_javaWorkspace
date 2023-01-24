package ac.jiu.java.practice;
import java.util.Scanner;
public class Q6_CalculateEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms : ");
        double kilograms = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initial = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double final_temp = input.nextDouble();

        double energy = kilograms * (final_temp - initial) * 4184;

        System.out.println(energy);

    }

}
