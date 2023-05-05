package ac.jiu.java.finalexam;
import java.util.*;

public class SchoolBus extends Transportation {
    private final ArrayList<String> drivers;

    SchoolBus() {
        drivers = new ArrayList<>();
    }
    SchoolBus(String name, String destination, double speed) {
        super(name, destination, speed);
        drivers = new ArrayList<>();
    }

    public ArrayList<String> getDrivers() {
        return this.drivers;
    }
    public void setDrivers(String drivers) {
        this.drivers.add(drivers);
    }

    public int totalPeople(){
        return getPassengers().size() + getDrivers().size();
    }
    public String toString() {
        return "Name of the SchoolBus is " + getName() + ", maximum speed of the SchoolBus is (km) " + getSpeed() + ", total students in the bus is "
        + totalPeople() + ", and " + "its destination is " + getDestination();
    }
}
