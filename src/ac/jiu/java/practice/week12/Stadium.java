package ac.jiu.java.practice.week12;
import java.util.*;

public class Stadium extends Building {
    private final ArrayList<String> players;
    private final ArrayList<String> viewers;

    Stadium() {
        players = new ArrayList<>();
        viewers = new ArrayList<>();
    }

    Stadium(String name, double height, double width, int numOfFloors) {
        super(name, height, width, numOfFloors);
        players = new ArrayList<>();
        viewers =new ArrayList<>();
    }

    public ArrayList<String> getPlayers() {
        return players;
    }
    public ArrayList<String> getViewers() {
        return viewers;
    }
    public void setPlayers(String player) {
        this.players.add(player);
    }
    public void setViewers(String viewer) {
        this.viewers.add(viewer);
    }

    @Override
    public int getTotalPeople() {
        return this.players.size() + this.viewers.size();
    }
    @Override
    public String toString() {
        return "Name of the Building is " + getName() + ", height : " + getHeight() +
                ", width: " + getWidth() + ", number of floors is: " + getNumOfFloors() + ", and total people in the building is: "
                + getTotalPeople();
    }

}
