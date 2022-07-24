package codewars;

public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        String needle = "needle";
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == null) {
                continue;
            }
            if (haystack[i].toString().equals(needle)) {
                return "found the needle at position " + i;
            }
        }
        return null;
    }
}
