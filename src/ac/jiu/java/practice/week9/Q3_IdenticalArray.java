package ac.jiu.java.practice.week9;
import java.util.*;
public class Q3_IdenticalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrayA = new int[3][3];
        int[][] arrayB = new int[3][3];

        System.out.println("Enter a matrix A : ");

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                arrayA[i][j] = scanner.nextInt();
            }
        }

        int[] sortedArrayA = sorting(arrayA);

        System.out.println("Enter a matrix B : ");
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB[i].length; j++) {
                arrayB[i][j] = scanner.nextInt();
            }
        }

        int[] sortedArrayB = sorting(arrayB);

        if (equals(sortedArrayA, sortedArrayB)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }

    }

    public static boolean equals(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
                if (arrayA[i] != arrayB[i])
                    return false;
            }
        return true;
    }

    public static int[] sorting(int[][] array) {
        int[] sortedArray = new int[9];

        // 2D array 1D array 안에 집어넣기
        for (int k = 0; k < sortedArray.length; k++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sortedArray[(3 * i) + j] = array[i][j];
                }
            }
        }


        // selection sort
        for (int i = 0; i < sortedArray.length - 1; i++) {
            int minValue = sortedArray[i];
            int minIndex = i;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < minValue) {
                    minValue = sortedArray[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                sortedArray[minIndex] = sortedArray[i];
                sortedArray[i] = minValue;
            }
        }
        return sortedArray;
    }
}
