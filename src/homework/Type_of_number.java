package homework;

public class Type_of_number {
    static public void main(String[] args) {

       numberRes1(- 50);


    }

    static void numberRes1(int a) {


        if (a < 0) {
            System.out.println("Number " + a + " is negative");
        }

        if (a == 0) {
            System.out.println("Number " + a + " is equal to zero");
        }

        if (a > 0) {
            System.out.println("Number " + a + " is positive");
        }
    }
}



