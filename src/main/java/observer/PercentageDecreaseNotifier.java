package observer;

public class PercentageDecreaseNotifier implements Subscriber{
    private final int percentage;

    public PercentageDecreaseNotifier(int percentage) {
        this.percentage = percentage;
    }


    @Override
    public void update(double currentPrice, double newPrice) {
        if ( (1 - newPrice / currentPrice) * 100 > percentage)
            System.out.println("Price of the item decreased more than " + percentage + "%!");
    }
}
