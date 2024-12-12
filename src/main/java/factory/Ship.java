package factory;

public class Ship implements Transport{
    private int fuel = 0;
    private final int FUEL_CAP = 200;
    private int goods = 0;
    private final int CAPACITY = 1000;

    @Override
    public void addFuel(int liter) throws Exception {
        if (fuel + liter > FUEL_CAP) throw new Exception("you can't add fuel more than the capacity");
        fuel += liter;
    }

    @Override
    public void loadGoods(int goods) throws Exception {
        if (this.goods + goods > CAPACITY) throw new Exception("You can't add goods more than the capacity");
        this.goods += goods;
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }
}
