package observer;

public class ECommerceItem extends Publisher{
    private String itemName;
    private double price;

    public ECommerceItem(String itemName, double price) {
        super();
        this.itemName = itemName;
        this.price = price;
    }

    public void setPrice(double price) {
        notifySubscribers(this.price, price);
        this.price = price;
    }
}
