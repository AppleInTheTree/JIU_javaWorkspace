package ac.jiu.java.homework.assignment11;

public abstract class Predator extends Animal {
    private static final int LEG_COUNT = 4;


    Predator () {

    }

    static int speed() {
        return LEG_COUNT * 30;
    }
    public abstract String getFood();
    public void printFood() {
        System.out.println(getFood());
    }
    // getFood 출력
}
