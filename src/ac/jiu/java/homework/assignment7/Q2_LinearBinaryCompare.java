package ac.jiu.java.homework.assignment7;


public class Q2_LinearBinaryCompare {
    public static void main(String[] args) {

        int[] numLists = new int[100000];

        for (int i = 0; i < numLists.length; i++) {
            numLists[i] = i + 1;
        }
        int[] sortList = selectionSorting(numLists);
        int averageLinear = 0;
        int averageBinary = 0;

//        for (int i : sortList) {
//            System.out.println(i);
//        }

        System.out.println("Iteration" + "  Key " + "       Timer(Linear) " + " Result(Linear) " +
                " Time(Binary)" + "   Result(Binary) ");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i <= 10; i++) {
            int randNum = numLists[(int)(Math.random() * sortList.length)];
            long startTimeLinear = System.nanoTime();
            int indexLinear = linearSearch(numLists, randNum);
            long endTimeLinear = System.nanoTime();

            long startTimeBinary = System.nanoTime();
            int binaryLinear = binarySearch(numLists, randNum);
            long endTimeBinary = System.nanoTime();


            long executionTimeLinear =endTimeLinear - startTimeLinear;
            long executionTimeBinary = endTimeBinary - startTimeBinary;

//            System.out.printf(i + "  " + randNum + "  " +
//                    executionTimeLinear + "  " + indexLinear + " | " + executionTimeBinary + "  " + binaryLinear);
            System.out.printf("%-9d %-15d %-15d %-15d %-15d %-15d",i, randNum, executionTimeLinear, indexLinear, executionTimeBinary, binaryLinear);
            System.out.println();
            averageLinear += executionTimeLinear;
            averageBinary += executionTimeBinary;
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Average : " + averageLinear / 10 + "     " + averageBinary / 10);

    }



    public static int[] selectionSorting(int[] numLists) {
        int currentMinIndex = 0;
        // 마지막 직전과 마지막을 비교하기 때문에 (length - 1)
        for (int i = 0; i < numLists.length - 1; i++) {
            int minNumber = numLists[i];
            for (int j = i + 1; j < numLists.length; j++) {
                if (minNumber > numLists[j]) {
                    minNumber = numLists[j];
                    currentMinIndex = j;
                }

            }

            if (minNumber != numLists[i]) {
                int temp = numLists[i];
                numLists[i] = numLists[currentMinIndex];
                numLists[currentMinIndex] = temp;
            }
        }
        return numLists;
    }

    public static int linearSearch(int[] numLists, int num) {

        for (int i = 0; i < numLists.length; i++) {
            if (numLists[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] numLists, int num) {
        int low = 0;
        int high = numLists.length - 1;

        while (low < high) {
            int mid  = (low + high) / 2;

            if (num == numLists[mid]) {
                return mid;
            }
            else if (num < numLists[mid]) {
                high  = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -low -1;
    }



}
