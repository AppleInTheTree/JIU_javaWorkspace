package ac.jiu.java.homework.assignment11;

public class Lion extends Predator implements Barkable {

    Lion() {

    }

    @Override
    public String getFood() {
        return "banana";
    }
    @Override
    public void bark() {
        System.out.println("roar");
    }


}
