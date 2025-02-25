import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.*;
import java.util.Base64;

class RecordData {
     int id;
     String name;
     int age;
     String marks; // Encrypted Marks

    public RecordData() {}

    public RecordData(int id, String name, int age, String marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String[] toCSVRow() {
        return new String[]{String.valueOf(id), name, String.valueOf(age), marks}; // Marks is encrypted
    }

    public static RecordData fromCSVRow(String[] row) {
        return new RecordData(Integer.parseInt(row[0]), row[1], Integer.parseInt(row[2]), row[3]);
    }

    @Override
    public String toString() {
        return "{ ID=" + id + ", Name='" + name + "', Age=" + age + ", Marks=" + marks + " }";
    }
}

public class EncryptDecrypt {
    private static final String SECRET_KEY = "1234567890123456"; // 16-char key for AES

    public static void main(String[] args) {
        String jsonFile = "students.json";
        String csvFile = "records.csv";
        String outputJsonFile = "output.json";

        convertJSONToCSV(jsonFile, csvFile);
        convertCSVToJSON(csvFile, outputJsonFile);
    }

    public static void convertJSONToCSV(String jsonFile, String csvFile) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<RecordData> records = objectMapper.readValue(new File(jsonFile), new TypeReference<List<RecordData>>() {});

            try (CSVWriter writer = new CSVWriter(new FileWriter(csvFile))) {
                writer.writeNext(new String[]{"ID", "Name", "Age", "Marks"}); // Header
                for (RecordData record : records) {
                    record.marks = encrypt(record.marks); // Encrypt Marks
                    writer.writeNext(record.toCSVRow());
                }
                System.out.println("✅ JSON converted to CSV successfully: " + csvFile);
            }
        } catch (IOException e) {
            System.err.println("❌ Error converting JSON to CSV: " + e.getMessage());
        }
    }

    public static void convertCSVToJSON(String csvFile, String jsonOutput) {
        List<RecordData> records = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> rows = reader.readAll();
            rows.remove(0); // Remove header

            for (String[] row : rows) {
                row[3] = decrypt(row[3]); // Decrypt Marks
                records.add(RecordData.fromCSVRow(row));
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(jsonOutput), records);
            System.out.println("✅ CSV converted to JSON successfully: " + jsonOutput);
        } catch (IOException | CsvException e) {
            System.err.println("❌ Error converting CSV to JSON: " + e.getMessage());
        }
    }

    public static String encrypt(String value) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(value.getBytes()));
        } catch (Exception e) {
            throw new RuntimeException("Encryption failed", e);
        }
    }

    public static String decrypt(String value) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(value)));
        } catch (Exception e) {
            throw new RuntimeException("Decryption failed", e);
        }
    }
}
