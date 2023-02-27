package ac.jiu.java.practice.week4;

import java.util.Scanner;

public class Q4_Ji {
    public static void main(String[] args) {
        nPrint("ㅁ", 2);

    }
    static void nPrint(String message, int n) {
        while (n > 0) {
            System.out.println(message);
            n--;
        }
    }
}