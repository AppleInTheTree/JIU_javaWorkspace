package jiu_java_prepare;

public class MultipleMethodExample {
    public static String members_one(){
        String member1 = "안의진";

        return member1;
    }
    public static String members_two(){
        String members2 = "박민주";
        return members2;
    }
    public static String members_there(){
        String members3 = "한성원";
        return members3;
    }
    /* 배열을 return 받을수도 있다 */
    public static String [] members(){
        String [] member_s = {"안의진", "박민주", "한성원"};
        return member_s;
    }
    public static void main(String[] args) {
        System.out.println(members_one()+members_two()+members_there());
        String [] member = members();
        for (int i = 0; i < member.length; i++){
            System.out.println(member[i]);
        }

    }
}
