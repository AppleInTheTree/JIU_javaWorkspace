package ac.jiu.java.grammer.chapter9;

public class BasicGrammarClassObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle();

        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(2);
        System.out.println(circle2.getArea());

        Circle.printInstance();

        // null을 할당함으로 메모리를 관리한다
//        circle2 = circle1;
//        circle2 = null;



    }
}

class Circle {

    double radius;

    // static을 써야지 클래스
    private static double numOfInstance = 0;


    Circle() {
        radius = 1;
        countInstance();
    } // 생성자
    Circle(double newRadius) {
        radius = newRadius;
        countInstance();
    } // 생성자

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void countInstance() {
        numOfInstance++;
    }

    public static void printInstance() {
        System.out.println(numOfInstance);
    }


}
