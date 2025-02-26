package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class MergeJSONFiles {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode file1 = objectMapper.readTree(new File("data.json"));
        JsonNode file2 = objectMapper.readTree(new File("users.json"));

        JsonNode mergedNode = deepMerge(file1, file2);

        objectMapper.writeValue(new File("merged.json"), mergedNode);
        System.out.println("✅ Merged JSON: " + mergedNode);
    }

    public static JsonNode deepMerge(JsonNode mainNode, JsonNode updateNode) {
        if (mainNode.isObject() && updateNode.isObject()) {
            updateNode.fields().forEachRemaining(entry -> {
                String fieldName = entry.getKey();
                JsonNode updateValue = entry.getValue();
                JsonNode mainValue = mainNode.get(fieldName);

                if (mainValue != null && mainValue.isObject()) {
                    // Recursive merge for nested objects
                    ((ObjectNode) mainNode).set(fieldName, deepMerge(mainValue, updateValue));
                } else {
                    // Overwrite or add new field
                    ((ObjectNode) mainNode).set(fieldName, updateValue);
                }
            });
        }
        return mainNode;
    }
}
