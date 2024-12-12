package observer;

public interface Subscriber {
    void update(double prev, double price);
}
