package ac.indacheong.java.practice.week1;
import java.util.Scanner;

public class ScannerPracticeTwo {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);


        // PI는 고정 값 3.14
        final double PI =  3.14;


        // 반지름은 r Scanner 값 받아오기
        System.out.println("Enter the radius : ");
        int r  = scanner1.nextInt();

        System.out.println("원의 둘래는 :" + (2 * PI * r));
        // (2 * PI * r)


    }
}
