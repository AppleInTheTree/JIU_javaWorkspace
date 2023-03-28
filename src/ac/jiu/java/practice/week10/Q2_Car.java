package ac.jiu.java.practice.week10;

public class Q2_Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setColor("ORANGE");
        car1.setSpeed(2);
        car1.setWeight(100);
        car1.setPowerOn(true);


        car2.setColor("BLACK");
        car2.setWeight(200);
        car2.setSpeed(3);
        car2.setPowerOn(true);
        car2.setPowerOn(false);

        System.out.println(car1.toString());
        System.out.println(car2.toString());

    }
}
class Car {
    final int LOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;
    private int weight = 100;
    private int speed = LOW;
    private String color = "RED";
    private boolean powerOn = false;

    public int getWeight() {
        return this.weight;
    }
    public int getSpeed() {
        return this.speed;
    }

    public String getColor() {
        return this.color;
    }
    public boolean isPowerOn() {
        return this.powerOn;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setSpeed(int speed) {
        switch (speed) {
            case 1:
                this.speed = LOW;
                break;
            case 2:
                this.speed = MEDIUM;
                break;
            case 3:
                this.speed = HIGH;
        }
    }
    public void setPowerOn(boolean on) {
        if (on) {
            this.powerOn = true;
        } else {
            this.powerOn = false;
        }
    }
    public void setColor(String color) {
        this.color = color;
    }
    Car() {
    }
    public double getSpeedViolation() {
        if (this.speed == LOW) {
            return 1;
        } else if (this.speed == MEDIUM) {
            return 2;
        } else {
            return 3;
        }
    }
    public String toString() {
        if (this.powerOn) {
            return "Car weight: " + this.weight + " kg" + ", speed: " + this.speed
                    + " color of the car: " + this.color + ", fee of speed violation: " + getSpeedViolation() + " juta";
        }
        else {
            return "Car weight: " + this.weight + " color of the car: " + this.color + ", Power is off";
        }
    }

}
