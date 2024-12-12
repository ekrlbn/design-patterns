package observer;

public interface PublisherInterface {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscribers(double prev, double newPrice);
}
