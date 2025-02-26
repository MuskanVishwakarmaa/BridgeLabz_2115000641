package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class JsonFilter {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("people.json"));

        System.out.println("Users older than 25:");
        for (JsonNode node : rootNode) {
            int age = node.get("age").asInt();
            if (age > 25) {
                System.out.println(node);
            }
        }
    }
}
