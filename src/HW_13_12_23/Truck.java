package HW_13_12_23;

public class Truck extends Auto {

    // Внести изменения в наш проект Trucks( см. урок 21) таким образом, чтобы класс Truck стал дочерним классом.
    //Кроме него, также создать еще один дочерний класс , например PassengerCar.
    //Определить, какие переменные и методы в этом случае должны быть в родительском классе, а какие в дочерних.


          int maxWeight;
          int maxFuel;

          public Truck(String model,String color,int year,int maxWeight,int maxFuel){

              super(model,color,year);
              this.maxWeight = maxWeight;
              this.maxFuel = maxFuel;
          }
          public void iCan(){
          System.out.println("I can carry elephants");
   }
            public void iCanMore(){
            System.out.println("I need a lot of gasoline");
   }


}
