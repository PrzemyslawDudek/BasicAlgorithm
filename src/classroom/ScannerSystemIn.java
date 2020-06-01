package classroom;

import java.util.Scanner;

public class ScannerSystemIn {

    public static void main(String[] args) {

        //zmienne używane w programie
        String name = "Grażyna";
        int nameLength = 0;
        int age = 0;
        //wiek w sekundach - 1 rok to 365 dni, jeden dzień to 60 minut, jedna minuta to 60 sekund.
        int ageAsSecond = age * 365 * 24 * 60 * 60;

        //Pytanie dodatkowe
        //Jaka jest pojemność typu danych int? Jak dużą liczbę może przechowywać?


        //deklaracja klasy Scanner. Od tej pory można się do niej donosić za pomocą zmiennej o nazwie "scanner"
        Scanner scanner = new Scanner(System.in);

        //w tym miejscu umieśc swój kod.
        System.out.println("Podaj swoje imię: ");
        //w tym miejscu umieśc swój kod.

        System.out.println("Podaj ile masz lat: ");
        //w tym miejscu umieśc swój kod.


        System.out.println("Cześć " + name + ", Twoje imie składa się z " + nameLength + " liter.");
        System.out.println("Masz " + age + " lat, w przeliczeniue na sekundy: " + ageAsSecond);

    }

}
