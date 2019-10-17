public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Fibonacci fibonacci = new Fibonacci();
        Factorial factorial = new Factorial();
        System.out.println(fibonacci.getFibonacciNumber(-1));
        System.out.println(factorial.getFactorialNumber(2));
    }
}
