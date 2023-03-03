package ac.jiu.java.grammer.chapter7;
import java.util.Scanner;

public class SevenSevenReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numLists = new int[10];
        System.out.print("Enter the 10 numbers : ");
        for (int i = 0; i < numLists.length; i++) {
            numLists[i] = scanner.nextInt();
        }
        int[] finalList = reverse(numLists);
        // for-each 문으로 배열 값 꺼내기
        for (int e : finalList) {
            System.out.print(e + " ");
        }

    }
    public static int[] reverse(int[] numLists) {
        int[] reverseList = new int[10];

        for (int i = 0; i < numLists.length; i++) {

            reverseList[numLists.length - (1 + i)] = numLists[i];

        }
        return reverseList;
    }
}
