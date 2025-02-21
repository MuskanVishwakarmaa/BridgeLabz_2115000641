import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerialization {

    // Employee class implements Serializable to enable serialization
    static class Employee implements Serializable {
        private int id;
        private String name;
        private String department;
        private double salary;

        // Constructor
        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        // Getters and setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
        }
    }

    public static void main(String[] args) {
        // Create some employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Muskan", "HR", 50000));
        employees.add(new Employee(2, "Shreya", "IT", 70000));
        employees.add(new Employee(3, "Mansi", "Finance", 60000));

        // Serialize the list of employees to a file
        serializeEmployees(employees, "employees.dat");

        // Deserialize the employees from the file and display
        List<Employee> deserializedEmployees = deserializeEmployees("employees.dat");
        if (deserializedEmployees != null) {
            System.out.println("Deserialized Employees:");
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        }
    }

    // Serialize list of employees
    public static void serializeEmployees(List<Employee> employees, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("Employees have been serialized.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    // Deserialize list of employees
    public static List<Employee> deserializeEmployees(String filename) {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees have been deserialized.");
        } catch (IOException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found during deserialization: " + e.getMessage());
        }
        return employees;
    }
}
