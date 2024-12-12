package prototype.prototypeAfter;

public class PizzaStore {




    public static void main(String[] args) {
        // Create original pizza instances
        Pizza margheritaPizza = new MargheritaPizza();
        Pizza pepperoniPizza = new PepperoniPizza();
        Pizza veggiePizza = new VeggiePizza();

        Pizza customer1Pizza = margheritaPizza.clone();
        Pizza customer2Pizza = pepperoniPizza.clone();
        Pizza customer3Pizza = veggiePizza.clone();

        // Print the final customized pizzas
        System.out.println("Customer 1's Customized Pizza: " + customer1Pizza);
        System.out.println("Customer 2's Customized Pizza: " + customer2Pizza);
        System.out.println("Customer 3's Customized Pizza: " + customer3Pizza);
    }


}
