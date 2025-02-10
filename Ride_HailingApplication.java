import java.util.ArrayList;
import java.util.List;

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class Vehicle
abstract class Vehicle implements GPS {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("\nVehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // GPS methods implementation
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Car class
class Car extends Vehicle {
    public Car(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 10; // Car rate per km is $10
    }
}

// Bike class
class Bike extends Vehicle {
    public Bike(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 5; // Bike rate per km is $5
    }
}

// Auto class
class Auto extends Vehicle {
    public Auto(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 7; // Auto rate per km is $7
    }
}

// Main class
public class Ride_HailingApplication {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        
        rides.add(new Car(101, "Muskan", 10, "Downtown"));
        rides.add(new Bike(102, "Rashmi", 5, "Uptown"));
        rides.add(new Auto(103, "Priya", 7, "Suburbs"));
        
        double distance = 12.5; // Example distance in km
        
        for (Vehicle ride : rides) {
            ride.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: $" + ride.calculateFare(distance));
            System.out.println("--------------------------------");
        }
    }
}
