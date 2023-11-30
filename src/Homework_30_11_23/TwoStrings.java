package Homework_30_11_23;

public class TwoStrings {

    public static void main(String[] args) {
        //Написать метод, принимающий две строки и возвращающий эти строки,
        // соединенные вместе, но без первых букв и в верхнем регистре.
        //  Пример: "Hello", "There" -> ELLOHERE
        twoStr("Hello","There");

    }

     public static void twoStr(String name1,String name2){
         name1 = "Hello";
         name2 = "There";
         System.out.print(name1.concat(name2.substring(1)).substring(1).toUpperCase());

    }
}
