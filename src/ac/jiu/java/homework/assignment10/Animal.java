package ac.jiu.java.homework.assignment10;

public class Animal {
    private String name;
    private String sound;

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }
    public void makeSound() {
        System.out.println(sound);
    }
}
