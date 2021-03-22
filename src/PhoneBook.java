import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> storage;

    public PhoneBook() {
        storage = new HashMap<>();
    }

    public void add(String abonent, String phoneNumber) {
        if (!storage.containsKey(abonent)) {
            storage.put(abonent, new HashSet<>());
        }
        storage.get(abonent).add(phoneNumber);
    }

    public String get(String abonent) {
        if (storage.containsKey(abonent)) {
            return storage.get(abonent).toString();
        } else {
            return "Не обнаружен";
        }
    }

}
