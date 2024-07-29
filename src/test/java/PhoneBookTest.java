import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(0, phoneBook.add("John Doe", "555-1212"));
    }
}
