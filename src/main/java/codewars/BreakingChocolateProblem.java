package codewars;

public class BreakingChocolateProblem {
    public static int breakChocolate(int n, int m) {
        if (n == 1 && m == 1) {
            return 0;
        } else if (n == 0 && m == 0) {
            return 0;
        }
        return n * m - 1;
    }
}
