package observer;

public class Ecommerce {
    public static void main(String[] args) {
        ECommerceItem tv = new ECommerceItem("TV", 999.99);
        ECommerceItem laptop = new ECommerceItem("Laptop", 1199.99);

        PercentageDecreaseNotifier percent10 = new PercentageDecreaseNotifier(10);
        PercentageDecreaseNotifier percent20 = new PercentageDecreaseNotifier(20);

        PriceDecreaseNotifier price200 = new PriceDecreaseNotifier(200);
        PriceDecreaseNotifier price300 = new PriceDecreaseNotifier(300);

        tv.addSubscriber(percent10);
        tv.addSubscriber(price200);

        laptop.addSubscriber(percent20);
        laptop.addSubscriber(price300);

        System.out.println("-----------------NEW CAMPAIGNS-------------------");
        System.out.println("TV:");
        tv.setPrice(849.99);

        System.out.println("-------------------------------------------------");
        System.out.println("Laptop:");
        laptop.setPrice(749.99);
    }
}
