import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {

    @SuppressWarnings("unused")
    private static Stream<String> createCases() {
        return Stream.of(
                "DuduD",
                "DuD",
                "TeneT",
                "TenneT",
                "TeT",
                "TT"
        );
    }


    @ParameterizedTest
    @MethodSource("createCases")
    void testValidPalindromChecker(String word) {
        //given
        //When
        //then
        assertAll(
                () -> assertTrue(Palindrom.isPalindromStringBuffer(word)),
                () -> assertTrue(Palindrom.isPalindromStringBuilder(word)),
                () -> assertTrue(Palindrom.isPalindromCharArray(word)),
                () -> assertTrue(Palindrom.isPalindromUseCollection(word))
        );
    }

}
