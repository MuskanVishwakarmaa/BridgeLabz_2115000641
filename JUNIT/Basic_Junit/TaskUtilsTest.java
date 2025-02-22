import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

class TaskUtilsTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Fail if it takes longer than 2 seconds
    void testLongRunningTaskTimeout() {
        TaskUtils.longRunningTask(); // This method sleeps for 3 seconds
    }
}
