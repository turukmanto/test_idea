package HW_13_12_23;


   public class PassengerCar extends Auto {


        int maxSpeed;
        int maxPassenger;

        public PassengerCar(String model,String color,int year,int maxSpeed,int maxPassenger){
             super(model,color,year);
             this.maxSpeed = maxSpeed;
             this.maxPassenger = maxPassenger;
        }


        public void iCanCar(){
             System.out.println("I can drive fast");
        }


        public void iCanCar1(){
             System.out.println("I love driving people");
        }
}
