package day07.visitors;

import day07.app.*;

public class TravelVisitor extends Visitor {

    private double cost = 0.0;

    public void execute(SalesConsultant salesConsultant) {
        for (Deal deal : salesConsultant.getDeals())
            deal.acceptVisitor(this);
    }

    public void execute(Deal deal) {
        for (Event event : deal.getEvents())
            event.acceptVisitor(this);
    }

    public void execute(Event event) {
        if (event.getTravel() != null)
            cost += event.getTravel().getCost();

        cost += event.getCost();
    }


    @Override
    public Object getState() {
        return cost;
    }
}
