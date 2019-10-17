class Factorial {
    Factorial(){}
    int getFactorialNumber(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * getFactorialNumber(n - 1);
    }
}
