package ac.jiu.java.grammer.two;
class CalculatorFive extends Calculator{ // 객체를 상속하는건 계속 할 수 있다. 상속을 규칙적이게 잘 할수 있는 방법을 찾아야 한다.

    public void subtract() {
        System.out.println(this.left - this.right); // 기존의 Calculator 객체에 subtract을 추가한다.
    }
}
class CalculatorSix extends CalculatorFive{ // 이런식으로 상속했던 객체를 또 상속할수 있다
    public void multiply() {
        System.out.println(this.left * this.right); // 기존의 Calculator 객체에 subtract을 추가한다.
    }
}
public class InheritanceOne {
    /*
    * 객체지향을 통해서 달성하고자 하는 목표 중에서 가장 중요한 것은 재활용성일 것이다.
    * 상속은 객체지향의 재활용성을 극대화시킨 프로그래밍 기법이라고 할 수 있다.
    *
    * 상속(Inheritance)란 물려준다는 의미다. 어떤 객체가 있을때 그객체의 Field(variable)과 Method를
    * 다른 객체가 물려 받을 수 있는 기능을 상속이라고 한다.(부모와 자식의 관계)
    *
    * 예를 들어 어떤 클래스를 쓰고 있다가 기능을 추가하고 싶을때
    * 기존을 객체를 그대로 유지하면서 어떤 기능을 추가하는 방법이 상속이다.
    * 기존의 객체는 기능을 물려준다는 의미에서 부모객체(super)가 되고
    * 새로운 객체는 기존 객체의 기능을 물려받는 다는 의미에서 자식 객체(sub)가 된다.
    * */

    public static void main(String[] args) {
        CalculatorFive cal_sub = new CalculatorFive();
        cal_sub.setOprands(10, 20); // 기존의 부모 객체인 calculator의 메소드도 사용가능
        cal_sub.sum();
        cal_sub.subtract();
    }
}
