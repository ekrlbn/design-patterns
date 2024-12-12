package factory;

public class LandLogistic extends Logistic{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
