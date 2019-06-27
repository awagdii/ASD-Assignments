package day03.ternaryassociation;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String description;
    private List<Deal> deals = new ArrayList<Deal>();

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void addDeal(Deal deal) {
        this.deals.add(deal);
    }
}
