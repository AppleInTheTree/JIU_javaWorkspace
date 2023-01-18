package ac.jiu.java.grammer.one;

public class if_condition_statement_example {
    public static void main(String[] args) {

        String id = args[0];
        String password = args[1];
        if (id.equals("egoing")){
            if (password.equals("1111")) {
                System.out.println("right");
            }else{
                System.out.println("you have wrong password");
            }
        } else {
            System.out.println("wrong namae");
        }
    }
}
/*자바 터미널로 컴파일하는것 알려주기 javac 컴파일 java 실행*/
/*if statement와 중첩 if statement도 설명하기*/
