package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class FilterJson {
    public static void main(String[] args) {
        try {
            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file into List of Person objects
            List<Person> people = objectMapper.readValue(new File("people.json"), new TypeReference<List<Person>>() {});

            // Filter records where age > 25
            List<Person> filteredPeople = people.stream()
                    .filter(person -> person.getAge() > 25)
                    .collect(Collectors.toList());

            // Print filtered results
            System.out.println("Filtered People (age > 25):");
            filteredPeople.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
