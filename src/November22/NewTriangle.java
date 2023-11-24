package November22;

public class NewTriangle {

    public static void main(String[] args){


        printTriangle(5);

    }

    static void printTriangle(int n){
        int j = 1;
        int i = 1;
        for( i = 1, j = 1;i <= n;){

            for(j = 1;j <= i;j++){
                System.out.print(j);

            }
            i++;
            System.out.println();
        }

    }
}




