package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeJson {
    public static void main(String[] args) {
        try {
            // Create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            File file1 = new File("data1.json");
            File file2 = new File("data2.json");

            JsonNode node1 = objectMapper.readTree(file1);
            JsonNode node2 = objectMapper.readTree(file2);


            // Merge node2 into node1
            ObjectNode mergedNode = ((ObjectNode) node1).setAll((ObjectNode) node2);

            // Print merged JSON
            System.out.println("Merged JSON: " + objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedNode));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

