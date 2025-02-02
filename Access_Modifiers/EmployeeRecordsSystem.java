class Employee{
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " +employeeID);
        System.out.println("Department: " +department);
        System.out.println("Salary: " +salary);
    }
}

class Manager extends Employee{
    public Manager(int employeeID, String department, double salary){
        super(employeeID, department, salary);
    }

    public void displayManagerDetails(){
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecordsSystem{
    public static void main(String[] args){
        Employee employee1 = new Employee(101, "IT", 50000);
        employee1.displayEmployeeDetails();

        employee1.modifySalary(55000);
        System.out.println("\nAfter updating salary:");
        employee1.displayEmployeeDetails();

        Manager manager1 = new Manager(102, "HR", 75000);
        manager1.displayManagerDetails();
    }
}
