package codility;/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
*/

import java.util.HashSet;
import java.util.Set;

public class CodilityTestTaskArray01 {

    public static int solution(int[] A) {

        int max = 0;

        //create set of Integer numbers
        //find biggest number - bigger than 0
        Set<Integer> setInt = new HashSet<>();
        for (int a : A) {
            if(a > max) {
                max = a;
            }
            setInt.add(a);
        }

        //find smaller int that is not in set and bigger than 0
        for (int i = 1; i <= max; i++) {
            if (!setInt.contains(i)) {
                return i;
            }
        }
        return ++max;
    }
}
