package November21;

public class countNumbers {
    public static void main(String[] args) {
        /*Написать метод, выводящий на печать результат умножения данного числа n на все целые числа от 0 до n
         *
         * */
           sumNumbers();

    }

    static void sumNumbers(){

        int n = 1;
        int a = 0;

        while (n <= 10) {

            System.out.println("sum = " + n * a);
            int sum1 = n * a;
            n++;
            a++;


        }
    }
}
