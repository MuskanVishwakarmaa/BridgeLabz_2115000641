import java.util.ArrayList;
import java.util.List;

// Interface for department-related operations
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Abstract class for Employee
abstract class Employee {
    private int empID;
    private String empName;
    private double baseSalary;

    // Constructor for abstract class
    public Employee(int empID, String empName, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method to display the employee details
    public void displayDetails() {
        System.out.println("\n=== Employee Details ===");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empID);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Final Salary: $" + calculateSalary());
    }

    // Getters (Encapsulation)
    public int getEmpID() { return empID; }
    public String getEmpName() { return empName; }
    public double getBaseSalary() { return baseSalary; }

    // Setter with validation
    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }
}

// Full-Time Employee class
class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String department;

    // Constructor for full-time employee
    public FullTimeEmployee(int empID, String empName, double baseSalary, double bonus) {
        super(empID, empName, baseSalary);
        this.bonus = bonus;
    }

    // Implementing calculateSalary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Full-Time Employee, Department: " + department;
    }
}

// Part-Time Employee class
class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private int workHours;
    private String department;

    // Constructor for part-time employee
    public PartTimeEmployee(int empID, String empName, double hourlyRate, int workHours, String department) {
        super(empID, empName, 0); // No base salary for part-time employees
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
        this.department = department;
    }

    // Implementing calculateSalary
    @Override
    public double calculateSalary() {
        return hourlyRate * workHours;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Part-Time Employee, Department: " + department;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String args[]) {
        List<Employee> employees = new ArrayList<>();

        // Adding full-time and part-time employees
        PartTimeEmployee emp1 = new PartTimeEmployee(123, "Muskan", 500, 3, "HR");
        FullTimeEmployee emp2 = new FullTimeEmployee(345, "Rashmi", 10000, 4000);

        emp2.assignDepartment("IT");

        employees.add(emp1);
        employees.add(emp2);

        // Displaying employee details using polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("-------------------------------------------");
        }
    }
}
