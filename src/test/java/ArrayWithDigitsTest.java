import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithDigitsTest {


    @SuppressWarnings({"unused", "ParametrizedTestMethod"})
    private static Stream<Arguments> createCases() {
        return Stream.of(
              Arguments.of(new int[]{0}, new int[]{1}),
              Arguments.of(new int[]{5}, new int[]{6}),
              Arguments.of(new int[]{9}, new int[]{1,0}),
              Arguments.of(new int[]{1,0}, new int[]{1,1}),
              Arguments.of(new int[]{9,9}, new int[]{1,0,0}),
              Arguments.of(new int[]{1,5,9}, new int[]{1,6,0}),
              Arguments.of(new int[]{1,9,9}, new int[]{2,0,0}),
              Arguments.of(new int[]{9,9,9}, new int[]{1,0,0,0})
        );
    }

    @ParameterizedTest
    @MethodSource("createCases")
    void testCases(int[] input, int[] result) {
        //given
        //when
        //then
        assertArrayEquals(result, ArrayWithDigits.incrementNumber(input));
    }

}
