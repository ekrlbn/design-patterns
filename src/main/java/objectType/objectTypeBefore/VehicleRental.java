package objectType.objectTypeBefore;

import java.util.LinkedList;

public class VehicleRental {

    private LinkedList<Vehicle> availableVehicles = new LinkedList<>();
    private LinkedList<Vehicle> rentedCars = new LinkedList<>();

    public double calculateTotalRentPrice(Vehicle vehicle, int hours) {
        double hourlyRate = vehicle.getPrice();
        return hourlyRate * hours;
    }

    public boolean isAvailable(Vehicle vehicle) {
        return availableVehicles.contains(vehicle);
    }

    public double applyDiscount(double totalPrice, double discountPercentage) {
        double discountAmount = totalPrice * (discountPercentage / 100);
        return totalPrice - discountAmount;
    }

    public void addVehicle(Vehicle vehicle) {
        availableVehicles.add(vehicle);
    }

    public void rentVehicle(Vehicle vehicle) {
        if (isAvailable(vehicle)) {
            availableVehicles.remove(vehicle);
            rentedCars.add(vehicle);
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        if (rentedCars.contains(vehicle)) {
            rentedCars.remove(vehicle);
            availableVehicles.add(vehicle);
        }
    }

    public static void main(String[] args) {
        VehicleRental rental = new VehicleRental();

        Vehicle transporter = new Transporter();
        Vehicle sedan = new Sedan();
        Vehicle pickup = new Pickup();

        rental.addVehicle(transporter);
        rental.addVehicle(sedan);

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
