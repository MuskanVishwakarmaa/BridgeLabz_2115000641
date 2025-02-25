import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.*;

class RecordEntry {
    private int id;
    private String name;
    private int age;
    private int marks;

    public RecordEntry() {}

    public RecordEntry(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String[] toCSVRow() {
        return new String[]{String.valueOf(id), name, String.valueOf(age), String.valueOf(marks)};
    }

    public static RecordEntry fromCSVRow(String[] row) {
        return new RecordEntry(Integer.parseInt(row[0]), row[1], Integer.parseInt(row[2]), Integer.parseInt(row[3]));
    }

    @Override
    public String toString() {
        return "RecordEntry { ID=" + id + ", Name='" + name + "', Age=" + age + ", Marks=" + marks + " }";
    }
}

public class JSONCSVConverter {
    public static void main(String[] args) {
        String jsonFile = "students.json";
        String csvFile = "students.csv";
        String outputJsonFile = "output.json";

        convertJSONToCSV(jsonFile, csvFile);
        convertCSVToJSON(csvFile, outputJsonFile);
    }

    public static void convertJSONToCSV(String jsonFile, String csvFile) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<RecordEntry> records = objectMapper.readValue(new File(jsonFile), new TypeReference<List<RecordEntry>>() {});

            try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
                writer.writeNext(new String[]{"ID", "Name", "Age", "Marks"}); // Header
                for (RecordEntry record : records) {
                    writer.writeNext(record.toCSVRow());
                }
                System.out.println("✅ JSON converted to CSV successfully: " + csvFile);
            }
        } catch (IOException e) {
            System.err.println("❌ Error converting JSON to CSV: " + e.getMessage());
        }
    }

    public static void convertCSVToJSON(String csvFile, String jsonOutput) {
        List<RecordEntry> records = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> rows;
            try {
                rows = reader.readAll();
            } catch (CsvException e) {
                System.err.println("❌ Error reading CSV file: " + e.getMessage());
                return;
            }

            rows.remove(0); // Remove header
            for (String[] row : rows) {
                records.add(RecordEntry.fromCSVRow(row));
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(jsonOutput), records);
            System.out.println("✅ CSV converted to JSON successfully: " + jsonOutput);
        } catch (IOException e) {
            System.err.println("❌ Error converting CSV to JSON: " + e.getMessage());
        }
    }
}
