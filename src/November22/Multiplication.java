package November22;

import java.util.Scanner;

public class Multiplication {

    //Написать метод, принимающий с клавиатуры положительное число
    // и печатающий затем таблицу умножения для этого числа
    // ( т.е. печатающий произведение этого числа на все числа от 1 до 10).
    //  Использовать в решении цикл for.
    //

    public static void main(String[] args) {

        System.out.println(" Enter number :  ");

        Scanner scanner = new Scanner(System.in);

        multiplicNumb(scanner.nextInt());

    }
    static void multiplicNumb(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }


    }
}


