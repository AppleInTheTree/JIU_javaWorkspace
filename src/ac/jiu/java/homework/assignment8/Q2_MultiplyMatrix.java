package ac.jiu.java.homework.assignment8;
import java.util.*;

public class Q2_MultiplyMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter of matrix A (m * n): ");
        int m = scanner.nextInt();
        int n1 = scanner.nextInt();

        System.out.println("Enter size of matrix B (n * p): ");
        int n2 = scanner.nextInt();
        int p = scanner.nextInt();

        if (n1 != n2) {
            System.out.println("Error: These matrices cannot be multiplied.");
            System.exit(1);
        }

        double[][] matrixA = new double[m][n1];
        double[][] matrixB = new double[n2][p];

        System.out.println("Enter matrix A: ");
        //matrix A init
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter matrix B: ");
        //matrix B init
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = scanner.nextDouble();
            }
        }

        // Display
        System.out.println("The multiplication of the matrices is ");
        double[][] finalMatrix = multiplyMatrix(matrixA, matrixB);
        for (int i = 0; i < finalMatrix.length; i++ ) {
            // 포멧팅 처음에 *, = 를 출력하기 위해서
            if (i == 0) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    System.out.printf("%-3.2f  ", matrixA[i][j]);
                }

                System.out.print("     *     ");

                for (int j = 0; j < matrixB[i].length; j++) {
                    System.out.printf("%-3.2f  ", matrixB[i][j]);
                }

                System.out.print("    =    ");

                for (int j = 0; j < finalMatrix[i].length; j++) {
                    System.out.printf("%-3.2f  ", finalMatrix[i][j]);
                }
                System.out.println();
            }
            else if (i <= matrixB[0].length - 1) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    System.out.printf("%-3.2f  ", matrixA[i][j]);
                }

                System.out.print("           ");

                for (int j = 0; j < matrixB[i].length; j++) {
                    System.out.printf("%-3.2f  ", matrixB[i][j]);
                }

                System.out.print("         ");

                for (int j = 0; j < finalMatrix[i].length; j++) {
                    System.out.printf("%-3.2f  ", finalMatrix[i][j]);
                }
                System.out.println();

            }
            else {
                for (int j = 0; j < matrixA[i].length; j++) {
                    System.out.printf("%-3.2f  ", matrixA[i][j]);
                }
                System.out.print("           ");

                System.out.printf("%-15s"," ");

                System.out.print("         ");


                for (int j = 0; j < finalMatrix[i].length; j++) {
                    System.out.printf("%-3.2f  ", finalMatrix[i][j]);
                }
                System.out.println();
            }
        }

    }

    // N 하고 P가 다를때 고치기 (완료)
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] mulMatrix = new double[a.length][b[0].length];

        for (int i = 0; i < mulMatrix.length; i++) {

            for (int j = 0; j < mulMatrix[i].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    mulMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return mulMatrix;
    }
}
