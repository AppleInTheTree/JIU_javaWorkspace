package ac.jiu.java.practice.week4;

import java.util.Scanner;

public class Q4_Ji {
    public static void main(String[] args) {
        //System.out.println(xMethod(5));
        System.out.println(max(2.2, 2));

    }

    public static double max(int num1, double num2) {
        System.out.println("max(int, double) is invoked");

        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, int num2) {
        System.out.println("max(int, double) is invoked");

        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static int xMethod(int n, long l) {
        System.out.println("int");
        return n;
    }
    public static long xMethod(long n) {
        System.out.println("long");
        return n;
    }
}