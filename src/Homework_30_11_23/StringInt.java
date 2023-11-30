package Homework_30_11_23;

public class StringInt {
    public static void main(String[] args) {
        //Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
        //пример: Hello -> 10
          System.out.println(strHello("Hello"));
    }


       public static int strHello(String name){
        String str = name;
        int i = str.length() * 2;
        return i;
    }
}
