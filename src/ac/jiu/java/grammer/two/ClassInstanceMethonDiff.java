package ac.jiu.java.grammer.two;


/*
* 1. 인스턴스 메소드는 클래스 멤버에 접근 할 수 있다.
* 2. 클래스 메소드는 인스턴스 맴버에 접근 할 수 없다.
*  -> 인스턴스가 있다는 것은 클래스가 있다는 말이기 때문에 접근 가능
*   인스턴스 변수는 -> Non -Static Field
*   클래스 변수는 -> Static Field라고 하기도 한다.
*
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
    public static void main(String[] args) {
        CalculatorThree cal = new CalculatorThree();
        /*
        인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        인스턴스 메소드가 정적 변수에 접근 -> 성공
        * */
        cal.static_static();
        /*
        * 인스턴스를 이용해서 static 메소드에 접근 -> 성공
        * static 메소드가 인스턴스 변수에 접근 -> 실패
        * */
        cal.static_instance();
        /*
        * 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        * 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        * */
        cal.instance_static();
        /*
        * 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        * 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        * */
        cal.instance_instance();

        /*클래스를 이용해서 클래스 메소드에 접근 -> 성공
        * 클래스 메소드가 클래스 변수에 접근 -> 성공*/
        CalculatorThree.static_static();
        /*클래스를 이용해서 클래스 메소드에 접근 -> 성공
        * 클래스 메소드가 인스턴스 변수에 접근 -> 실패*/
        CalculatorThree.static_instance();

        /*클래스를 이용해서 인스턴스 메소드에 접근 -> 실패*/
        //CalculatorThree.instance_static();
        /*클래스를 이용해서 인스턴스 메소드에 접근 -> 실패*/
        //CalculatorThree.instance_instance();



    }

}
