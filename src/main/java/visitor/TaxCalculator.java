package visitor;

import java.util.List;

public class TaxCalculator implements Visitor {

    @Override
    public double visitItem(Phone phone) {
        return phone.getPrice() * 1.2;
    }

    @Override
    public double visitItem(Computer computer) {
        return computer.getPrice() * 0.2;
    }


    public double calculateTotalTax(List<Item> items) {
        double totalTax = 0.0;
        for (Item item : items) {
            totalTax += item.accept(this);
        }
        return totalTax;
    }

}
