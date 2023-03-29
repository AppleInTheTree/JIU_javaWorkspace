package ac.jiu.java.practice.week9;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();


    }
}




class Car {

    // This is constant of the Car class
    final int LOW = 1;
    final int MEDIUM = 2;
    final int HIGH =3;

    // This is variable of Car class
    private int weight = 100;
    private int speed = LOW;
    private boolean powerOn = false;
    private String color = "RED";

    // get & set method for weight, speed, powerOn, color
    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
       if (speed == 1) {
           this.speed = LOW;
       }
       else if (speed == 2) {
           this.speed = MEDIUM;
       }
       else {
           this.speed = HIGH;
       }
    }

    // No - ARGS constructor
    Car() {

    }

    public int getSpeedViolation(){
        //
        if (this.speed == LOW) {
            return 1;
        }
        else if (this.speed == MEDIUM) {
            return 2;
        }
        else {
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
