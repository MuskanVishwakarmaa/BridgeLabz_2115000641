import java.io.*;
import java.util.*;

public class DetectDuplicateCSV {
    public static void main(String[] args) {
        String filePath = "src/main/resources/students_with_duplicates.csv"; // CSV File Path
        Map<String, List<String>> studentMap = new HashMap<>();
        Set<String> duplicateIDs = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] values = line.split(",");
                String id = values[0];

                if (studentMap.containsKey(id)) {
                    duplicateIDs.add(id);
                }
                studentMap.putIfAbsent(id, new ArrayList<>());
                studentMap.get(id).add(line);
            }

            // Print duplicate records
            if (duplicateIDs.isEmpty()) {
                System.out.println("No duplicate records found.");
            } else {
                System.out.println("Duplicate records found:");
                for (String id : duplicateIDs) {
                    for (String record : studentMap.get(id)) {
                        System.out.println(record);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
