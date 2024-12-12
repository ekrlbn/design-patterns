package prototype.prototypeBefore;

import java.util.HashSet;

public class PizzaStore {

    public static void main(String[] args) {
        // Create original pizza instances
        Pizza margheritaPizza = createMargheritaPizza();
        Pizza pepperoniPizza = createPepperoniPizza();
        Pizza veggiePizza = createVeggiePizza();

        // Create customized pizzas from the originals
        Pizza customer1Pizza = customizePizza(margheritaPizza, new Topping[]{Topping.MUSHROOMS}, new Topping[]{Topping.TOMATOES});
        Pizza customer2Pizza = customizePizza(pepperoniPizza, new Topping[]{}, new Topping[]{Topping.PEPPERONI});
        Pizza customer3Pizza = customizePizza(veggiePizza, new Topping[]{Topping.BLACK_OLIVES}, new Topping[]{Topping.GREEN_PEPPERS});

        // Print the final customized pizzas
        System.out.println("Customer 1's Customized Pizza: " + customer1Pizza);
        System.out.println("Customer 2's Customized Pizza: " + customer2Pizza);
        System.out.println("Customer 3's Customized Pizza: " + customer3Pizza);
    }

    // Method to create Margherita Pizza
    public static Pizza createMargheritaPizza() {
        Pizza pizza = new Pizza();
        pizza.size = Size.MEDIUM; // Default size
        pizza.crust = Crust.THIN; // Default crust
        pizza.extraCheese = false; // Default extra cheese
        pizza.addTopping(Topping.MUSHROOMS);
        pizza.addTopping(Topping.TOMATOES);
        return pizza;
    }

    // Method to create Pepperoni Pizza
    public static Pizza createPepperoniPizza() {
        Pizza pizza = new Pizza();
        pizza.size = Size.MEDIUM; // Default size
        pizza.crust = Crust.THIN; // Default crust
        pizza.extraCheese = false; // Default extra cheese
        pizza.addTopping(Topping.PEPPERONI);
        pizza.addTopping(Topping.SPINACH);
        return pizza;
    }

    // Method to create Veggie Pizza
    public static Pizza createVeggiePizza() {
        Pizza pizza = new Pizza();
        pizza.size = Size.MEDIUM; // Default size
        pizza.crust = Crust.THIN; // Default crust
        pizza.extraCheese = false; // Default extra cheese
        pizza.addTopping(Topping.MUSHROOMS);
        pizza.addTopping(Topping.GREEN_PEPPERS);
        pizza.addTopping(Topping.BLACK_OLIVES);
        pizza.addTopping(Topping.SPINACH);
        return pizza;
    }

    // Method to customize pizza
    public static Pizza customizePizza(Pizza originalPizza, Topping[] toppingsToRemove, Topping[] toppingsToAdd) {
        Pizza customizedPizza = new Pizza();
        customizedPizza.size = originalPizza.size;
        customizedPizza.crust = originalPizza.crust;
        customizedPizza.extraCheese = originalPizza.extraCheese;
        customizedPizza.toppings = new HashSet<>(originalPizza.toppings); // Copy toppings

        // Remove specified toppings
        for (Topping topping : toppingsToRemove) {
            customizedPizza.removeTopping(topping);
        }

        // Add specified toppings
        for (Topping topping : toppingsToAdd) {
            customizedPizza.addTopping(topping);
        }

        return customizedPizza;
    }
}
