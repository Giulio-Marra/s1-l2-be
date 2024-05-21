package Esercizio1;

public class Main {
    public static void main(String[] arg) {
        System.out.println(stringaPariDispari("4"));
        System.out.println(annoBisestile(2028));
    }

    public static boolean stringaPariDispari(String str) {
        int strConvert = Integer.parseInt(str);
        if (strConvert % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }
    
}
