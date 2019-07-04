package day09;

import java.util.ArrayList;
import java.util.List;

public class HomelessDiscount extends DiscountStrategy {

    private String name = "HOMELESS";

    private List<DiscountStrategy> discountStrategies = new ArrayList<>();

    public void addDiscount(DiscountStrategy ds) {
        discountStrategies.add(ds);
    }

    public void removeDiscount(DiscountStrategy ds) {
        discountStrategies.remove(ds);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getDiscount(int quantity, double unitPrice) {

        double discountPrice = 0;

        for (int i = 0; i < discountStrategies.size(); i++) {
            discountPrice += discountStrategies.get(i).getDiscount(quantity, unitPrice);
        }
        return discountPrice < 1 ? discountPrice : 1;
    }
}
