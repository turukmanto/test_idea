package November21;

public class BuldingTriangle {

    public static void main(String[] args) {
//Написать метод, выводящий на печать треугольник, состоящий из цифр от 1 до числа n такого вида:
//1
//12
//123
//1234
//12345
//123456


        newTriangle();


    }

    static void newTriangle() {

        int a = 1;


        do {
            System.out.println(a);
        }
        while (a != 1); //1


        do {
            System.out.print(a);
        }
        while (a != 1); //1


        do {
            System.out.println(a + 1);
        }
        while (a != 1); //2

        do {
            System.out.print(a);
        }
        while (a != 1); //1


        do {
            System.out.print(a + 1);
        }
        while (a != 1); //2

        do {
            System.out.println(a + 2);
        }
        while (a != 1); //3

        do {
            System.out.print(a);
        }
        while (a != 1); //1


        do {
            System.out.print(a + 1);
        }
        while (a != 1); //2

        do {
            System.out.print(a + 2);
        }
        while (a != 1); //3

        do {
            System.out.println(a + 3);
        }
        while (a != 1); //4

        do {
            System.out.print(a);
        }
        while (a != 1); //1


        do {
            System.out.print(a + 1);
        }
        while (a != 1); //2

        do {
            System.out.print(a + 2);
        }
        while (a != 1); //3

        do {
            System.out.print(a + 3);
        }
        while (a != 1); //4

        do {
            System.out.println(a + 4);
        }
        while (a != 1); //5
    }
}


















