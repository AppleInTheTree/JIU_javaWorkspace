package ac.jiu.java.homework.assignment11;

public class Tiger extends Predator implements Barkable {
    Tiger() {

    }
    @Override
    public String getFood() {
        return "apple";
    }
    @Override
    public void bark() {
        System.out.println("growl");
    }

}
