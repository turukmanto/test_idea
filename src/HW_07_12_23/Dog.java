package HW_07_12_23;

public class Dog {

    //Создать класс Dog c полями name , counter и конструктором.
    // Cоздать несколько обьектов этого класса и вывести на печать количество созданных обьектов.

    String name;
    String color;
    int age;
   static int counter;

   public Dog( String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
        counter ++;
    }

    public String toString(){
        return   "Name :" + this.name + " Color : " + this.color + " Age : " + this.age;
    }
}
