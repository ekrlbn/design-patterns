package prototype.prototypeBefore;

import java.util.HashSet;
import java.util.Set;

public class Pizza {
    private String name;
    public Size size = Size.SMALL;
    public Set<Topping> toppings = new HashSet<>();
    public Crust crust = Crust.THIN;
    public boolean extraCheese = false;
    private final double BASE_PRICE = 10;
    private double price = BASE_PRICE;

    public Pizza() {
    }

    public Pizza(Size size, Crust crust, boolean extraCheese) {
        if (extraCheese) {
            this.price += 1.5; // Extra charge for extra cheese
        }
        this.size = size;
        this.crust = crust;
        this.extraCheese = extraCheese;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        this.price += 1.2;
    }

    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }

    public boolean isVegetarian() {
        for (Topping topping : toppings) {
            if (topping == Topping.PEPPERONI || topping == Topping.SAUSAGE ||
                    topping == Topping.BACON || topping == Topping.HAM ||
                    topping == Topping.CHICKEN || topping == Topping.ANCHOVIES) {
                return false;
            }
        }
        return true;
    }

    public void makeVegetarian() {
        if (isVegetarian()) return;
        toppings.removeIf(topping -> topping != Topping.PEPPERONI &&
                topping != Topping.SAUSAGE &&
                topping != Topping.BACON &&
                topping != Topping.HAM &&
                topping != Topping.CHICKEN &&
                topping != Topping.ANCHOVIES);
    }


    public boolean isExtraCheese() {
        return extraCheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", toppings=" + toppings +
                ", crust=" + crust +
                ", extraCheese=" + extraCheese +
                ", BASE_PRICE=" + BASE_PRICE +
                ", price=" + price +
                '}';
    }

    protected void setName(String name) {
        this.name = name;
    }
}
