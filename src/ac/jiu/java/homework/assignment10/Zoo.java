package ac.jiu.java.homework.assignment10;

public class Zoo {

    public int numAnimals = 0;
    public Animal[] animals;

    Zoo() {
        this.animals = new Animal[10];
        this.numAnimals = 0;

    }

    public void addAnimal(Animal animals) {
        this.animals[numAnimals] = animals;
        numAnimals++;
    }
    public Animal[] getAnimals() {
        return this.animals;
    }
    public int getNumAnimals() {
        return this.numAnimals;
    }
    public void makeAllSounds() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].makeSound();
            }
        }
    }
}
