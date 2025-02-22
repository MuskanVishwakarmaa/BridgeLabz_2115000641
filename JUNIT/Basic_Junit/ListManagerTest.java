import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        ListManager.addElement(list, 10);

        assertEquals(2, list.size());
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);

        ListManager.removeElement(list, 5);
        assertEquals(1, list.size());
        assertFalse(list.contains(5));

        // Removing an element not in the list should not change size
        ListManager.removeElement(list, 20);
        assertEquals(1, list.size());
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, ListManager.getSize(list));

        list.add(1);
        list.add(2);
        assertEquals(2, ListManager.getSize(list));

        list.remove(Integer.valueOf(1));
        assertEquals(1, ListManager.getSize(list));

        assertEquals(0, ListManager.getSize(null)); // Null list case
    }
}
