import codewars.Digitize;
import codewars.Vowels;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number");
        int a = sc.nextInt();
        System.out.println(a);
        Fibonacci fibonacci = new Fibonacci();
        Factorial factorial = new Factorial();
        System.out.println(fibonacci.getFibonacciNumber(-1));
        System.out.println(factorial.getFactorialNumber(2));

        Digitize digitize = new Digitize();
        System.out.println(Arrays.toString(digitize.digitize(12345)));


        System.out.println(Vowels.getCount("abrakadabra"));
    }
}
