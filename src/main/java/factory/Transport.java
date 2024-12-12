package factory;

public interface Transport {
    void addFuel(int liter) throws Exception;
    void loadGoods(int goods) throws Exception;
    int getCapacity();
}
