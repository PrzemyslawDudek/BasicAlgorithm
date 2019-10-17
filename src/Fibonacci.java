class Fibonacci {
    Fibonacci() {

    }

    int getFibonacciNumber(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
    }
}
