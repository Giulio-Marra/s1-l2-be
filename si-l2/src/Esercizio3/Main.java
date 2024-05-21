package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("inserisci una stringa");
            String str = scanner.nextLine();
            if (str.equals(":q")) {
                System.out.println("programma terminato");
                break;
            }
            int i = 0;
            while (i < str.length()) {
                System.out.print(str.charAt(i));
                System.out.print(", ");

                i++;
            }

        }


    }
}
