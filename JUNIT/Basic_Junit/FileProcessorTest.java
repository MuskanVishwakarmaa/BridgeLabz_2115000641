import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.*;

class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE)); // Ensure a clean test environment
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        FileProcessor.writeToFile(TEST_FILE, content);

        String readContent = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "File content should match written content");
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Some Content");
        assertTrue(Files.exists(Path.of(TEST_FILE)), "File should exist after writing");
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE)); // Clean up after tests
    }
}
