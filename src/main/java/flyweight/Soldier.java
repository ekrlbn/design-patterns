package flyweight;

public class Soldier {
    private int id;
    private String name;
    private Weapon weapon;

    public Soldier(int id, String name, Weapon weapon) {
        this.id = id;
        this.name = name;
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
