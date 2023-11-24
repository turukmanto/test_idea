package November20;

import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 7;
        System.out.println("Guess a number between 0 and 9");

        int answer = scanner.nextInt();

        while (answer == secretNumber) {
            //if(answer == secretNumber){
            System.out.println("You are right! You have guessed the secret number! ");


            while (answer != secretNumber){
                //else {
                System.out.print("Sorry,try again ");}

            //if(answer < secretNumber){
            //System.out.println("is too small");}
            //else
            //System.out.println("is too high");}


        }
    }
}



