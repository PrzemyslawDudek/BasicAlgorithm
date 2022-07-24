package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SantaNaughtyList {

    public static List<String> findChildren(List<String> santasList, List<String> children) {
        List<String> result = new ArrayList<>();

        for (String s : santasList) {
            if (children.contains(s) && !result.contains(s)) {
                result.add(s);
            }
        }

        Collections.sort(result);
        return result;
    }

}
