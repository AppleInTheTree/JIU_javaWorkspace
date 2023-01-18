package ac.jiu.java.grammer.one;

import java.sql.SQLOutput;

public class operator {
    public static void main(String[] args) {
        /*산술 연산자 arithmetic 연산자
         *  +, - , * , / , %
         * */
        int result  = 1 + 2;

        System.out.println(result);

        String firststring = "This is";
        String secondstring = " a concatenated string";

        String concatennated = firststring + secondstring;

        System.out.println(concatennated);

        int a = 10;
        int b = 3;
        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b); // 정수로 값
        System.out.println(c/d); // 실수로 값
        System.out.println(a/d); // 실수로 값

        /*단항 연산자 unary operator*/

        int i = 3;
        i++;

        System.out.println(i); // 4
        ++i;
        System.out.println(i); // 5
        System.out.println(++i); // 6 더하고 출력
        System.out.println(i++); // 6 출력하고 add
        System.out.println(i); // 7

        /*boolean and 비교(관계 연산자)
        * ==, !=, >, <
        * 문자열을 비교할때는 .equals
        * */

        String k = "Hello world";
        String n = new String("Hello world");
        System.out.println(k == n); //false 출력
        System.out.println(k.equals(n)); //true 출력







    }


}
