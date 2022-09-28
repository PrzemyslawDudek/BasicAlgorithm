package challengerocket;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChallengeRocketPrimarisTask {

    public Map<String, Double> solve(List<Product> products, List<Category> categories, Map<String, String> margins) {

        // your code here
        Map<String, Double> result = new HashMap<>();

        // create group map
        for (Product p : products) {
            String group = p.getGroup();
            Double cost = p.getCost();
            Double margin = getMarginForCategory(cost, categories, margins);
            double price = round(cost * (1.0 + margin));
            if (result.containsKey(group)) {
                Double groupSum = result.get(group);
                groupSum += price;
                result.put(group, groupSum);
            } else {
                result.put(group, price);
            }
        }

        for (Map.Entry<String, Double> entry : result.entrySet()) {
            String group = entry.getKey();
            List<Product> productsByGroup = products.stream().filter(p -> p.getGroup().equals(group)).collect(Collectors.toList());
            int productCount = productsByGroup.size();
            Double roundAvg = round (entry.getValue() / productCount);
            entry.setValue(roundAvg);
        }

        return result;
    }


    private Double getMarginForCategory(Double cost, List<Category> categories, Map<String, String> margins) {
        //get category by cost
        Category category = null;
        for (Category c : categories) {
            if (c.getTo() == null && cost >= c.getFrom()) {
                category = c;
                break;
            } else  if (cost >= c.getFrom() && cost < c.getTo()) {
                category = c;
                break;
            }
        }

        if (category == null) {
            throw new IllegalStateException("Can not match cost to the category");
        }

        //getMargin
        String margin = margins.get(category.getName());
        if (margin.endsWith("%")) {
            Double number = new Double(margin.replace("%", ""));
            return number / 100;
        } else {
            return new Double(margin);
        }
    }

    private static double round (double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}

class Product {
    private final String name;
    private final String group;
    private final Double cost;

    public Product(String name, String group, Double cost){
        this.name = name;
        this.group = group;
        this.cost = cost;
    }

    @SuppressWarnings("unused")
    public String getName() {
        return this.name;
    }

    public String getGroup() {
        return this.group;
    }

    public Double getCost() {
        return this.cost;
    }
}

class Category {
    private final String name;
    private final Double from;
    private final Double to;

    public Category(String name, Double from, Double to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return this.name;
    }

    public Double getFrom() {
        return this.from;
    }

    public Double getTo() {
        return this.to;
    }
}
