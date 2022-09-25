import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrom {

    public static boolean isPalindromStringBuffer(String word) {
        @SuppressWarnings("StringBufferMayBeStringBuilder") StringBuffer sbf = new StringBuffer(word);
        sbf.reverse();
        return word.equals(sbf.toString());
    }

    public static boolean isPalindromStringBuilder(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString().equals(word);
    }

    public static boolean isPalindromCharArray(String word) {
        char[] charArray = word.toCharArray();
        int modulo = charArray.length % 2;
        int lastChar = charArray.length - 1;
        for (int i = 0; i < ((charArray.length - 1) / 2) + modulo; i ++) {
            if (charArray[i] != charArray[lastChar]) {
                return false;
            }
            lastChar--;
        }

        return true;
    }

    public static boolean isPalindromUseCollection(String word) {
        List<Character> list = word.chars().mapToObj(ch -> (char)ch).collect(Collectors.toList());
        List<Character> reversList = new ArrayList<>(list);
        Collections.reverse(reversList);
        return reversList.equals(list);
    }

}
