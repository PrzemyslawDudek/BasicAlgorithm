package codewars;

import static java.lang.Math.toIntExact;
import java.util.Arrays;
import java.util.List;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        List<Character> vowels = Arrays.asList('a','i', 'u', 'e', 'o');
        for(char ch : str.toLowerCase().toCharArray()) {
            System.out.println(ch);
            if (vowels.contains(ch)) {
                vowelsCount++;
            }
        }
        //stream solution
        int result = toIntExact(str.chars().filter(i -> Arrays.asList('a','i', 'u', 'e', 'o').contains((char)i)).count());
        return vowelsCount;
    }

}
