package HomeWork_01_12_23;

import java.util.Arrays;

public class AnagramStr {

    public static void main (String[] args) {

        //Написать метод, принимающий две строки и проверяющий является ли одна строка анаграммой другой.Метод
        //возвращает boolean
        //abcd  - bcda acbd - анаграммы
        //abcd -    acb  abkc - не анаграммы

        //Вам могут пригодиться следующие методы:
        //toCharArray
        //Arrays.sort

        //System.out.println(checkLetters("lipas","apil"));



    //}
       // public static Boolean checkLetters(String str1,String str2){

        String str1 = "pilas";
        String str2 = "alip";


        char[] newStr1 = str1.toCharArray();
        char[] newStr2 = str2.toCharArray();

        Arrays.sort(newStr1);
        Arrays.sort(newStr2);

        System.out.println(Arrays.toString(newStr1));
        System.out.println(Arrays.toString(newStr2));
        System.out.println(Arrays.toString(newStr1).equals(Arrays.toString(newStr2)));
        //boolean result = Arrays.toString(newStr1).equals(Arrays.toString(newStr2));
        //return result;
        }
        }




