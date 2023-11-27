package Nov_24_11_23;

public class Fibonacci {
    public static void main(String[] args){

        int n = 60;
        int y = 1;

        for (int i = 0; i <= 100;){
           int sum = i + y;
            System.out.print(sum);
            y= i;
            i = sum;

        }
        }

    }

