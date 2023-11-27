package Nov_27_11_23;

public class HonestFruits {

    //Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
    //Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
     public static void main(String[] args){

         String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

         for(int i = 0;i < fruits.length;){

             System.out.println("Honest fruist is : " + fruits[i]);
             i = i + 2;


         }


     }



}
