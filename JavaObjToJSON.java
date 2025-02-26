package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjToJSON {
    public static void main(String[] args) {
        try {
            // Create a Car object
            Car car = new Car("Toyota", "Camry", 2022);

            // Convert to JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(car);

            // Print the JSON output
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
