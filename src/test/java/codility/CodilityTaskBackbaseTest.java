package codility;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CodilityTaskBackbaseTest {

    @SuppressWarnings("unused")
    public static Stream<Arguments> createTestCases() {
        return Stream.of(
                Arguments.of(
                        "/test/java/codility",
                        "cd /",
                        "/"
                ),
                Arguments.of(
                        "/test/java/codility",
                        "cd ..",
                        "/test/java"
                ),
                Arguments.of(
                        "/test/java",
                        "cd codility",
                        "/test/java/codility"
                ),
                Arguments.of(
                        "/test/java/codility",
                        "cd ../codewars",
                        "/test/java/codewars"
                ),
                Arguments.of(
                        "/test",
                        "cd codility/",
                        "/test/codility"
                ),
                Arguments.of(
                        "/test/java/codility",
                        "cd ../..",
                        "/test"
                ),
                Arguments.of(
                        "/test/java/codility",
                        "cd /test/java/codility",
                        "/test/java/codility"
                )
        );
    }


    @ParameterizedTest
    @MethodSource("createTestCases")
    void testChangeDirectory(String currentDirectory, String command, String expectedDirectory) {
        //given
        //when
        //then
        assertEquals(expectedDirectory, CodilityTaskBackbase.changeDirectoryString(currentDirectory, command));
    }

    @Test
    void testShouldThrowExceptionWhenMissingKeyWordCD() {
        //given
        //when
        //then
        assertThrows(IllegalStateException.class, () -> CodilityTaskBackbase.changeDirectoryString("/root", "ex"));
    }

}
