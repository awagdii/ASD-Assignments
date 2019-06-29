package day05.strategy;


public abstract class DiscountStrategy
{
	public abstract String getName();
    public abstract double getDiscount(int quantity, double unitPrice);
}
