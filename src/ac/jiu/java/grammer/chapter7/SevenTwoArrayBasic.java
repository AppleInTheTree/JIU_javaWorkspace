package ac.jiu.java.grammer.chapter7;

public class SevenTwoArrayBasic {
    public static void main(String[] args) {
        int[] list = new int[10];
        // Random shuffling
        for (int i = 0; i < list.length; i++) {
            int j = (int) Math.random() * list.length;
            int temp = list[i];

            list[i] = list[j];
            list[j] = temp;

        }

        // Shifting elements
        int temp = list[0];
        for (int a = 1; a < list.length; a++){
            list[a - 1] = list[a];
        }
        list[list.length - 1] = temp;

        for (int e : list) {
            System.out.println(e);
        }
    }
}
