package ac.jiu.java.grammer.one;

public class ForEachStatement {
    public static void main(String[] args) {
        /*배열과 for문을 더 간결하게 해주는 것*/
        String[] members = {"만두", "민주", "망두", "망고", "만디", "파인애플망고"};
        for (String each : members){
            System.out.println(each + "는 민주 입니다");
        }
    }
}
