package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class Employee {
    public int id;
    public String name;
    public String department;
    public double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class DatabaseToJSON {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees_db";
        String user = "root";
        String password = "password";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            List<Employee> employees = new ArrayList<>();
            while (rs.next()) {
                employees.add(new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                ));
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("employees.json"), employees);

            System.out.println("JSON report generated: employees.json");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}