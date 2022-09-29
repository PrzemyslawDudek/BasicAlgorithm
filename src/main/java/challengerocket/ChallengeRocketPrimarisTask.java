package challengerocket;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class ChallengeRocketPrimarisTask {

    public Map<String, Double> solve(List<Product> products, List<Category> categories, Map<String, String> margins) {

        // your code here
        Map<String, Double> result = new HashMap<>();

        Map<String, ProductGroup> productGroupMap = new HashMap<>();

        // create group map
        for (Product p : products) {
            String group = p.getGroup();
            if (productGroupMap.containsKey(group)) {
                productGroupMap.get(group).addProduct(p);
            } else {
                productGroupMap.put(group, new ProductGroup(p));
            }
        }

        //Avg price for group
        for (Map.Entry<String, ProductGroup> entry : productGroupMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue().getAvrPriceFroProductGroup(categories, margins));
        }

        return result;
    }

}

class ProductGroup {
    private final List<Product> products;

    public ProductGroup(Product product) {
        products = new ArrayList<>();
        products.add(product);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getAvrPriceFroProductGroup(List<Category> categories, Map<String, String> margins) {
        double sumOfPriceInGroup = 0.0;
        for (Product p : products) {
            Double cost = p.getCost();
            Double margin = getMarginForCategory(cost, categories, margins);
            sumOfPriceInGroup += round(cost * (1.0 + margin));
        }
        return round(sumOfPriceInGroup / products.size());
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

        //getMargin for Category
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
