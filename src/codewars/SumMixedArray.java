package codewars;

import java.util.List;

public class SumMixedArray {
    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object e : mixed) {
            if (e instanceof Integer) {
                sum += ((Integer) e);
            } else if (e instanceof String) {
                sum += Integer.parseInt((String) e);
            }
        }
        return sum;
    }
}
