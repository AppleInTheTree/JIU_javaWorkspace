package ac.jiu.java.grammer.chapter9;

public class BasicGrammarClassObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle();

        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(2);
        System.out.println(circle2.getArea());

        // null을 할당함으로 메모리를 관리한다
        circle2 = circle1;
        circle2 = null;

    }
}

class Circle {

    double radius;

    Circle() {
        radius = 1;
    }
    Circle(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
