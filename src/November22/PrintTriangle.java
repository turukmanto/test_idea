package November22;

public class PrintTriangle {

    public static void main(String[] args){

        printTriangle(5);

    }

    static void printTriangle(int n){

        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
