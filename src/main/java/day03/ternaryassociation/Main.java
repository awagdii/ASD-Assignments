package day03.ternaryassociation;

public class Main {

    public static void main(String[] args) {
        CustomerCompany customerCompany = new CustomerCompany("Google", "641-032-1322", "San Fransisco", "800-2352-122", "800-2352-122");
        Product product = new Product("Mac Book", "mac book pro");
        SalesConsultant salesConsultant = new SalesConsultant("john", "Fairfeild", "641-2352-231");

        Deal deal1 = new Deal(1, customerCompany, salesConsultant, product);
        deal1.show();
    }
}
