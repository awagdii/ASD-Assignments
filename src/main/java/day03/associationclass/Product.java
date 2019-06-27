package day03.associationclass;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Product {
    private String name;
    private String description;
    private List<Terms> terms = new ArrayList<Terms>();

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public double getMinPrice() {
        Terms minTerm = terms.stream().min(Comparator.comparing(Terms::getPrice)).orElseThrow(NoSuchElementException::new);
        return minTerm.getPrice();
    }

    public double getMaxPrice() {
        Terms maxTerm = terms.stream().max(Comparator.comparing(Terms::getPrice)).orElseThrow(NoSuchElementException::new);
        return maxTerm.getPrice();
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

    public List<Terms> getTerms() {
        return terms;
    }

    public void addTerms(Terms terms) {
        this.terms.add(terms);
    }
}
