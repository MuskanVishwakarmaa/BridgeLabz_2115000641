package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class ConvertListToJson {
    public static void main(String[] args) {
        try {
            // Create a list of Person objects
            List<Person> people = Arrays.asList(
                    new Person("Abhishek", 21),
                    new Person("Priyanshu", 22),
                    new Person("Sagar", 20)
            );

            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Convert List to JSON Array
            String jsonArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(people);

            // Print JSON Output
            System.out.println("JSON Array:\n" + jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
