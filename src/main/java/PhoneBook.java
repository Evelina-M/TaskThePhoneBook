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

    public String findByName(String name) {
        return contacts.getOrDefault(name, null);
    }

    public String printAllNames() {
        StringBuilder sb = new StringBuilder();
        for (String name : contacts.keySet()) {
            sb.append(name).append("\n");
        }
        return sb.toString().trim();
    }
}
