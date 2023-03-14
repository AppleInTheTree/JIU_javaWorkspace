package ac.jiu.java.grammer.chapter7;

import java.util.Scanner;

public class DuplicatesNumbers {
    public static void main(String[] args) {
        /*Enter 10 numbers and make a list*/
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Write your code here
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }



        int[] distinct = eliminateDuplicates(numbers);

        System.out.println("The distinct numbers are : ");

        for(int e: distinct){
            if (e > 0){
                System.out.print(" " + e);
            }
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list){
        // creating another array for only storing the unique elements
        int[] temp = new int[list.length];
        int j = 0;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] != list[i + 1]) { // 1 1 2 2 2 3 3 3
                temp[j++] = list[i];
            }
        }

        // This is for the last distinct number

        temp[j++] = list[list.length - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            list[i] = temp[i];
        }

        return temp;
    }
}
