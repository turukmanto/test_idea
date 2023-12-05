package Homework_05_12_23;

public class CelsiusResult {

    public static void main(String[] args) {

        Temperature temperature1 = new Temperature(20);
        Temperature temperature2 = new Temperature(100);
        Temperature temperature3 = new Temperature(150);

        System.out.println(temperature1.FahrenheitToCelsius());
        System.out.println(temperature2.FahrenheitToCelsius());
        System.out.println(temperature3.FahrenheitToCelsius());
    }
}
