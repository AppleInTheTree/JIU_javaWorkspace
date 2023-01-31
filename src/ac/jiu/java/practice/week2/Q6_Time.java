package ac.jiu.java.practice.week2;
import java.util.Scanner;
public class Q6_Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = (totalHours % 24) + offset;

        if(currentHour > 12)
            System.out.printf("The current time is %d:%d:%d PM\n",currentHour-12,currentMinute,currentSecond);
        else
            System.out.printf("The current time is %d:%d:%d AM\n",currentHour,currentMinute,currentSecond);

    }
}
