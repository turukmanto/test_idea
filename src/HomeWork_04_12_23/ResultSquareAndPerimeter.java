package HomeWork_04_12_23;

public class ResultSquareAndPerimeter {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10,5);
        Rectangle rectangle2 = new Rectangle(5,4);
        Rectangle rectangle3 = new Rectangle();

        //int perimeter = (rectangle1.length * 2) + (rectangle1.width * 2);
        //int square = rectangle1.length * rectangle1.width;


        System.out.println(rectangle3(3,3));

    }


    public static int rectangle3(int length, int wingth) {

        int res = length * wingth;

        return res;
    }


    public static int newPerimeter(int length, int wingth) {

        int resPerimeter = (length * 2 ) + (wingth * 2);
        return resPerimeter;

    }

}


