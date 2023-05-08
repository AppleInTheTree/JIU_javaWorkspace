package ac.jiu.java.finalexam;
import java.util.*;

public class Airplane extends Transportation implements Passport {
    private final ArrayList<String> pilots;
    private final ArrayList<String> belongings;

    Airplane() {
        pilots = new ArrayList<>();
        belongings = new ArrayList<>();
    }
    Airplane(String name, String destination, double speed) {
        super(name, destination, speed);
        pilots = new ArrayList<>();
        belongings = new ArrayList<>();
    }

    // Accessors and mutators
    public ArrayList<String> getBelongings() {
        return this.belongings;
    }
    public ArrayList<String> getPilots() {
        return this.pilots;
    }
    public void setBelongings(String belongings) {
        this.belongings.add(belongings);
    }
    public void setPilots(String pilots) {
        this.pilots.add(pilots);
    }



    // Abstract method from interface
    public boolean passportCheck() {
        return getBelongings().contains("Passport");
    }

    // Abstract method from super class
    public int totalPeople(){
        return getPassengers().size() + getPilots().size();
    }
    public String toString() {
        return "Name of the Airline is " + getName() + ", maximum speed of the airplane is (km) " + getSpeed() + ", total people in the airplane is "
         + totalPeople() + ", and " + "its destination is " + getDestination();
    }


}
