package HW_14_12_23;

public class Square {

    int a ;
    int b ;

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
     }



    public String areaSquare(int a, int b) {

        int resAreaSquare = a * b;

        return "Square has area of " + resAreaSquare;
    }
}
