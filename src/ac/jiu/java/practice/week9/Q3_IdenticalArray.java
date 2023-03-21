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
        System.out.println("Enter a matrix B : ");
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB[i].length; j++) {
                arrayB[i][j] = scanner.nextInt();
            }
        }

        if (equals(arrayA, arrayB)) {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }

    }

    public static boolean equals(int[][] arrayA, int[][] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if (arrayA[i][j] != arrayB[i][j])
                    return false;
            }
        }
        return true;
    }
}
