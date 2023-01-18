package ac.jiu.java.grammer.one;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Systme.in은 사용자가 입력할 값
//        int i = sc.nextInt();
//        System.out.println(i * 1000);
//        sc.close();

        /*hasNextInt()로 여러번 입력을 받아올수 있다*/
        while (sc.hasNextInt()){
            System.out.println(sc.nextInt() * 1000);
        }
        sc.close();
    }
}
