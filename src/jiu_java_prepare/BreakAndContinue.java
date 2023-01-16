package jiu_java_prepare;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i =0; i <=10; i++){
            if(i == 5)
                /*break; 5에서 break*/
                continue; //5을 건더뛰고
            System.out.println("Coding Everybody" + i);
        }
    }
}
