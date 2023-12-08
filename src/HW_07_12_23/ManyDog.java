package HW_07_12_23;

import static HW_07_12_23.Dog.counter;

public class ManyDog {

    public static void main(String[] args) {

        Dog dog = new Dog("Scharik","braun",1);
        Dog dog1 = new Dog("Bobik","white",2);
        Dog dog2 = new Dog("Druzhok","black",3);

        System.out.println("We Have : " + counter + " happy dogs");

    }



}
