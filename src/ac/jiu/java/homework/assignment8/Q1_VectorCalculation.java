package ac.jiu.java.homework.assignment8;
import java.util.*;

public class Q1_VectorCalculation {
    public static void main(String[] args) {

        double[][] fourMatrix = new double[4][4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a 4-by-4 matrix row by row" );

//        double totalNumber = 0;
        for (int i = 0; i < fourMatrix.length; i++) {
//            double average = 0;
            for (int j = 0; j < fourMatrix[i].length; j++) {
                fourMatrix[i][j] = scanner.nextDouble();
//                average += fourMatrix[i][j];
            }
//            System.out.println("Average of elements at column " + i + average / 4);
//            totalNumber += average;
        }
        double totalNum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Average of the elements at column " + i + " is " + averageColumn(fourMatrix, i));
            totalNum += averageColumn(fourMatrix, i);
        }
        System.out.println("Total Average is " + totalNum / 4);


//        System.out.println("Total Average is " + totalNumber / 4);
    }


    public static double averageColumn(double[][] m, int columIndex) {

        double average = 0;
        for (int i = 0; i < m[columIndex].length; i++) {
            average += m[columIndex][i];
        }
        return average / 4;
    }
}
