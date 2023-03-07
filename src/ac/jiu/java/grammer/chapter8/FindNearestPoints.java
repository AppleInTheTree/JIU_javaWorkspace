package ac.jiu.java.grammer.chapter8;
import java.util.Scanner;
public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of points: ");
        int numberPoints = scanner.nextInt();

        System.out.println("You have " + numberPoints + " Points");

        int[][] coordinates = new int[numberPoints][2];
        // 배열에 숫자 입력하기
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = scanner.nextInt();

            }
        }
        // 배열에 넣은 숫자 확인
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                System.out.print(coordinates[i][j] + " ");
            }
            System.out.println();
        }

        // 가장 짧은 거리 계산
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(coordinates[p1][0], coordinates[p1][1],
                coordinates[p2][0], coordinates[p2][1]);
        // 메소드를 불러오며 가장 짧은 거리 없데이트
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = i + 1; j < coordinates.length; j++) {
                double distance = distance(coordinates[i][0], coordinates[i][1],
                        coordinates[j][0], coordinates[j][1]);


                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.println("The closest two points are " + "(" +
                coordinates[p1][0] + ", " + coordinates[p1][1] + ") and (" +
                coordinates[p2][0] + ", " + coordinates[p2][1] + ")");


    }
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }
}
