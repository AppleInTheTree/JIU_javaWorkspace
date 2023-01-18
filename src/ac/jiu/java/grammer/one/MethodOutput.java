package ac.jiu.java.grammer.one;

public class MethodOutput {
    public static String numbering(int init, int limit){
        int i = init;
        String output = "";
        while (i <= limit){
            output += i;
            i++;
        }
        return output;
    }
    public static void main(String[] args) {
        String totalnumber = numbering(1, 5);
        System.out.println(totalnumber);


    }
    /*
    * 리턴 값의 type에 따라서 void, int, string으로 달라진다
    * return을 사용하면 그 method의 입력값을 여러곳에서 사용할 수 있게 된다.
    * */

    /* return을 만나면 바로 함수 종료
    * public static int one() {
    *   return 1;
    *   return 2;
    *   return 3;
    * }
    *
    * public static void main(String [] args) {
    *   System.out.println(ont())
    * 1이 나와야 한다
    * */


}
