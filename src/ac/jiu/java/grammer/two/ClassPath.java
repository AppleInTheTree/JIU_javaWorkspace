package ac.jiu.java.grammer.two;

/*자바 파일을 컴파일하면 class마다 컴파일이 되고 파일이 생긴다*/

/*javac를 통해 컴파일 시키면 Item의 클래스와 ClassPath를 둘다 컴파일 하는데 Item이 다른 위치에
* 있으면 error를 발생한다. 이때 다른 경로에 있는 클래스를 같이 실행 시키고 싶다면
* java -classpath ".;lib" ClassPath -> 먼저 현재 디렉토리에서 전부 찾고 그 다음에는 lib이라는곳에서 찾아서 같이 실행해라라는 뜻
*  ** 항상 .을 추가해야 한다 왜냐하면 실행하는 파일이 현재 디렉토리에 있기 때문에
* */

/*API
* 자바 애플리케이션을 개발하는 개발자들은 자바 API를 사용하게 된다.
* 자바 홈페이지에서 API Spec을 확인할수 있다.
* Package는 클래스들의 묶음
*
*
* */

class Item {
    public void print(){
        System.out.println("Hello World"); // System은 클래스 out은 인스턴스화 시키지 않고 바로 사용하였기에 static, 클래스의 필드(변수) 그리고 println은 메소드
    }
    public static void hello() {
        System.out.println(("Hello world"));
    }
    public int add (int a, int b){
        return (a+b);
    }
}

public class ClassPath {
    public static void main(String[] args) {
        Item item = new Item();
        item.print();

        Item.hello();
        int adding = item.add(10, 20);
        System.out.println(adding);
    }
}

