package ac.jiu.java.finalexam;

import java.util.ArrayList;

public abstract class Transportation {

    // Properties
    private String name;
    private String destination;
    private double speed;
    private final ArrayList<String> passengers;



    // Constructors
    protected Transportation() {
        passengers = new ArrayList<>();

    }
    protected Transportation(String name, String destination, double speed) {
        passengers = new ArrayList<>();
        this.name = name;
        this.destination =destination;
        this.speed = speed;

    }

    // Accessors and mutators
    public String getName() {
        return this.name;
    }
    public String getDestination() {
        return this.destination;
    }
    public double getSpeed() {
        return this.speed;
    }
    public ArrayList<String> getPassengers() {
        return this.passengers;
    }
    public void setPassengers(String passengers) {
        this.passengers.add(passengers);
    }

    // Abstract method
    public abstract int totalPeople();
    public abstract String toString();
}
