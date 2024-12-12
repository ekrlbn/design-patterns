package visitor;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        List<Item> cart = new ArrayList<>();

        cart.add(new Computer(1, "HP", 999.99));
        cart.add(new Computer(2, "Dell", 649.99));
        cart.add(new Computer(3, "Lenova", 1299.99));
        cart.add(new Computer(4, "Samsung", 599.99));
        cart.add(new Phone(5, "Iphone", 1599.99));
        cart.add(new Phone(6, "Samsung", 1599.99));

        double total = taxCalculator.calculateTotalTax(cart);
        System.out.println(total);

    }
}
