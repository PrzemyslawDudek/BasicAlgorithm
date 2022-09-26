package codility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CodilityTestTaskArray01Test {

    @SuppressWarnings("unused")
    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 6, 4, 1, 2}, 5),
                Arguments.of(new int[]{1, 2, 3}, 4),
                Arguments.of(new int[]{-1, -3}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] array, int result) {
        //given
        //when
        //then
        assertEquals(result, CodilityTestTaskArray01.solution(array));
    }

}
