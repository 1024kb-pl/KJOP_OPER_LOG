package pl.maniaq;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        boolean isHigherThan10 = number > 10;
        boolean isEqualZero = number == 0;
        boolean isLowerThan50 = number < 50;
        boolean isEqualOrHigherThan20 = number >= 20;
        boolean isEqualOrLowerThan30 = number <= 30;
        boolean isDiffThan5 = number != 5;

        System.out.println("Is higher than 10: " + isHigherThan10);
        System.out.println("Is equal zero: " + isEqualZero);
        System.out.println("Is lower than 50: " + isLowerThan50);
        System.out.println("Is equal or higher than 20: " + isEqualOrHigherThan20);
        System.out.println("Is equal or lower than 30: " + isEqualOrLowerThan30);
        System.out.println("Is different than 5: " + isDiffThan5);

    }
}
