package ac.jiu.java.grammer.two;





public class Scope {
    /*유효 범위에 대해여
    * 변수나 메소드 이름의 중복을 방지하고 코드의 효율성을 위해
    * this. 을 쓰면 전역변수에 접근 가능하다
    * */
    static int i = 5; // global variable

    public static void Scope(){
        int i = 0; // 메소드안에서만 사용가능한 local variable
        System.out.println(i); // 지역변수와 전역변수가 둘다 i이지만 지역변수를 불러온다
    }
    public static void main(String[] args) {

        Scope();

    }
}
