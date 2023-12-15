package HW_14_12_23;

import java.util.Arrays;

public class Main {
    // Геометрические фигуры
    //Используя свойства наследования написать программу для подсчета площади трех видов фигур -
    //круга, прямоугольника и квадрата.

    //Создать классы Circle, Rectangle, Square , содержащие соответствующие методы.
    //Затем в методе main создать маcсив из нескольких фигур и вывести на печать площади каждой фигуры и название ее
    //примерно в таком виде :
    //Circle has area of 100.0
    //Rectangle has area of 400.0
    //Square has area of 340.0

       public static void main(String[] args){

           Square square = new Square(5,5);


          Rectangle rectangle = new Rectangle(4,4);


           Circle circle = new Circle(2,2);


           String[] figure = {circle.areaCircle(2,2), rectangle.areaRectangle(4,4), square.areaSquare(5,5)};


           for(String i : figure){

               System.out.println(i);
           }
}


}
