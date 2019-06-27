package day03.associationclass;

import java.util.ArrayList;
import java.util.List;

public class Vendor extends Company {

    private List<Terms> terms = new ArrayList<Terms>();

    public List<Terms> getTerms() {
        return terms;
    }

    public void addTerms(Terms terms) {
        this.terms.add(terms);
    }
}
