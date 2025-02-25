import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toCSV() {
        return id + "," + name + "," + department + "," + salary;
    }
}

public class EmployeeCSVReport {
    public static void main(String[] args) {
        String csvFilePath = "src/main/resources/employees_report.csv";

        List<Employee> employees = Arrays.asList(
                new Employee(201, "Aditya", "IT", 75000),
                new Employee(202, "Yash", "HR", 68000),
                new Employee(203, "Anirudh", "Finance", 72000),
                new Employee(204, "Adarsh", "Marketing", 71000),
                new Employee(205, "Rashmi", "Operations", 73000)
        );

        try (FileWriter writer = new FileWriter(csvFilePath)) {
            writer.write("Employee ID,Name,Department,Salary\n");

            for (Employee emp : employees) {
                writer.write(emp.toCSV() + "\n");
            }

            System.out.println("CSV report generated successfully: " + csvFilePath);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
