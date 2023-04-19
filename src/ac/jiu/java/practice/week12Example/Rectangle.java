package ac.jiu.java.practice.week12Example;

public class Rectangle extends GeometricObject {
    //properties
    private double width;
    private double height;

    // constructors
    Rectangle() {

    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;

    }
    @Override
    public double getPerimeter() {
        return 2 * (this.height + this.width);

    }

}
