package ac.jiu.java.practice.week12Example;

public class Circle extends GeometricObject {
    private double radius;

    Circle() {

    }

    Circle(double radius) {
        this.radius =radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
