package HW_15_12_23;

import java.util.Scanner;

public class Main {
    /* создать магазин/фабрику по продаже и производству пиццы. Программа должна уметь готовить следующие виды пиццы:
    Гавайи, Маргарита, Салями.
    Каждый вид пиццы должен уметь: подготавливаться( накладывать ингридиенты напр), печься и упаковываться.
    В каждом случае должно быть понятно о какой пицце идет речь
    В классе OnlinePizzaShop  не должен создаваться новый обьект пицца, а из него должен поступать  "заказ" на изготовление
    требуемого вида пиццы (обьекта) в класс PizzaChoice, который и должен выбрать нужную пиццу для изготовления

    Выбор пиццы осуществляется клиентом с клавиатуры в классе OnlinePizzaShop, при этом нужно обеспечить проверку
    правильности выбора клиента и возможность заказать еще пиццу/пиццы
}1. Классы :
       Pizza - родительский класс
       PizzaSalami, PizzaMargarita, PizzaHawaii  -  дочерние

       В этих классах должны быть минимум три метода, отражающие процесс приготовления пиццы из ТЗ
       prepare()
       bake()
       pack()
       orderPizza()

       PizzaChoice -  сюда в соответствующий метод  будет передаваться выбор клиента и в зависимости от этого выбора
        через switch возвращаться новый обьект соответствующей пиццы
        Pizza createPizza( String type)
        Последовательность действий при заказе :

        Введите название пиццы ( 1,2,3)

        Preparing pizza with mozarella cheese
        Baking Pizza Margarita
        Packing Pizza margarita
         В методе main  через сканер предложить клиенту выбрать пиццу. Затем его выбор передать
         в switch, находящийся в методе choosePizza
     */


    public  static void main(String[] args) {

        System.out.println("Please select a name of the pizza : " + "\n1 - Pizza Salami" + "\n2 - Pizza Margarita" +
                "\n3 - Pizza Hawaii ");
        Scanner scanner = new Scanner(System.in);

        int numberPizza = scanner.nextInt();


    }

}


