package day09;


public abstract class DiscountStrategy
{

    public abstract String getName();
    public abstract double getDiscount(int quantity, double unitPrice);
    public double getDiscountedPrice(int quantity,double price){
        double discount = getDiscount(quantity, price);
        double discountedPrice = quantity * price * (1 - discount);
        return discountedPrice;
    }

}
