package ac.jiu.java.practice.week4;

import java.util.Scanner;

public class Q4_Ji {
    public static void main(String[] args) {
        int[] oldList = {1, 2, 3, 4, 5};
        reverse(oldList);
        for (int i = 0; i < oldList.length; i++)
            System.out.print(oldList[i] + " ");
    }
    public static void reverse(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[list.length - 1 - i];
        }
        list = newList;
        for (int i = 0; i < list.length; i++)
        System.out.println(list[i]);
    }
}