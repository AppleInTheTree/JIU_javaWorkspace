package ac.jiu.java.grammer.chapter8;
import java.util.*;

public class Introduction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] secondSpace = new int[3][4];

        System.out.println("Enter a array that has 3 row 4 colum ");

        // 2차원 배열에 값 집어 넣기
        for (int i = 0; i < secondSpace.length; i++) {
            for (int j = 0; j < secondSpace[i].length; j++) {
                secondSpace[i][j] = scanner.nextInt();
            }
        }

        // 2차원 배열 값 더하기
        int result = 0;
        for (int i = 0; i < secondSpace.length; i++) {
            for(int j = 0; j < secondSpace[i].length; j++) {
                result += secondSpace[i][j];
            }
        }
        System.out.println(result);

        // 2차원 배열의 값 꺼내기
        for (int i = 0; i < secondSpace.length; i++) {
            for (int j = 0; j < secondSpace[i].length; j++) {
                System.out.print(secondSpace[i][j] + " ");
            }
            System.out.println();
        }

        // 2차원 배열 값 shuffling
        for (int i = 0; i < secondSpace.length; i++) {
            for (int j = 0; j < secondSpace[i].length; j++) {
                // Math.random() * 숫자 - 1 까지의 랜덤 숫자 반환 ()로 묶어주는거 까먹지 말기
                int randomI = (int) (Math.random() * (secondSpace.length));
                int randomJ = (int) (Math.random() * (secondSpace[i].length));

                int temp = secondSpace[i][j];
                secondSpace[i][j] = secondSpace[randomI][randomJ];
                secondSpace[randomI][randomJ] = temp;

            }
        }

        // Shuffling 후에 2차원 배열의 값 꺼내기
        for (int i = 0; i < secondSpace.length; i++) {
            for (int j = 0; j < secondSpace[i].length; j++) {
                System.out.print(secondSpace[i][j] + " ");
            }
            System.out.println();
        }

    }


}
