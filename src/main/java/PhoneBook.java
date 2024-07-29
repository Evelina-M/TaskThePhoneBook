import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, number);
            return contacts.size();
        } else {
            return contacts.size();
        }
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> contact : contacts.entrySet()) {
            if (contact.getValue().equals(number)) {
                return contact.getKey();
            }
        }
        return null;
    }
}
