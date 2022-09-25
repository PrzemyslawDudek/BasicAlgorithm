import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class StringTest {


    public static Stream<Arguments> testCasesForTwoFirstLetters() {
        return Stream.of(
                Arguments.of("Dudek", "Du"),
                Arguments.of("Przemysław", "Pr"),
                Arguments.of("8", "8"),
                Arguments.of("Java", "Ja")
        );
    }

    @ParameterizedTest
    @MethodSource("testCasesForTwoFirstLetters")
    void testShouldReturn2FirstLetterFromWord(String word, String result) {

        //given
        String substring;

        //when
        if (word.length() < 2) {
            substring = word;
        } else {
            substring = word.substring(0, 2);
        }

        //then
        assertEquals(result, substring);
    }

}
