package Homework_05_12_23;

public class Temperature {

   // Создать класс Temperature (температура), содержащий метод для перевода градусов
   // по фаренгейту в градусы цельсия ( celsius = 5*(farenheit - 32)/9).
   // В классе Main создать несколько обьектов класса Temperature
   // (значение температуры по фаренгейту должно задаваться через конструктор)
    //и вывести результат перевода на экран
     double fahrenheit;

     public Temperature(double fahrenheit){
        this.fahrenheit = fahrenheit;
     }
    double FahrenheitToCelsius(){

         return  5 * (fahrenheit - 32) / 9;

    }
}
