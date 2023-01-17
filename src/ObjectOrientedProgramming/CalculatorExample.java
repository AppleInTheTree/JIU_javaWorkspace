package ObjectOrientedProgramming;
class Calculator{ // 객체는 하나의 프로그램이다.
    int left, right;
    public void setOprands(int left, int right){
        this.left = left; //this.을 해주면 클래스의 변수를 의미한다, .이 없으면 매개변수
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }

}
public class CalculatorExample {
    public static void main(String[] args) {
        /* 객체를 만든다 -> 사용자 정의데이터타입을 만든다,
        직접 메모리를 정의하여 사용한다*/

        Calculator c1 = new Calculator(); //클래스를 만들고 인스턴스를 만든다
        c1.setOprands(10, 20);

        c1.sum();
        c1.avg();
    }
}

/*c*/
