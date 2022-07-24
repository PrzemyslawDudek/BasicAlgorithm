public class ArrayWithDigits {


    public static int[] incrementNumber(int[] array) {
        if (isAllDigitAreNine(array)) {
            int[] outputArray = new int[array.length+1];
            outputArray[0] = 1;
            for (int i = 1; i < outputArray.length; i++) {
                outputArray[i] = 0;
            }
            return outputArray;
        }

        if (array[array.length-1] == 9) {
            array[array.length-1] = 0;

            if (array[array.length-2] == 9) {
                array[array.length-2] = 0;

                if (array[array.length-3] == 9) {
                    array[array.length-3] = 0;
                } else {
                    array[array.length-3] = array[array.length-3] + 1;
                }

            } else {
                array[array.length-2] = array[array.length-2] + 1;
            }

        } else {
            array[array.length-1] = array[array.length-1] + 1;
        }

        return array;
    }

    private static boolean isAllDigitAreNine(int[] array) {
        for (int j : array) {
            if (j != 9) {
                return false;
            }
        }

        return true;
    }


}
