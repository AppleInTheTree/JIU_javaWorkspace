package ac.jiu.java.midterm;
import java.util.Scanner;
public class Q1_Calculator {

    // 자바의 Math 모듈 메소드 실제로 구현해보기
    // 평균, max, min, power


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double input1 = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double input2 = scanner.nextDouble();

        System.out.println(power(input1, input2));
        System.out.println(avg(input1, input2));
        System.out.println(max(input1, input2));
        System.out.println(min(input1, input2));


    }
    public static double power(double num1, double num2) {
        double result = 1;

        for (double i = 1; i <= num2; i++) {
            result *= num1;
        }
        return result;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double min(double num1, double num2) {
        if (num1 > num2)
            return num2;
        else
            return num1;
    }

    public static double avg(double num1, double num2){
        return (num1 + num2) / 2;
    }
}

