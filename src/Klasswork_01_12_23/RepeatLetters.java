package Klasswork_01_12_23;

public class RepeatLetters {

    public static void main(String[] args) {

        System.out.println(removeDuplicateChars("abcabc"));

    }
        public static String removeDuplicateChars(String string){

        char[] chars = string.toCharArray();
        String result = " ";

        for(int i = 0;i < chars.length;i++){

            if(result.indexOf(chars[i]) == -1)
                result += chars[i];

        }return result;

    }
}
