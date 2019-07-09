package day12.prototype;

public class ProductItem extends Product implements Cloneable {
    private int price;

    public ProductItem(int number, String name, String description, int price) {
        super(number, name, description);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // TODO: Implement clone()
    public Object clone() {
        return super.clone();
    }
}