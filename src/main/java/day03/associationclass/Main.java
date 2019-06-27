package day03.associationclass;

import day03.ternaryassociation.CustomerCompany;
import day03.ternaryassociation.Deal;
import day03.ternaryassociation.SalesConsultant;

public class Main {

    public static void main(String[] args) {
        Vendor vendor = new Vendor();
        vendor.setName("Apple");

        Product product = new Product("MacBook", "mac book pro");
        new Terms(vendor, product, 1000);
        new Terms(vendor, product, 200);
        new Terms(vendor, product, 3000);
        new Terms(vendor, product, 5000);


        System.out.println("Min price for product  : " + product.getName() + "   is " + product.getMinPrice());
        System.out.println("Max price for product  : " + product.getName() + "   is " + product.getMaxPrice());

    }
}
