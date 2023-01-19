package ac.jiu.java.grammer.two;
/*
* 상속은 상위 클래스의 기능을 하위 클래스에게 물려주는 기능이다.
* 그렇다면 하위 클래스는 상위 클래스의 메소드를 주어진 그대로 사용해야 할까?
* 만약 그래야 한다면 제약이 상당할 것이다. 이런 제약을 벗어나려면 하위 클래스가 부모
* 클래스의 기본적인 동작방법을 변경할 수 있어야 한다. -> 이것이 overriding
*
* overriding의 조건 (Method signature가 같아야 한다)
* 1. overriding을 하기 위해서는 메소드의 리턴 형식이 같아야 한다.
* 2. 메소드의 이름과 매개변수의 숫자, 데이터 타입, 그리고 순서가 모두 같아야 한다.
*
*
* super
* super를 사용하면 하위 클래스의 메소드에서 상위 클래스의 매소드를 호출할수 있다
*  -> 중복을 방지할수 있다.
* */

class MultiplyCal extends Calculator {
    public void sum() { // Overriding을 할때에는 같은 메소드이름을 써주어야 한다.
        System.out.println("실행결과는" + (this.left +this.right) + "입니다");
    }
    public int avg(){
        return super.avg(); // 부모 메소드의 값을 super를 통해 호출할 수 있다.
    }

    public void multiply() {
        System.out.println(this.left * this.right);
    }

}
public class Overriding {
    public static void main(String[] args) {

    MultiplyCal cal = new MultiplyCal();
    cal.setOprands(10, 20);
    cal.sum(); // Overriding을 통해 30이 아닌 실행결과는 30입니다가 출력된다.
        System.out.println(cal.avg());


    }


}
