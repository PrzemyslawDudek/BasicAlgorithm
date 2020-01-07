package codewars;

public class GetMiddleCharacter {

    public static String getMiddle(String word) {
        int wordMiddle = word.length() / 2;
        if (word.length() % 2 == 0 ) {
            return word.substring(wordMiddle - 1, wordMiddle + 1);
        } else {
            return word.substring(wordMiddle, wordMiddle + 1);
        }
    }
}
