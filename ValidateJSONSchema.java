package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;

public class validateJSONSchema {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // Load JSON schema as InputStream
        InputStream schemaStream = new FileInputStream(new File("schema.json"));

        // Create JsonSchemaFactory instance
        JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance();

        // Load schema using InputStream
        JsonSchema jsonSchema = schemaFactory.getSchema(schemaStream);

        // Load JSON data
        JsonNode jsonData = objectMapper.readTree(new File("data.json"));

        // Validate JSON against schema
        Set<ValidationMessage> errors = jsonSchema.validate(jsonData);

        // Print validation results
        if (errors.isEmpty()) {
            System.out.println("✅ JSON is valid against the schema!");
        } else {
            System.out.println("❌ JSON validation failed! Errors:");
            errors.forEach(error -> System.out.println(error.getMessage()));
        }
    }
}