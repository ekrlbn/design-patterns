package flyweight;


import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Soldier> soldiers;

    public static long getSizeOfWeapon(Weapon weapon) {
        return ClassLayout.parseInstance(weapon).instanceSize();
    }

    public static long getSizeOfSoldierWithWeapon(Soldier soldier) {
        int nameSize = soldier.getName().getBytes().length;
        long weaponSize = getSizeOfWeapon(soldier.getWeapon());
        long soldierSize = ClassLayout.parseInstance(soldier).instanceSize();

        return nameSize + weaponSize + soldierSize;
    }

    public static long getSizeOfSoldierOnly(Soldier soldier) {

        int nameSize = soldier.getName().getBytes().length;
        long soldierSize = ClassLayout.parseInstance(soldier).instanceSize();

        return nameSize + soldierSize;
    }


    public static void createHundredThousand() {
        Weapon weapon = new Weapon(100, 100);
        Soldier soldier = new Soldier(1, "new Sold", weapon);
        long sizeOfSingleSoldier = getSizeOfSoldierWithWeapon(soldier);
        for (int i = 1; i <= 100000; i++) {
            soldier = new Soldier(1, "new Sold", weapon);
            soldiers.add(soldier);
        }

        System.out.println("Total Used space: " + soldiers.size() * sizeOfSingleSoldier  + " bytes");
    }

    public static void createHundredThousandFlyweight() {

        WeaponFactory weaponFactory = new WeaponFactory();
        Weapon weapon = weaponFactory.getWeapon("M4A1", 100, 200);
        Soldier soldier = new Soldier(1, "new Sold", weapon);
        long weaponSize = getSizeOfWeapon(weapon);
        long sizeOfSingleSoldier = getSizeOfSoldierOnly(soldier);
        for (int i = 1; i <= 100000; i++) {
            Weapon weapon1 = weaponFactory.getWeapon("M4A1", 100, 200);
            soldier = new Soldier(1, "new Sold", weapon1);
            soldiers.add(soldier);
        }

        long totalSize = soldiers.size() * sizeOfSingleSoldier + weaponFactory.numberOfWeaponTypes() * weaponSize;
        System.out.println("Total Used space: " + totalSize + " bytes");
    }


    public static void main(String[] args) {
        soldiers = new ArrayList<>();
        createHundredThousand();
        soldiers = new ArrayList<>();
        createHundredThousandFlyweight();
    }
}
