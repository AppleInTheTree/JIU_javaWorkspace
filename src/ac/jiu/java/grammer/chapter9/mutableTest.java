package ac.jiu.java.grammer.chapter9;

public class mutableTest {
    public static void main(String[] args) {

    }

//    private int[] values = new int[10];
    private int[] values;
    public int [] getValues() {
        return values;
    }

    public static int number;

    // 생성사
    mutableTest(int number) {
        this.number = number;
    }
    mutableTest() { this.number = 1; }
    public void printValues() {
        for (int i : values) {
            System.out.println(values[i]);
        }
        System.out.println(number);

    }



}
