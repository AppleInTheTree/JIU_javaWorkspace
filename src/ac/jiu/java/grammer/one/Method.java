package ac.jiu.java.grammer.one;

public class Method {

    public static void numbering() { // 메소드 define
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

    }
    public static void main(String[] args) {
        numbering(); //위에 메소드 호출
        numbering();
        numbering();

    }
}
/*main이란 무엇인가
* 자바와 개발자간의 약속 public static void main(String[] args)
* 메소드 안에 로직을 위치시켜야 한다.
*
* 메소드가 없으면 얼마나 불편할지 알려주기 위의 코드를 method을 쓰지 않고
* 10번출력하게 해보기 메소드의 재활용성, 유지보수의 우수성 알려주기
* */
