package jiu_java_prepare;

public class InputOutputDemoOne {
    public static void main(String[] args) { //String args라는 변수를 가지는 배열
        System.out.println(args.length); //터미널로 실행했을때 argument 개수를 전달해 준다

        /*args로 주는 값들을 하나씩 가져와서 print*/
        for(String e : args){
            System.out.println(e);
        }

    }
}
