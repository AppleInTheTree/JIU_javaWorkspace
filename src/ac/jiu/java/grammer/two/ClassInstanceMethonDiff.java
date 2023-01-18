package ac.jiu.java.grammer.two;


/*
* 1. 인스턴스 메소드는 클래스 멤버에 접근 할 수 있다.
* 2. 클래스 메소드는 인스턴스 맴버에 접근 할 수 없다.
*  -> 인스턴스가 있다는 것은 클래스가 있다는 말이기 때문에 접근 가능
* */
class CalculatorThree{
    static int static_variable = 1;
    int instance_variable = 2;
    public static void static_instance(){
        //System.out.println(instance_variable);
    }
    public void instance_static(){
        System.out.println(static_variable);
    }
}
public class ClassInstanceMethonDiff {

}
