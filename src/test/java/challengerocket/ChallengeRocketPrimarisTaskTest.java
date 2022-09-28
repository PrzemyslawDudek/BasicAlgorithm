package challengerocket;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeRocketPrimarisTaskTest {


    @Test
    void test() {
        List<Product> products = Arrays.asList(
                new Product("A", "G1", 20.0),
                new Product("B", "G2", 90.0),
                new Product("C", "G1", 50.0),
                new Product("D", "G3", 30.0),
                new Product("E", "G3", 75.5));

        List<Category> categories = Arrays.asList(
                new Category("C2", 50.0, 100.0),
                new Category("C1", 0.0, 50.0));

        Map<String, String> margins = new HashMap<String, String>() {{
            put("C1", "10%");
            put("C2", "0.2");
        }};

        Map<String, Double> result = new ChallengeRocketPrimarisTask().solve(products, categories, margins);

        assertEquals(Double.valueOf(41.0), result.get("G1"));
        assertEquals(Double.valueOf(108.0), result.get("G2"));
        assertEquals(Double.valueOf(61.8), result.get("G3"));
    }

}
