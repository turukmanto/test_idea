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

        checkLetters("qwertyuiop","poiuytrew");



    }
        public static String checkLetters(String str1,String str2){

        char[] newStr1 = str1.toCharArray();
        char[] newStr2 = str2.toCharArray();

        Arrays.sort(newStr1);
        Arrays.sort(newStr2);

        //System.out.println(Arrays.toString(newStr1));
        //System.out.println(Arrays.toString(newStr2));
        System.out.println(Arrays.toString(newStr1).equals(Arrays.toString(newStr2)));

            return str1;
        }
        }




