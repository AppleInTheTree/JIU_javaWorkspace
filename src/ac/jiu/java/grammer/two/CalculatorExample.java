package ac.jiu.java.grammer.two;
class Calculator{ // 객체는 하나의 프로그램이다.
    int left, right; //인스턴스 변수
    static double PI = 3.14; // static이 있어서 클래스 변수이다 static은 클래스에 소속된다 모든 메소드에서 동일한 값을 가져온다
    public void setOprands(int left, int right){
        this.left = left; //this.을 해주면 클래스의 변수를 의미한다, .이 없으면 매개변수
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right + PI);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2 +PI);
    }

}
public class CalculatorExample {
    public static void main(String[] args) {
        /* 객체를 만든다 -> 사용자 정의데이터타입을 만든다,
        직접 메모리를 정의하여 사용한다

        객체는 변수와 메소드의 집합
        */

        Calculator c1 = new Calculator(); //클래스를 만들고 인스턴스를 만든다
        c1.setOprands(10, 20);

        c1.sum();
        c1.avg();
        System.out.println(c1.PI);
        System.out.println(Calculator.PI);
        Calculator.PI = 10;
        System.out.println(c1.PI);
    }
}

/*class 변수의 용도을 정리
* 인스턴스에 따라서 변하지 않는 값이 필요한 경우(위에 예에서는 PI)
* (final을 사용하면 바꿀수 없다)
* 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
* 값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우
* */
