package day12.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Group extends Product implements Cloneable {
    private List<Product> items = new ArrayList<Product>();

    public Group(int number, String name, String description) {
        super(number, name, description);
    }

    public void add(Product product) {
        items.add(product);
    }

    public int getPrice() {
        int price = 0;

        for (Product product : items)
            price += product.getPrice();

        return price;
    }

    public void show(String margin) {
        super.show(margin);

        System.out.println(margin + "       Items:");

        for (Product product : items) {
            product.show(margin + indent);
        }

        System.out.println();
    }

    // TODO: Implement clone()
    public Object clone() {

        Group group = null;
        group = (Group) super.clone();
        group.items = this.items.stream().map(p -> (Product) p.clone()).collect(Collectors.toList());

        return group;
    }
}