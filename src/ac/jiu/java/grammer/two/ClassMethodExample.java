package ac.jiu.java.grammer.two;

class CalculatorTwo{

    //int left, right;

    public static void sum(int left, int right){ //static을 붙으면 class 메소드, 클래스에 직접 접근해서 사용가능하다
        System.out.println(left + right);
    }
    public static void divide(int left, int right){
        System.out.println(left / right);
    }
    public static void multi(int left, int right){
        System.out.println(left * right);
    }

}
public class ClassMethodExample {
    public static void main(String[] args) {

        CalculatorTwo.sum(10, 10);
        CalculatorTwo.divide(10, 2);
        CalculatorTwo.multi(10, 4);

    }
}
