package template;

public class PhoneProductLine extends ProductionLine{
    @Override
    protected int collectRawMaterials(int amount) throws NotEnoughMaterials {
        double material = materials.get("rubber");
        if (material < 2 *  amount) throw new NotEnoughMaterials("rubber");
        inventory.put("plasticComponent", inventory.getOrDefault("plasticComponent", 0.0) * amount * 20);

        material = materials.get("copperKg");
        if (material < 0.3 * amount) throw new NotEnoughMaterials("copperKg");
        inventory.put("copperWire", inventory.getOrDefault("copperWire", 0.0) * amount * 100);

        return amount * 20;

    }

    @Override
    protected int processMaterials(int amount) {
        System.out.println("Processing " + amount * 100 + " copperWires and " + amount * 20 + " plasticComponents");
        inventory.computeIfPresent("plasticComponent", (key, value) -> value - amount * 20);
        inventory.computeIfPresent("copperWire", (key, value) -> value - amount * 100);
        inventory.put("processedPlasticComponent", inventory.getOrDefault("processedPlasticComponent", 0.0) * amount * 20);
        inventory.put("processedCopperWire", inventory.getOrDefault("processedCopperWire", 0.0) * amount * 100);
        return amount * 3;
    }

    @Override
    protected int assembleMaterials(int amount) {
        System.out.println("Assembling...");
        inventory.computeIfPresent("processedPlasticComponent", (key, value) -> value - amount * 20);
        inventory.computeIfPresent("processedCopperWire", (key, value) -> value - amount * 100);
        return amount;
    }

    @Override
    protected int transferToInventory(int amount) {
        System.out.println("Transfer...");
        inventory.put("phone", inventory.getOrDefault("phone", 0.0) * amount);
        return amount * 10;
    }
}
