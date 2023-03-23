package ac.jiu.java.grammer.chapter9;

public class Test3 {
    private final int hi;
    private final int hello;
    private int third;

    Test3() {
        this(1,3);
    }
    Test3(int a, int b) {
        this.hi = a;
        this.hello = b;
    }

    Test3(int a, int b, int c) {
        this(1, 4);
        this.third = c;
    }
}
