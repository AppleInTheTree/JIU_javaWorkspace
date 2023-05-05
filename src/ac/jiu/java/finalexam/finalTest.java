package ac.jiu.java.finalexam;

public class finalTest {
    public static void main(String[] args) {
        // Make instance
        Airplane airplane = new Airplane("Korean Air", "Korea", 400);
        SchoolBus schoolBus = new SchoolBus("CGA SchoolBus", "K-EDUPLEX", 70);
        Display displayPassengers = new Display();

        // Airplane setting
        airplane.setPilots("Euijin");
        airplane.setBelongings("Passport");

        airplane.setPassengers("Raffin");
        airplane.setPassengers("Meisam");
        airplane.setPassengers("Dainal");
        airplane.setPassengers("Kevin");
        airplane.setPassengers("Edo");
        airplane.setPassengers("Clay");

        // SchoolBus setting
        schoolBus.setDrivers("Minjoo");

        schoolBus.setPassengers("Azaria");
        schoolBus.setPassengers("Caca");
        schoolBus.setPassengers("Kelvin");
        schoolBus.setPassengers("Hegel");
        schoolBus.setPassengers("Jeffery");

        // Checking the display class
        System.out.println(airplane);
        System.out.println();
        System.out.println("Check the passport: ");
        System.out.println(airplane.passportCheck());
        System.out.println();
        System.out.println("Display the name of the passengers on the flight: ");
        displayPassengers.airplanePassengers(airplane);
        System.out.println();

        // Checking the passport

        System.out.println();
        System.out.println();

        System.out.println(schoolBus);
        System.out.println();
        System.out.println("Display the name of the students on the SchoolBus: ");
        displayPassengers.schoolBusPassengers(schoolBus);
        System.out.println();

    }
}
