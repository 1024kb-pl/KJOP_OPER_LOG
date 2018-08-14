package pl.maniaq;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();

        boolean isEqual100Or200 = number == 100 || number == 200;
        System.out.println("Number is equal 100 or 200: " + isEqual100Or200);
        
    }
}
