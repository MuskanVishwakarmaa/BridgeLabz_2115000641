import java.util.ArrayList;
import java.util.List;

// Interface for insurable vehicles
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Getters
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    // Display vehicle details
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Cost for " + days + " days: $" + calculateRentalCost(days));
        
        if (this instanceof Insurable) {
            System.out.println(((Insurable) this).getInsuranceDetails());
        }
    }
}

// Car class
class Car extends Vehicle implements Insurable {
    private double insuranceRate = 0.05; // 5% of rental cost

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (5% of daily rental cost) applied: $" + calculateInsurance();
    }
}

// Bike class
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    private double insuranceRate = 0.10; // 10% of rental cost

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (10% of daily rental cost) applied: $" + calculateInsurance();
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Car("CAR123", 50));
        vehicles.add(new Bike("BIKE456", 20));
        vehicles.add(new Truck("TRUCK789", 100));
        
        int rentalDays = 5;
        
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(rentalDays);
            System.out.println("--------------------------");
        }
    }
}
