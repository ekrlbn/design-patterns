package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements PublisherInterface{
    private final List<Subscriber> subscriberList;

    public Publisher() {
        this.subscriberList = new ArrayList<Subscriber>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }
    public void notifySubscribers(double prev, double newPrice) {
        subscriberList.forEach(subscriber -> subscriber.update(prev, newPrice));
    }

}
