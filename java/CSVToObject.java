import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String id;
    private String name;
    private int age;
    private int marks;

    public Student(String id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Marks=" + marks +
                '}';
    }
}

public class CSVToObject {
    public static void main(String[] args) {
        String filePath = "src/main/resources/students.csv";
        List<Student> studentList = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> records = reader.readAll();
            records.remove(0);

            for (String[] row : records) {
                if (row.length < 4) {
                    System.err.println("Skipping invalid row (not enough columns): " + String.join(",", row));
                    continue;
                }

                String id = row[0];
                String name = row[1];
                int age = Integer.parseInt(row[2]);
                int marks = Integer.parseInt(row[3]);

                Student student = new Student(id, name, age, marks);
                studentList.add(student);
            }

            // Print all students
            for (Student student : studentList) {
                System.out.println(student);
            }

        } catch (IOException | CsvException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in CSV file: " + e.getMessage());
        }
    }
}
