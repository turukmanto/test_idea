package HW_10_12_23;


public class Main {

    public static void main(String[] args) {

        CarShowroom carShowroom = new CarShowroom("Audi", "BMW", "Ford", "Honda", "Kia", "Hyundai");
        String[] carName = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia"};
        //System.out.println(carName[3]);
        String search = "Mazda";


                 for (String y : carName)
                     if (search.equals(y)){
                         System.out.println("Car found");
                         return;
                          }
                 System.out.println("There is no such brand, we have it in stock : " +"\nAudi " + "\nBMW " + "\nFord "
                           + "\nHonda" + "\nHyundai" + "\nKia");
    }

            }




