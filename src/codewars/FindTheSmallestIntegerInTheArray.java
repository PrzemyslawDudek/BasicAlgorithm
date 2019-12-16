package codewars;

public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        int smallest;
        smallest = args[0];
        for (int i = 1; i < args.length; i++ ) {
            if (args[i] < smallest) {
                smallest = args[i];
            }
        }
        return smallest;
    }
}
