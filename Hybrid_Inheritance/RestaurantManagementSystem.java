// Superclass Person
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Interface Worker
interface Worker {
    void performDuties();
}

// Chef subclass implementing Worker
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes.");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
    }
}

// Waiter subclass implementing Worker
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println(name + " is serving customers at " + tablesAssigned + " tables.");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter, Tables Assigned: " + tablesAssigned);
    }
}

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Sanjeev", 101, "Indian");
        Waiter waiter = new Waiter("Mukesh", 201, 5);

        chef.displayInfo();
        chef.performDuties();
        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
