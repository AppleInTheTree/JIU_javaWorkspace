package ac.jiu.java.grammer.chapter12;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        int[] arrayList = new int[50];

        for (int i = 0; i < 50; i++) {
            arrayList[i] = -(1 + i);
        }

       try {
           Scanner scanner = new Scanner(System.in);
           System.out.println(arrayList[scanner.nextInt()]);
       }
       catch (java.lang.ArrayIndexOutOfBoundsException ex) {
           System.out.println("Out of Bounds");
       }

    }
}
