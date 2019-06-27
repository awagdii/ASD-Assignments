package day03.ternaryassociation;

import java.util.ArrayList;
import java.util.List;

public class SalesConsultant {

    private String name;
    private String address;
    private String phone;
    private List<Deal> deals = new ArrayList<Deal>();


    public SalesConsultant(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public List<Deal> getDeals() {
        return deals;
    }

    public void addDeal(Deal deal) {
        this.deals.add(deal);
    }
}
