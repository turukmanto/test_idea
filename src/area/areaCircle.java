package area;

public class areaCircle {
    public static void main(String[] args) {

        //double a = area(6.8);
        //System.out.println(" Area of a circle is " + a);

        //}
        //  static double area(double radius1){
        //double a = Math.PI;
        //double area = a * radius1 * radius1;
        //return area;

        // }
//}
        double a = degreesF(50.5);
        System.out.println(  a + " degrees C ");

    }

        static double degreesF (double degreesF) {

        double degreesC = 5 * (degreesF - 32) / 9;
        return degreesC;

    }
}