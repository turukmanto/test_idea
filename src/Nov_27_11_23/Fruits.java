package Nov_27_11_23;

public class Fruits {
    //-++Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
    //-++Вывести созданный массив на экран используя цикл for.
    // -++Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
    //-++Вывести измененный массив на экран используя цикл for.
    // ++ Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.

    public static void main(String[] args) {

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};


        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println(fruits[1]);
        fruits[1] = "Kiwi";

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);

        }


    }
}
