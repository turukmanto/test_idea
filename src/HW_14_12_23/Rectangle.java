package HW_14_12_23;

public class Rectangle {

    int a ;
    int b ;


        public Rectangle(int a, int b) {
          this.a = a ;
          this.b = b ;

    }

    public String  areaRectangle (int a, int b) {

            int resAreaRect = a * b ;
        return "Rectangle has area of " + resAreaRect;
    }
}
