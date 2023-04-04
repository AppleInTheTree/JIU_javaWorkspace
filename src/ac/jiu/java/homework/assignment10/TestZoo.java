package ac.jiu.java.homework.assignment10;

public class TestZoo {
    public static void main(String[] args) {
        // Create a few Animal objects
        Animal lion = new Animal("Lion", "Roar");
        Animal elephant = new Animal("Elephant", "Trumpet");
        Animal monkey = new Animal("Monkey", "Ooh ooh aah aah");

        // Create a new Zoo object
        Zoo zoo = new Zoo();

        // Add the animals to the Zoo
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);
        // Get the list of animals in the Zoo and print their names
        Animal[] animals = zoo.getAnimals();
        System.out.println("The Zoo has the following animals:");
        for (int i = 0; i < zoo.getNumAnimals(); i++) {
            System.out.println("- " + animals[i].getName());
        }
        // Make all the animals in the Zoo make their sound
        System.out.println("Making all the animals in the Zoo make their sound:");
        zoo.makeAllSounds();
    }
}
