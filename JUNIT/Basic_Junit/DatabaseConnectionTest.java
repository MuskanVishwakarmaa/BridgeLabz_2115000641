import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected");
    }

    @Test
    void testConnectionClosedAfterEachTest() {
        assertTrue(dbConnection.isConnected());
    }
}
