//base class
class Employee{
    String name;
    int id;
    double salary;

    //Constructor
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Method to display employee details
    public void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

//Subclass: Manager
class Manager extends Employee{
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Role: Manager");
        System.out.println();
    }
}

//Subclass: Developer
class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Role: Developer");
        System.out.println();
    }
}

//Subclass: Intern
class Intern extends Employee{
    int duration;

    public Intern(String name, int id, double salary, int duration){
        super(name, id, salary);
        this.duration = duration;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
        System.out.println("Role: Intern");
        System.out.println();
    }
}

//Main class
public class EmployeeManagementSystem{
    public static void main(String[] args){
		
        // Creating objects
        Employee manager = new Manager("Muskan", 101, 85000, 6);
        Employee developer = new Developer("Rashmi", 102, 50000, "Java");
        Employee intern = new Intern("Priya", 103, 15000, 3);

        //Displaying employee details
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
