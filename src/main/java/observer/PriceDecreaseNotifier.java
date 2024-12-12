package observer;

public class PriceDecreaseNotifier implements Subscriber{
    private final int amount;

    public PriceDecreaseNotifier (int amount) {
        this.amount = amount;
    }

    @Override
    public void update(double currentPrice, double newPrice) {
        if (currentPrice - newPrice  > amount)
            System.out.println("Price has fallen more than " + amount + "$!");
    }
}
