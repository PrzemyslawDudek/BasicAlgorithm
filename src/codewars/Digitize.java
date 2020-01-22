package codewars;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Digitize {
    public int[] digitize(long n) {

        String temp = String.valueOf(n);

        char[] tempArray =  temp.toCharArray();
        int[] intArray = new int[tempArray.length];

        for (int i = 0; i < tempArray.length; i++) {
            intArray[i] = Character.getNumericValue(tempArray[tempArray.length -  i - 1]);
        }


        return intArray;
    }
}
