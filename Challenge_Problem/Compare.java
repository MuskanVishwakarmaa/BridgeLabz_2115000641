
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Compare {
    public static void main(String[] args) {
        compareStringBuilders();
        compareFileReaders("Demo.txt");
    }

    private static void compareStringBuilders() {
        String testString = "hello";
        int iterations = 1_000_000;
       
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(testString);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");
       
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(testString);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void compareFileReaders(String filePath) {
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
           
            long startTime = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            long endTime = System.nanoTime();
            System.out.println("FileReader word count: " + wordCount + ", time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {
           
            long startTime = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            long endTime = System.nanoTime();
            System.out.println("InputStreamReader word count: " + wordCount + ", time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.err.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
    }
}

