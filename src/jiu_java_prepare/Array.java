package jiu_java_prepare;

public class Array {
    public static void main(String[] args) {
        /*array는 연관된 정보를 그룹핑 하는데 사용한다 데이터 타입이다*/

        String [] classgroup = {"안의진","박민주","박만두"};
        int [] classnumer = {1,2,3,4,5,6};
        System.out.println(classgroup[1]);
        System.out.println(classnumer[3]+classnumer[1]);

        /*배열을 다르게 정의하는 방법과 그 안에 담겨 있는 값을 수를 알아내는 방법 .length*/
        String [] classmember = new String[4]; // 배열을 정의할때 new를 쓸수가 있다. 4개의 원소를 가진다
        classmember[0] = "안의진";
        System.out.println(classmember.length); // 변수에 처음에 init된 할당된 방의 개수 4
        classmember[1] = "박만두";
        System.out.println(classmember.length); // 변수에 처음에 init된 할당된 방의 개수 4
        System.out.println(classmember[3]); //방을 정의를 안해주면 null

        /*배열과 반복문의 조합*/
        String [] church = {"handong", "jiu", "wonnam"};
        for (int i = 0; i < church.length; i++){
            String member = church[i];
            System.out.println(member + "교회를 다닙니다");
        }


    }
}

