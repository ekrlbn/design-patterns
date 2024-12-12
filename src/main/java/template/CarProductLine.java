package template;

public class CarProductLine extends ProductionLine{
    @Override
    protected int collectRawMaterials(int amount) throws NotEnoughMaterials {
        double material = materials.get("rubber");
        if (material < 4 * 5 * amount) throw new NotEnoughMaterials("rubber");
        inventory.put("tyre", inventory.getOrDefault("tyre", 0.0) * amount * 4);

        material = materials.get("aluminiumKg");
        if (material < 400 * amount) throw new NotEnoughMaterials("aluminiumKg");
        inventory.put("aluminiumPanel", inventory.getOrDefault("aluminiumPanel", 0.0) * amount);

        return amount * 10;

    }

    @Override
    protected int processMaterials(int amount) {
        System.out.println("Processing " + amount * 4+ " tyres and " + amount + " aluminiumPanel");
        inventory.computeIfPresent("tyre", (key, value) -> value - amount * 4);
        inventory.computeIfPresent("aluminiumPanel", (key, value) -> value - amount);
        inventory.put("processedTyre", inventory.getOrDefault("processedTyre", 0.0) * amount * 4);
        inventory.put("processedAluminiumPanel", inventory.getOrDefault("processedAluminiumPanel", 0.0) * amount);
        return amount * 20;
    }

    @Override
    protected int assembleMaterials(int amount) {
        System.out.println("Assembling...");
        inventory.computeIfPresent("processedTyre", (key, value) -> value - amount);
        inventory.computeIfPresent("processedAluminiumPanel", (key, value) -> value - amount);
        return amount * 7;
    }

    @Override
    protected int transferToInventory(int amount) {
        System.out.println("Transfer...");
        inventory.put("car", inventory.getOrDefault("car", 0.0) * amount);
        return amount * 10;
    }
}
