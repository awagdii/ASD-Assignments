package day03.ternaryassociation;

public class Deal {
    private int number;
    private CustomerCompany customerCompany;
    private SalesConsultant salesConsultant;
    private Product product;

    public Deal(int number, CustomerCompany customerCompany, SalesConsultant salesConsultant, Product product) {
        this.number = number;
        this.customerCompany = customerCompany;
        this.customerCompany.addDeal(this);
        this.salesConsultant = salesConsultant;
        this.salesConsultant.addDeal(this);

        this.product = product;
        this.product.addDeal(this);
    }

    public void show() {
        System.out.println("Deal#" + number + "\n" +
                "    customerCompany  :  " + customerCompany.getName() + "\n" +
                "    salesConsultant  :  " + salesConsultant.getName() + "\n" +
                "    product  :  " + product.getName() + "\n");

    }
}
