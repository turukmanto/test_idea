package Nov_27_11_23;

public class ArrayIntMin {

    // Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.

    public static void main(String[] args) {



            int[] number = new int[]{12,24,7,18,96,43,1,17};
            int min = number[0];

            for(int i = 1;i < number.length;i++){

                if(number[i]< min)

                    min = number[i];}

            System.out.println(min);


        }


    }

