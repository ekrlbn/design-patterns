package prototype.prototypeAfter;

import java.util.HashSet;

public class MargheritaPizza extends Pizza {
    public MargheritaPizza() {
        this.size = Size.MEDIUM; // Default size
        this.crust = Crust.THIN; // Default crust
        this.extraCheese = false; // Default extra cheese
        addTopping(Topping.MUSHROOMS);
        addTopping(Topping.TOMATOES);
    }

    public MargheritaPizza(MargheritaPizza margheritaPizza) {
        this.size = margheritaPizza.size;
        this.crust = margheritaPizza.crust;
        this.extraCheese = margheritaPizza.extraCheese;

        HashSet<Topping> toppings = new HashSet<>();
        for (Topping topping : margheritaPizza.toppings) {
            toppings.add(topping);
        }
        this.toppings = toppings;
    }

    @Override
    public Pizza clone() {
        return new MargheritaPizza(this);
    }
}
