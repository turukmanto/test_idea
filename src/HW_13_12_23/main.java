package HW_13_12_23;

public class main {

    public static void main(String[] args) {

        Truck truck = new Truck("MAN","black",2023,25,1000);
        PassengerCar passengerCar = new PassengerCar("Audi","white",2020,250,5);

        truck.iCan();
        passengerCar.iCanCar();
        passengerCar.iCanCar1();
        truck.iCanMore();

        System.out.println(truck instanceof Auto);
        System.out.println(passengerCar instanceof Auto);



    }
}
