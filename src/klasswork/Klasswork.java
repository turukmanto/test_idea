package klasswork;

import java.util.Scanner;

public class Klasswork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number ");
        int a = scanner.nextInt();

        if(0 < a){
            System.out.print("number is positive");}
        else if(a > 0){
            System.out.println("number is negative");}
        else if(a == 0){
            System.out.println("number is zero");}

        }

    }


