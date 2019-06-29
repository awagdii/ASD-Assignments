package day05.strategy;

public class CharitableDiscount extends DiscountStrategy {
    public String getName() {
        return "Charitable";
    }

    @Override
    public double getDiscount(int quantity, double unitPrice) {

        double price = unitPrice *quantity;
        if (quantity > 2000) return 0;
        else if (price > 0 && price <= 1000) return 0.9;
        else if (price <= 8500) return .8;
        else if (price <= 50000) return .7;
        else if (price <= 100000) return .5;
        else return 0;
    }
}
