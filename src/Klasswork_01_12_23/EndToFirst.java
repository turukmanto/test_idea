package Klasswork_01_12_23;

public class EndToFirst {

    public static void main (String[] ergs) {

        System.out.print(EndToFirst("abcd"));

    }
       public static String EndToFirst(String name){

         name = "abcd";
        String str1 = name.substring(0,3);
        String str2 = name.substring(3);


        return str2 + str1;
    }


}
