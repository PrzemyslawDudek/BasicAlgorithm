package codewars;

public class SumWithoutHighestAndLowerNumber {
    public static int sum(int[] numbers)
    {
        if (numbers == null) {
            return 0;
        }
        int arrayLength = numbers.length;
        if (arrayLength < 2) {
            return 0;
        }
        int smallest = numbers[0];
        int highest = numbers[0];
        int sum = numbers[0];

        for (int i = 1; i < arrayLength; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            } else if (numbers[i] > highest) {
                highest = numbers[i];
            }
            sum = sum + numbers[i];
        }
        return sum - smallest - highest;
    }
}
