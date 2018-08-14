package pl.maniaq;

import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        boolean isInRange = number >= -100 && number <= 100;
        System.out.println("Number is in range from -100 to +100: " + isInRange);

        
    }
}
