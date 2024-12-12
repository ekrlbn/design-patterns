package objectType.objectTypeAfter;

import java.util.LinkedList;

public class VehicleRental {

    private LinkedList<VehicleType> availableVehicles = new LinkedList<>();
    private LinkedList<VehicleType> rentedCars = new LinkedList<>();

    public double calculateTotalRentPrice(VehicleType vehicle, int hours) {
        double hourlyRate = vehicle.getPrice();
        return hourlyRate * hours;
    }

    public boolean isAvailable(VehicleType vehicle) {
        return availableVehicles.contains(vehicle);
    }

    public double applyDiscount(double totalPrice, double discountPercentage) {
        double discountAmount = totalPrice * (discountPercentage / 100);
        return totalPrice - discountAmount;
    }

    public void addVehicle(VehicleType vehicle) {
        availableVehicles.add(vehicle);
    }

    public void rentVehicle(VehicleType vehicle) {
        if (isAvailable(vehicle)) {
            availableVehicles.remove(vehicle);
            rentedCars.add(vehicle);
        }
    }

    public void returnVehicle(VehicleType vehicle) {
        if (rentedCars.contains(vehicle)) {
            rentedCars.remove(vehicle);
            availableVehicles.add(vehicle);
        }
    }

    private VehicleType createNewType(String name, int year, int capacity, String color, String engine, String fuelType, double price) {
         VehicleType vehicleType = new VehicleType(name, year, capacity, color, engine, fuelType, price);
         addVehicle(vehicleType);
         return vehicleType;
    }

    public static void main(String[] args) {
        VehicleRental rental = new VehicleRental();

        VehicleType transporter = rental.createNewType("Transporter", 2010, 6, "red", "v8", "gasoline", 10.2);
        VehicleType sedan = rental.createNewType("Sedan", 2021, 5, "black", "v7", "electric", 30.2);
        VehicleType pickup = rental.createNewType("Pickup", 1989, 2, "yellow", "v6", "diesel", 20.4);

        double sedanRentPrice = rental.calculateTotalRentPrice(sedan, 5);
        System.out.println("Total Rent Price for Sedan (5 hours): $" + sedanRentPrice);

        double discountedPrice = rental.applyDiscount(sedanRentPrice, 10);
        System.out.println("Discounted Price for Sedan: $" + discountedPrice);

        boolean isPickupAvailable = rental.isAvailable(pickup);
        System.out.println("Is Pickup Available? " + isPickupAvailable);

        rental.rentVehicle(sedan);
        System.out.println("Is Sedan Available After Rental? " + rental.isAvailable(sedan));

        rental.returnVehicle(sedan);
        System.out.println("Is Sedan Available After Return? " + rental.isAvailable(sedan));
    }
}
