package ac.jiu.java.homework.assignment9;

public class AirConditioner {
    final int LOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;

    private int temperature = 72;
    private int speed = LOW;
    private boolean on = false;

    public int getTemperature() {
        return temperature;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
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

    public void setOn(boolean on) {
        if (on) {
            this.on = true;
        } else {
            this.on = false;
        }
    }

    AirConditioner() {
    }

    public double getPowerConsumption() {
        if (this.speed == LOW) {
            return 500;
        } else if (this.speed == MEDIUM) {
            return 750;
        } else {
            return 1000;
        }
    }
    public String toString() {
        if (this.on) {
            return "Air conditioner temperature: " + this.temperature + " degrees Fahrenheit" + ", speed: " + this.speed
            + " power consumption: " + getPowerConsumption() + " watts";
        }
        else {
            return "Air conditioner temperature: " + this.temperature + ", air conditioner is off";
        }
    }

}
