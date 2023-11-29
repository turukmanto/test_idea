package klasswork_29_11_23;

public class BubleSort {

    public static void main (String[] args){

        int[] array = {6,3,0,5};
        bubbleSort(array);

        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }

    }

    public static void bubbleSort(int[] array){

        boolean sorted = false;

        while (!sorted){
            sorted = true;

            for(int i = 0;i < array.length -1; i++){

                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array [i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

    }



}
