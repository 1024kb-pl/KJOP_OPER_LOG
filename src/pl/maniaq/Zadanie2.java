package pl.maniaq;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        boolean isInRange = number >= 100 && number <= 200;
        System.out.println("Liczba mieści się w przedziale od 100 do 200: " + isInRange);
        
    }
}
