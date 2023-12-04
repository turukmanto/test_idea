package HomeWork_01_12_23;

public class MySubstring {

    public static void main(String[] args) {

        //Написать свой собственный метод substring, работающий аналогично методу в Джаве.
        // Метод принимает строку , индексы начала и конца и возвращает подстроку.
        //String mySubstring( String string, int begin, int end).

        int begin = 3;
        int end = 15;
        String sum = " ";

        String str = "Hello World and Java";


        // char[] str1 = str.toCharArray();

        for (int i = 0; i < str.length(); ) {
        

            i++;
            if (i > begin) {
                String result = sum + 1;

                System.out.print(result);
            if (i == end) {
                    break;
                }
            }

            //System.out.println(str.charAt(begin));
            //String str1 = str.charAt(5);

        }
    }
}
