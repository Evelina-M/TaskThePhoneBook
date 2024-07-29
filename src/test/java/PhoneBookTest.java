import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
//        assertEquals(0, phoneBook.add("John Doe", "555-1211"));
        assertEquals(1, phoneBook.add("Jane Doe", "555-1213"));
        assertEquals(1, phoneBook.add("Jane Doe", "555-1212"));
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "555-1212");
        assertEquals("John Doe", phoneBook.findByNumber("555-1212"));
        assertNull(phoneBook.findByNumber("555-1213"));
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "555-1212");
        assertEquals("555-1212", phoneBook.findByName("John Doe"));
        assertNull(phoneBook.findByName("Jane Doe"));
    }
}
