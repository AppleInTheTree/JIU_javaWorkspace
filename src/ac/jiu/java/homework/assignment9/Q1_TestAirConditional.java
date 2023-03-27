package ac.jiu.java.homework.assignment9;

public class Q1_TestAirConditional {
    public static void main(String[] args) {
        AirConditioner conditioner1 = new AirConditioner();
        AirConditioner conditioner2 = new AirConditioner();
        //For conditional 1
        conditioner1.setTemperature(70);
        conditioner1.setSpeed(2);
        conditioner1.setOn(true);
        //For conditional 2
        conditioner2.setTemperature(68);
        conditioner2.setSpeed(3);
        conditioner2.setOn(true);
        conditioner2.setOn(false);
        //Display
        System.out.println(conditioner1.toString());
        System.out.println(conditioner2.toString());




    }


}
