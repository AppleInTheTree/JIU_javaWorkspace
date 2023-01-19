package ac.jiu.java.grammer.two;


/*
* 1. 인스턴스 메소드는 클래스 멤버에 접근 할 수 있다.
* 2. 클래스 메소드는 인스턴스 맴버에 접근 할 수 없다.
*  -> 인스턴스가 있다는 것은 클래스가 있다는 말이기 때문에 접근 가능
* */
class CalculatorThree{
    static int static_variable = 1; //static 변수는 = class 변수
    int instance_variable = 2; //instance 변수
    public static void static_static(){ //static에서 static을 불러올때
        System.out.println(static_variable);
    }
    public static void static_instance(){ //static에서 instance를 불러올때
        //System.out.println(instance_variable); 에러가 발생한다
    }
    public void instance_static(){ //instance에서 static을 불러올때
        System.out.println(static_variable); //에러가 발생하지 않는다
    }
    public void instance_instance(){
        System.out.println(instance_variable);
    }
}
public class ClassInstanceMethonDiff {

}
