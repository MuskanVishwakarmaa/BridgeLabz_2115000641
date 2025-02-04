import java.util.Scanner;
class Vehicle{
	static int registrationFee = 10000;
	private String ownerName;
	private String vehicleType;
	private final String registrationNumber;

	//constructor
	Vehicle(String ownerName, String vehicleType, String registrationNumber){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}

	//method to upate registration fee
	public static void updateRegistrationFee(int newRegistrationFee){
		registrationFee = newRegistrationFee;
	}

	//method to display details
	public void display(){
		if(this instanceof Vehicle){
			System.out.println("Object is an instance of the Vehicle class");
			System.out.println("Owner Name: " + ownerName);
			System.out.println("Vehicle Type: " + vehicleType);
			System.out.println("Registration Number: " + registrationNumber);
			System.out.println("Registration Fee: " + registrationFee);
		}
		else{
                        System.out.println("Object is not an instance of the Patient Class");
                }
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Vehicle v1 = new Vehicle("Muskan", "Bike", "UP85C8001");
		Vehicle v2 = new Vehicle("Shreya", "Bike", "UP85C8002");

		v1.display();
		System.out.println();
		v2.display();
		System.out.println();

		System.out.println("Enter the new Registration Fee: ");
		int newRegistrationFee = sc.nextInt();
		updateRegistrationFee(newRegistrationFee);
		System.out.println();

		System.out.println("Details after Updating Registration Fee");
		v1.display();
		v2.display();
	}
}
