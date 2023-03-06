package ac.jiu.java.grammer.chapter7;

public class SortingArray {
    public static void main(String[] args) {
//        int[] lists = new int[6];
//        lists =
        int[] list = {2, 0, 3, 40, 23, 50};

        // length - 1을 해준다 array ou of bound 방지
        for (int i = 0; i < list.length - 1; i++) {
            int min = list [i];
            int currentIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    currentIndex= j;
                }
            }

            if (currentIndex != i) {
                list[currentIndex] = list[i];
                list[i] = min;
            }

        }

        for (int e : list) {
            System.out.println(e);
        }

    }
}
