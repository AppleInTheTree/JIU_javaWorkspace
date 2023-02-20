package ac.jiu.java.homework.assignment6;

public class Q1_CelsiusToFahrenheit {
    public static double celsiusToFahrenheit(double celsius) {

        return ((9.0 / 5) * celsius + 32);
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return ((5.0 / 9) * (fahrenheit - 32));
    }
    public static void main(String[] args) {
        System.out.println("Celsius  Fahrenheit  |  Fahrenheit  Celsius");
        System.out.println("-------------------------------------------");
        double celsius = 40.0;
        double fahrenheit = 120.0;
        for (int i = 0; i < 9; i++) {
            //System.out.println(celsius - i + "    " + celsiusToFahrenheit(celsius - i) + "    " + (fahrenheit - (i*10)) + "         " + fahrenheitToCelsius((fahrenheit - (i*10))));
            System.out.printf("%-8.1f     %-8.1f|   %-8.1f     %-8.1f \n", celsius - i, celsiusToFahrenheit(celsius - i), (fahrenheit - (i*10)), fahrenheitToCelsius((fahrenheit - (i*10))));
        }


    }
}
