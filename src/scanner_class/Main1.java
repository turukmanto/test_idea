package scanner_class;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner ourScanner = new Scanner(System.in);

        System.out.print("First name : ");
        ourScanner.nextLine();

        System.out.print("Last name : ");
        ourScanner.nextLine();

        System.out.print("Age: ");
        int Age = ourScanner.nextInt();

        ourScanner.close();

    }
}