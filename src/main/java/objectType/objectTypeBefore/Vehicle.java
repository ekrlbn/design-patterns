package objectType.objectTypeBefore;

public class Vehicle {
    private String name;
    private int year;
    private int capacity;
    private String color;
    private String engine;
    private String fuelType;
    private double price;

    public Vehicle(String name, int year, int capacity, String color, String engine, String fuelType, double price) {
        this.name = name;
        this.year = year;
        this.capacity = capacity;
        this.color = color;
        this.engine = engine;
        this.fuelType = fuelType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }
}
