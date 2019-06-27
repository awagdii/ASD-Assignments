package day03.associationclass;

public class Terms {

    private Vendor vendor;
    private Product product;
    private double delay;
    private double price;
    private double refund;

    public Terms(Vendor vendor, Product product) {
        this.vendor = vendor;
        this.product = product;

        product.addTerms(this);
        vendor.addTerms(this);
    }

    public Terms(Vendor vendor, Product product, double price) {
        this(vendor,product);
        this.price = price;
    }

    public double getDelay() {
        return delay;
    }

    public void setDelay(double delay) {
        this.delay = delay;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRefund() {
        return refund;
    }

    public void setRefund(double refund) {
        this.refund = refund;
    }
}
