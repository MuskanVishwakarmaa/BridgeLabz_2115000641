package org.example;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CSVToJSON {
    public static void main(String[] args) throws IOException {
        File csvFile = new File("content.csv"); // Make sure the file exists

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        // Use correct type for MappingIterator
        MappingIterator<Map<String, String>> it = csvMapper.readerFor(Map.class)
                .with(schema)
                .readValues(csvFile);

        List<Map<String, String>> csvData = it.readAll();  // ✅ FIX: Correct Type

        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(csvData);

        System.out.println(json);
        jsonMapper.writeValue(new File("data.json"), csvData);
    }
}
