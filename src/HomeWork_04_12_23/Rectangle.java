package HomeWork_04_12_23;

public class Rectangle {

   // Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
    // конструктор и методы для подсчета площади и периметра прямоугольника.
    // В классе Main создать несколько обьектов класса Rectangle и вывести на экран площадь и периметр каждого


    int length;
    int width;

    public Rectangle(int length,int width){


        this.length = length;
        this.width = width;
    }


    int getArea(){

        return length * width;
    }

    int getPerimeter(){
        return 2 * (length + width);
    }
    public Rectangle(){}

}
