package day03.ternaryassociation;

import java.util.ArrayList;
import java.util.List;

public class CustomerCompany {
    private String name;
    private String contact;
    private String address;
    private String phone;
    private String fax;
    private List<Deal> deals = new ArrayList<Deal>();


    public CustomerCompany(String name, String contact, String address, String phone, String fax) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void addDeal(Deal deal) {
        this.deals.add(deal);
    }
}
