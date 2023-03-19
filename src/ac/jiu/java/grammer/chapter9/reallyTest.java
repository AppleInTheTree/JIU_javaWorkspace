package ac.jiu.java.grammer.chapter9;

public class reallyTest {
    public static void main(String[] args) {
        mutableTest mutable = new mutableTest();
        mutableTest mutable2 = new mutableTest(5);

       int[] array = mutable.getValues();
        System.out.println(array);

       array = new int[10];

        System.out.println(array);
        System.out.println(mutable.getValues());



//       array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }

        // setter가 없어도 참조로 바꿀수 있기 때문에 immutable이 아니다
//        mutable.printValues();

//        for (int i : array = new int[10]) {
//            array[i] = i;
//            System.out.println(i);
//        }

    }


}
