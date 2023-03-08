package ac.jiu.java.grammer.chapter8;
import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {

        // Read a Sudoku solution
        int[][] grid = readASolution();

        System.out.println(isValid(grid) ? "Valid solution" :
                "Invalid solution");

    }
    public static int[][] readASolution() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution: ");
        int[][] grid = new int[9][9];

        // Enter an answer for Sudoku
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        return grid;

    }
    // Check whether a solution is valid
    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; i++) {
                if (grid[i][j] < 1 || grid[i][j] > 9 || !(isValid(i, j, grid))) {
                    return false;
                }
            }
        }
        return true;

    }
    // 수도쿠의 성질 : 열 행 그리고 3*3 박스에 한가지 숫자만 있어야 한다.
    public static boolean isValid(int i, int j, int[][] grid) {

        // 먼저 i 의 uniqueness 확인
        for (int col = 0; col < grid.length; col++) {
            if (col != j && grid[i][col] == grid[i][j]) {
                return false;
            }
        }
        // 그 다음 j 의 uniqueness 확인
        for (int row = 0; row < grid.length; row++) {
            if ( row != i && grid[row][j] == grid[i][j]) {
                return false;
            }
        }

        // 3*3 박스의 uniqueness 확인
        for (int row = (i / 3) * 3; row < ((i / 3) * 3 + 3); row++) {
            for(int col =(j / 3) * 3; col < ((j / 3) * 3 + 3); col++) {
                if (!(row == i && col == j) && grid[row][col] == grid[i][j]) {
                    return false;
                }

            }
        }
        return true;

    }
}
