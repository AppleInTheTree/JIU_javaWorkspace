package ac.jiu.java.grammer.one;

public class MethodInput {
    public static void numbering(int init, int limit){ // limit parameter
        int i = init;
        while (i <= limit){
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        numbering(10, 20);// argument

    }
}
