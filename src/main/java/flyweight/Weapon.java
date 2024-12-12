package flyweight;

public class Weapon {
    private int capacity;
    private int damage;

    public Weapon(int capacity, int damage) {
        this.capacity = capacity;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
