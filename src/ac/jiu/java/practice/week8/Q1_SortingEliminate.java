package ac.jiu.java.practice.week8;
import java.util.Scanner;

public class Q1_SortingEliminate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a ten number for elements in array : ");

        int[] unSortedArray = new int[10];

        for (int i = 0; i < unSortedArray.length; i++) {
            unSortedArray[i] = scanner.nextInt();
        }



        for (int i : eliminateDuplicate(selectionSort(unSortedArray))) {
            if (i != 0)
                System.out.print(" " + i);
        }

    }

    public static int[] selectionSort(int[] unSortedArray) {

        for (int i = 0; i < unSortedArray.length -1; i++) {
            int storedVar = unSortedArray[i];
            int minNumberIndex = i;
            for (int j = i + 1; j < unSortedArray.length; j++) {
                if (storedVar > unSortedArray[j]) {
                    minNumberIndex = j;
                    storedVar = unSortedArray[j];
                }
            }

            if (minNumberIndex != i) {
//                int temp = unSortedArray[i];
//                unSortedArray[i] = unSortedArray[minNumberIndex];
//                unSortedArray[minNumberIndex] = temp;
                // 더 간단한 방법
                unSortedArray[minNumberIndex] = unSortedArray[i];
                unSortedArray[i] = storedVar;
            }
        }
        return unSortedArray;
    }

    public static int[] eliminateDuplicate(int[] sortedList) {
        int[] setArray = new int[sortedList.length];

        int setArrayIndex = 0;

        for (int i = 0; i < sortedList.length - 1; i++) {


            if (sortedList[i] != sortedList[i + 1]) {
                // 처음에는 영을 넣고 그 다음에 1로 증가
                setArray[setArrayIndex++] = sortedList[i];
            }

        }

        setArray[setArrayIndex] = sortedList[sortedList.length - 1];
        // 이미 위에서 i+1 까지 검사를 하기 때문에 마지막 숫자가 그 전과 같지 않다는 것을 알고 있는 것이다. 때문에 If로 그 경우를 걸려줄 필요가 없다
//        if (setArray[setArrayIndex] != setArray[setArrayIndex - 1]) {
//            setArray[setArrayIndex] = sortedList[sortedList.length - 1];
//        }

        return setArray;

    }
}
