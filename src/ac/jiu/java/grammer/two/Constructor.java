package ac.jiu.java.grammer.two;

class CalculatorFour{
    int left, right;

    public CalculatorFour(int left, int right){ //class와 똑같은 이름으로 생성사를 만든다. 클래스가 실행될때 가장 먼저 실행된다.
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right)/2);
    }
}
public class Constructor {
    public static void main(String[] args) {

        CalculatorFour cal = new CalculatorFour(10, 20); //new 다음에 쓰는것은 생성자이다 없으면 만들어준다
        cal.sum();
        cal.avg();


    }


}
