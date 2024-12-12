package template;

public class App {
    public static void main(String[] args) {
        ProductionLine phoneProductLine = new PhoneProductLine();
        phoneProductLine.addMaterials("rubber", 2000);
        phoneProductLine.addMaterials("copperKg", 300);

        int hoursRequired = phoneProductLine.calculateRequirements(200);
        System.out.println(hoursRequired + " hours required for 200 Phone");

        ProductionLine carProductLine = new CarProductLine();
        carProductLine.addMaterials("rubber", 500);
        carProductLine.addMaterials("aluminiumKg", 50);

        hoursRequired = carProductLine.calculateRequirements(20);
        System.out.println(hoursRequired + " hours required for 20 Car");



    }
}
