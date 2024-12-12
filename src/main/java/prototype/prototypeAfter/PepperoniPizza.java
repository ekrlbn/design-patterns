package prototype.prototypeAfter;

import java.util.HashSet;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        this.size = Size.MEDIUM; // Default size
        this.crust = Crust.THIN; // Default crust
        this.extraCheese = false; // Default extra cheese
        addTopping(Topping.PEPPERONI);
        addTopping(Topping.SPINACH); // Assuming spinach is a unique topping here
    }

    public PepperoniPizza(PepperoniPizza pepperoniPizza) {
        this.size = pepperoniPizza.size;
        this.crust = pepperoniPizza.crust;
        this.extraCheese = pepperoniPizza.extraCheese;

        HashSet<Topping> toppings = new HashSet<>();
        for (Topping topping : pepperoniPizza.toppings) {
            toppings.add(topping);
        }
        this.toppings = toppings;
    }

    @Override
    public Pizza clone() {
        return new PepperoniPizza(this);
    }
}
