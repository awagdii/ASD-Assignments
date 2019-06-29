package day05.strategy;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private double price;
    private int quantity;
    private List<DiscountStrategy> discountStrategies = new ArrayList<>();

    public Order(double unitPrice, int quantity) {
        this.price = unitPrice;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategies.add(discountStrategy);
    }
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategies.clear();
        this.discountStrategies.add(discountStrategy);
    }

    public double getDiscountedPrice() {
        double discountedPrice = quantity * price;        // Calculated price after discount is applied

        for (DiscountStrategy discountStrategy : discountStrategies) {
            double discount = discountStrategy.getDiscount(quantity, price);
            discountedPrice = discountedPrice * (1 - discount);
        }
        return Math.floor(discountedPrice);
    }

    public String getDiscountType() {
        StringBuilder ret = new StringBuilder();

        if (!discountStrategies.isEmpty())
            for (DiscountStrategy discountStrategy : discountStrategies) {
                ret.append(discountStrategy.getName());
                if (discountStrategies.indexOf(discountStrategy) != discountStrategies.size() - 1) {
                    ret.append("+");
                }
            }
        else
            ret.append("No discount");

        return ret.toString();
    }

    public String show() {
        StringBuilder descr = new StringBuilder();

        descr.append("Quantity: ").append(quantity).append(", Unit price: ").append(price).append("= ").
                append(price).append(" = ").append(quantity * price).append(", with discount: ").
                append(getDiscountType()).append(":\t").append(getDiscountedPrice()).append("\n");

        return descr.toString();

    }
}
