package Homework_30_11_23;

public class NewWort {

    public static void main(String[] args) {
        // Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
        //Примет: abcd -> bcda


          String name1 = "abcd".substring(1);
         String name2 = "abcd".substring(0,1);

         System.out.println(name1.concat(name2));
    }
}
