package template;

public class NotEnoughMaterials extends Exception {
    public NotEnoughMaterials(String material) {
        super("Not enough material: " + material);
    }
}
