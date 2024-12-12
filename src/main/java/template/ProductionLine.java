package template;

import java.util.HashMap;

abstract public class ProductionLine {
    protected HashMap<String, Double> materials;
    protected HashMap<String, Double> inventory;

    public ProductionLine() {
        this.materials = new HashMap<>();
        this.inventory = new HashMap<>();
    }

    public final int calculateRequirements(int amount) {
        try {
            int hours = collectRawMaterials(amount);
            hours += processMaterials(amount);
            hours += assembleMaterials(amount);
            hours += transferToInventory(amount);
            return hours;

        } catch (NotEnoughMaterials e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract int collectRawMaterials(int amount) throws NotEnoughMaterials;
    protected abstract int processMaterials(int amount);
    protected abstract int assembleMaterials(int amount);
    protected abstract int transferToInventory(int amount);

    public void addMaterials(String material, double amount) {
        materials.put(material, amount);
    }
}
