package ac.jiu.java.practice.week12Example;

public abstract class GeometricObject {

    // properties
    private String color;
    private boolean filled;

    // constructors
    protected GeometricObject() {

    }
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // accessors & mutators
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "This is a geometric object";
    }

    // abstract method
    public abstract double getArea();
    public abstract double getPerimeter();






}



