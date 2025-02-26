package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class ValidateJson {
    public static void main(String[] args) {
        // JSON input (valid JSON)
        String jsonValid = "{ \"name\": \"Abhishek\", \"email\": \"abhishek@example.com\" }";

        // JSON input (invalid JSON)
        String jsonInvalid = "{ \"name\": \"Sagar\", \"email\": \"sagar@example.com\" "; // Missing closing bracket

        // Validate JSON
        System.out.println("Valid JSON: " + isValidJson(jsonValid));
        System.out.println("Invalid JSON: " + isValidJson(jsonInvalid));
    }

    public static boolean isValidJson(String json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);
            return jsonNode != null;
        } catch (JsonProcessingException e) {
            return false; // Invalid JSON
        }
    }
}

