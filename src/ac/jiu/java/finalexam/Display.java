package ac.jiu.java.finalexam;

public class Display {

    Display() {

    }

    public void airplanePassengers(Transportation transportation) {
        if (transportation instanceof Airplane) {
            for (String passenger : transportation.getPassengers()) {
                System.out.println(passenger);
            }
        }
    }
    public void schoolBusPassengers(Transportation transportation) {
        if (transportation instanceof SchoolBus) {
            for (String passenger : transportation.getPassengers()) {
                System.out.println(passenger);
            }
        }

    }
}
