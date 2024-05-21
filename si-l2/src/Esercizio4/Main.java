package Esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
