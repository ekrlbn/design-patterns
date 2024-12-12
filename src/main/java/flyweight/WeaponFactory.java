package flyweight;

import java.util.HashMap;

public class WeaponFactory {
    private static HashMap<String, Weapon> weapons;

    public WeaponFactory() {
        weapons = new HashMap<>();
    }
    
    public Weapon getWeapon(String weaponName, int capacity, int damage) {
        weapons.computeIfAbsent(weaponName, k -> new Weapon(capacity, damage));
        return weapons.get(weaponName);
    }

    public int numberOfWeaponTypes() {
        return weapons.size();
    }

}
