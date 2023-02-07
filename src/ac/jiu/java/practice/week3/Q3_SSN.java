package ac.jiu.java.practice.week3;
import java.util.Scanner;
public class Q3_SSN {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String ssn = scan.next();

        for (int i = 0; i < ssn.length(); i++) {
            char check = ssn.charAt(i);
            if (i == 3 || i ==6) {
                if (!Character.isDigit(check)) {
                    if (ssn.charAt(i) == '-') {
                        continue;
                    }
                    else {
                        System.out.println(ssn + " is an invalid social security number");
                        System.exit(1);
                    }
                }
                else {
                    System.out.println(ssn + " is an invalid social security number");
                    System.exit(1);
                }
            }
        }
        System.out.println(ssn + " is a valid social security number");
    }
}
