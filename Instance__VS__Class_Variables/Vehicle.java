import java.util.Scanner;
public class Vehicle{

    private String ownerName;
    private String vehicleType;

    private static double registrationFee;

    public Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("Owner Name : " +ownerName);
        System.out.println("Vehicle Type : " +vehicleType);
        System.out.println("Registration Fee : " +registrationFee + " INR");
    }

    public static void updateRegistrationFee(double newRegistrationFee){
        registrationFee = newRegistrationFee;
    }

    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
        Vehicle.updateRegistrationFee(150);

        Vehicle vehicle1 = new Vehicle("Muskan", "Car");
        Vehicle vehicle2 = new Vehicle("Shreya", "Car");

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
		
	System.out.println("Enter the new Registration fee : ");
	int newFee = scanner.nextInt();
		
        System.out.println("\nUpdating Registration Fee...");
		
        Vehicle.updateRegistrationFee(newFee);

        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
