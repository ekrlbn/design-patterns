package prototype.prototypeAfter;

import java.util.HashSet;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        this.size = Size.MEDIUM; // Default size
        this.crust = Crust.THIN; // Default crust
        this.extraCheese = false; // Default extra cheese
        addTopping(Topping.MUSHROOMS);
        addTopping(Topping.GREEN_PEPPERS);
        addTopping(Topping.BLACK_OLIVES);
        addTopping(Topping.SPINACH);
    }

    public VeggiePizza(VeggiePizza veggiePizza) {
        this.size = veggiePizza.size;
        this.crust = veggiePizza.crust;
        this.extraCheese = veggiePizza.extraCheese;

        HashSet<Topping> toppings = new HashSet<>();
        for (Topping topping : veggiePizza.toppings) {
            toppings.add(topping);
        }
        this.toppings = toppings;
    }

    @Override
    public Pizza clone() {
        return new VeggiePizza(this);
    }
}
