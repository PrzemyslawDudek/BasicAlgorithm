package codewars;

public class MaximumMultiply {
    public static int maxMultiple(int divisor, int bound) {
        for (int i = bound; i > 0; i--) {
            if (i % divisor == 0) {
                return  i;
            }
        }
        return 1;
    }

    public static int maxMultiple2(int divisor, int bound) {
        return (bound / divisor) * divisor;
    }

    public static int maxMultiple3(int divisor, int bound) {
        return bound - bound % divisor;
    }
}
