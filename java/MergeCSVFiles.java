import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.*;

class Person {
    private String id;
    private String name;
    private String age;
    private String marks;
    private String grade;

    public Person(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = "N/A"; // Default value if marks are missing
        this.grade = "N/A"; // Default value if grade is missing
    }

    public void addMarksAndGrade(String marks, String grade) {
        this.marks = marks;
        this.grade = grade;
    }

    public String[] toArray() {
        return new String[]{id, name, age, marks, grade};
    }
}

public class MergeCSVFiles {
    public static void main(String[] args) {
        String file1 = "src/main/resources/students1.csv"; // ID, Name, Age
        String file2 = "src/main/resources/students2.csv"; // ID, Marks, Grade
        String outputFile = "src/main/resources/merged_students.csv"; // Output file

        Map<String, Person> personMap = new HashMap<>();

        try (CSVReader reader1 = new CSVReader(new FileReader(file1))) {
            List<String[]> records1 = reader1.readAll();
            records1.remove(0); // Remove header

            for (String[] row : records1) {
                if (row.length < 3) continue;
                personMap.put(row[0], new Person(row[0], row[1], row[2]));
            }
        } catch (IOException | CsvException e) {
            System.err.println("Error reading file 1: " + e.getMessage());
        }

        try (CSVReader reader2 = new CSVReader(new FileReader(file2))) {
            List<String[]> records2 = reader2.readAll();
            records2.remove(0); // Remove header

            for (String[] row : records2) {
                if (row.length < 3) continue;
                if (personMap.containsKey(row[0])) {
                    personMap.get(row[0]).addMarksAndGrade(row[1], row[2]);
                }
            }
        } catch (IOException | CsvException e) {
            System.err.println("Error reading file 2: " + e.getMessage());
        }

        try (CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"}); // Header

            for (Person person : personMap.values()) {
                writer.writeNext(person.toArray());
            }
            System.out.println("Merged CSV file created successfully: " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing merged file: " + e.getMessage());
        }
    }
}