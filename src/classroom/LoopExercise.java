package classroom;

import java.util.Scanner;

public class LoopExercise {

//          *
//         ***
//        *****
//         ***
//        *****
//       *******
//        *****
//       *******
//      *********

    public static void main(String[] args) {

        //zmienne używane w programie
        final char sign = '*';
        int sizeOfTree = 0;

        //deklaracja klasy Scanner. Od tej pory można się do niej donosić za pomocą zmiennej o nazwie "scanner"
        Scanner scanner = new Scanner(System.in);

        //Zadanie 1 - wygeneruj w konsoli trójkąt prostkątny:
        //  *
        //  **
        //  ***
        //  ...

        System.out.println("Podaj wielkość trójkąta: ");
        //w tym miejscu umieśc swój kod.

        for (int i = 0; i < sizeOfTree; i++) {
            System.out.print(sign);
            System.out.println(sign);
        }

        //Zadanie 2 - wygeneruj w konsoli trójkąt równo ramienny:
        //          *
        //         ***
        //        *****
        //         ...

        System.out.println("Podaj wielkość trójkąta: ");
        //w tym miejscu umieśc swój kod.

        for (int i = 0; i < sizeOfTree; i++) {
            System.out.print(sign);
            System.out.println(sign);
        }

    }

}
