//Superclass: Vehicle
class Vehicle{
    int maxSpeed;
    String fuelType;

    //Constructor
    public Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //Method to display vehicle details
    public void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

//Subclass: Car
class Car extends Vehicle{
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Type: Car");
        System.out.println();
    }
}

//Subclass: Truck
class Truck extends Vehicle{
    double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Type: Truck");
        System.out.println();
    }
}

//Subclass: Motorcycle
class Motorcycle extends Vehicle{
    boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar){
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Type: Motorcycle");
        System.out.println();
    }
}

//Main class
class VehicleAndTransportSystem{
    public static void main(String[] args){

        //Creating objects
        Vehicle vehicle1 = new Car(180, "Petrol", 5);
        Vehicle vehicle2 = new Truck(120, "Diesel", 15.0);
        Vehicle vehicle3 = new Motorcycle(200, "Petrol", false);
        
		//displaying details
		vehicle1.displayInfo();
		vehicle2.displayInfo();
		vehicle3.displayInfo();
    }
}
