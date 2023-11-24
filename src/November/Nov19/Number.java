package November.Nov19;

import java.util.Scanner;

public class Number {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number");

        int number = scanner.nextInt();
        System.out.println(delectSing(number));}



        public static String delectSing(int n){

            if(n > 0){
                return "Number is positive";}
            else if(n < 0){
                return "Number is negative";}
            else{
                return "Number is zero";}
        }
    }

