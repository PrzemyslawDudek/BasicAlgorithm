package codewars;

public class ThinkingAndTesting {
    public static String testSomethingCapitalized(String s) {
        //todo
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String w : words) {
            if (w.length() == 0) {
                continue;
            }
            if (w.length() == 1) {
                stringBuilder.append(w.toUpperCase()).append(" ");
                continue;
            }
            stringBuilder.append(w.substring(0, w.length() -1)).append(w.substring(w.length() - 1).toUpperCase()).append(" ");

        }
        String result = stringBuilder.toString();
        if (result.length() < 1) {
            return result;
        }
        return result.substring(0, result.length() - 1);
    }
}
