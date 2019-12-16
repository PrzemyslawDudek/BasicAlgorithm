package codewars;

public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        if (n % x == 0) {
            if (n % y == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
