package ac.jiu.java.practice.week2;
import java.util.Scanner;
public class Q3_DayOfTheWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter today's day: ");
        int date = scan.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = scan.nextInt();

        String dates = null;
        String future_day = null;

        switch (date) {
            case 0:
                dates = "Sunday";
                break;
            case 1:
                dates = "Monday";
                break;
            case 2:
                dates = "Thuesday";
                break;
            case 3:
                dates = "Wednesday";
                break;
            case 4:
                dates = "Thursday";
                break;
            case 5:
                dates = "Friday";
                break;
            case 6:
                dates = "Saturday";
                break;
            default:
                break;
        }

        if ((elapsed + date) % 7 == 0) {
            future_day = "Sunday";
        }
        else if ((elapsed + date) % 7 == 1) {
            future_day = "Monday";
        }
        else if ((elapsed + date) % 7 == 2) {
            future_day = "Thusday";
        }
        else if ((elapsed + date) % 7 == 3) {
            future_day = "Wednesday";
        }
        else if ((elapsed + date) % 7 == 4) {
            future_day = "Thursday";
        }
        else if ((elapsed + date) % 7 == 5) {
            future_day = "Friday";
        }
        else {
            future_day = "Saturday";
        }

        System.out.println("Today is " + dates + " Future day is " + future_day);
    }
}
