package HomeWork_01_12_23;

         public class RemoveCharIndex {

             public static void main(String[] args) {
                 //Написать метод, принимающий строку и целое число(индекс)
                 // и возвращающий строку без символа, находящегося по этому индексу.
                 //     Пример:
                 //int index = 3
                 //String str = "Hello"
                 //public static String removeCharAtIndex( String str, int index) -> "Helo"

                 System.out.println(removeLetters("abracadabra",  (10)));
             }

                 public static String removeLetters(String str,int index){


                 String newStr = str.substring(0,index);
                 String newStr1 = str.substring(index+1);
                 String result = newStr.concat(newStr1);

                 return result;
             }
         }
