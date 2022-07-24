import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithDigitsTest {

    private StringJoiner stringJoiner;

    @BeforeEach
    void initStringJoiner() {
        stringJoiner = new StringJoiner("");
    }

    private int createNumberFromDigitsArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            stringJoiner.add(String.valueOf(array[i]));
        }
        return Integer.parseInt(stringJoiner.toString());
    }

    @Test
    void testShouldReturnIncrementNumberWithTheSameDigitsCount() {
        //given
        int[] inputArray = new int[]{1,9,9};


        //when
        int[] outputArray = ArrayWithDigits.incrementNumber(inputArray);
        int number = createNumberFromDigitsArray(outputArray);


        //then
        assertTrue(inputArray.length == outputArray.length);
        assertTrue(outputArray[outputArray.length - 1] == 0);
        assertTrue(outputArray[0] == 2);
        assertEquals(200, number);

    }

    @Test
    void testShouldReturnIncrementNumberWithTheSameDigitsCountWhenAnyDigitIsNine() {
        //given
        int[] inputArray = new int[]{1,8,8};


        //when
        int[] outputArray = ArrayWithDigits.incrementNumber(inputArray);
        int number = createNumberFromDigitsArray(outputArray);


        //then
        assertTrue(inputArray.length == outputArray.length);
        assertTrue(outputArray[outputArray.length - 1] == 9);
        assertTrue(outputArray[0] == 1);
        assertEquals(189, number);

    }

    @Test
    void testShouldReturnIncrementNumberWithTheBiggerDigitsCount() {
        //given
        int[] inputArray = new int[]{9,9,9};


        //when
        int[] outputArray = ArrayWithDigits.incrementNumber(inputArray);
        int number = createNumberFromDigitsArray(outputArray);


        //then
        assertTrue(inputArray.length + 1 == outputArray.length);
        assertTrue(outputArray[outputArray.length - 1] == 0);
        assertTrue(outputArray[0] == 1);
        assertEquals(1000, number);

    }

}
