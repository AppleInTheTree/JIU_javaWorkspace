package ac.jiu.java.grammer.chapter9;

public class mutableTest {
    public static void main(String[] args) {

    }

//    private int[] values = new int[10];
    private int[] values;
    public int [] getValues() {
        return values;
    }
    public void printValues() {
        for (int i : values) {
            System.out.println(values[i]);
        }

    }



}
