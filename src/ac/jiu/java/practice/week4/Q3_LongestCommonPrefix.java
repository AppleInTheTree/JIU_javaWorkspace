package ac.jiu.java.practice.week4;
import java.util.Scanner;

public class Q3_LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String stringFirst = scan.nextLine();
        System.out.println("Enter the second string: ");
        String stringSecond = scan.nextLine();

        int index = 0;
        String prefix = "";

        while (stringFirst.charAt(index) == stringSecond.charAt(index)) {
            prefix += stringFirst.charAt(index);
            index++;
        }

        if (prefix.length() != 0) {
            System.out.println("The common prefix is " + prefix);
        }
        else {
            System.out.println("There is no common prefix");
        }
    }
}
