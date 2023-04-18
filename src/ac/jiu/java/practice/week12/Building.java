package ac.jiu.java.practice.week12;

public abstract class Building {

    // properties
    private String name;
    private double height;
    private double width;
    private int numOfFloors;

    // constructors
    protected Building() {

    }
    protected Building(String name, double height, double width, int numOfFloors) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.numOfFloors = numOfFloors;
    }

    // method
    public String getName() {
        return this.name;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }
    public int getNumOfFloors() {
        return numOfFloors;
    }

    public abstract int getTotalPeople();

    @Override
    public abstract String toString();

}
