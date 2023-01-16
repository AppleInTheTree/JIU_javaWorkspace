package org.opentutorials.javatutorials.numberstring;

public class logical_operator {
    public static void main(String[] args) {
        /*and, or, not
         * && (둘다 true이야지만 true)
         * || (둘 중에 하나만 참이면 참)
         *
         * */
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && (password.equals("1111"))){
                System.out.println("right");
            } else {
                System.out.println("you have wrong password");
            }

        /*or 연산자 실습*/
//        if ((id.equals("egoing") || (id.equals("euijin")) && (password.equals("1111"))){
//            System.out.println("right");
//        } else {
//            System.out.println("you have wrong password");
//        }
        /*not 연산자*/
        if (!true){
            System.out.println(1);
        }
        if (!false) {
            System.out.println(2);
        }

    }
}
