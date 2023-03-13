package ac.jiu.java.homework.assignment7;

public class Q1_RandomArray {
    public static void main(String[] args) {
        int[] myList = new int[30];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = 1 + (int)(Math.random() * 20);

            if (i == 15)
                System.out.println();
            System.out.print(myList[i] + " ");
        }

        int[] numberLists = countNumbers(myList);

        for (int i = (numberLists.length -1); i > 0; i-- ) {
            if (numberLists[i] > 0)
                System.out.printf("\n%d occurs %d times \n", i, numberLists[i]);
            else
                System.out.printf("\n%d occurs %d time \n", i, numberLists[i]);
        }
    }

    public static int[] countNumbers(int[] myList) {
        int[] numbersList = new int[21];

        for (int i = 0; i < myList.length; i++) {
            numbersList[myList[i]]++;
        }
        return numbersList;
    }

}
