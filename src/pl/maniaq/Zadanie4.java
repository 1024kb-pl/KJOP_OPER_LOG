package pl.maniaq;

import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        boolean isHigherThan0 = number > 0;
        boolean isLowerThan0 = number < 0;
        boolean isEqual0 = number == 0;

        System.out.println("Higher than zero: " +isHigherThan0);
        System.out.println("Lower than zero: " + isLowerThan0);
        System.out.println("Is equal to zero: " + isEqual0);
        
    }
}
