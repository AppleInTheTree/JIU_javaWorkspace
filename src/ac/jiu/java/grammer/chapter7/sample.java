package ac.jiu.java.grammer.chapter7;

public class sample {
    public static void main(String[] args) {
        int[] array = {1, 4, 4, 5, 7, 10};

        System.out.println(binary(array, 4));

        for (int i : deleteDuplicate(array)) {
            System.out.println(i);
        }

    }

    public static int[] deleteDuplicate(int[] array) {
        int[] newArray = new int[array.length];
        int newIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] != array[i + 1]) {
                newArray[newIndex++] = array[i];
            }
        }

        return newArray;
    }


    public static int binary(int[] array, int num) {
        int low = 0;

        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (num == array[mid]) {
                return mid;
            }
            else if (num < array[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
