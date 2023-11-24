package November21;

public class sumNum {
    public static void main(String[] args) {

       System.out.println(countSum(5));


    }

    static int countSum(int n) {

        int sum = 0;

        for(int i = 1;i <= n ;i++ )
        {
            sum = sum + i;
        }
        return sum;




    }
}