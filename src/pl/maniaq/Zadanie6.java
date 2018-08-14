package pl.maniaq;

import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        boolean isInRange = number <= -100 || number >= 100;
        // warunek przy użyciu negacji, warunek wewnętrzny sprawdza, czy liczba jest z przedziału od -100 do 100, a następnie go neguje
        // czyli szuka liczb nie należących do tego przedziału
        boolean isInRange2 = !(number > -100 && number < 100);

        System.out.println("1 version: is in range: "+isInRange);
        System.out.println("2 version: is in range: "+isInRange2);
    }
}
