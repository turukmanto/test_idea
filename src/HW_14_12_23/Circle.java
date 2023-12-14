package HW_14_12_23;

public class Circle {

    int a ;
    int b ;

    public Circle (int a, int b ){
        this.a = a;
        this.b = b;
    }

    public String areaCircle (int a , int b){

        int resAreaCircle = a * (b * b);
        return "Circle has area of " + resAreaCircle;
    }
}
