package Cw_08_12_23;

public class Car {
   private String name;
   private int year;

    private static int carCounter;

    public Car (String name){
        this.name = name;
        carCounter++;
    }

    public static int getCarCounter() {
        return carCounter;
    }

    public static void setCarCounter(int carCounter) {
        Car.carCounter = carCounter;
    }

    public static String getCarInfo(Car car){

        return car.name + "production year " + car.year;
    }
//public static String getCarInfo(Car car){

       // return car.getName();
}



