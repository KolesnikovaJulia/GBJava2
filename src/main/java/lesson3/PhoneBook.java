package lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {
        final PhoneBook contacts = new PhoneBook();
        contacts.add("Ivanov", "123");
        contacts.add("Petrov", "345");
        contacts.add("Sidorov", "567");
        contacts.add("Kruglov", "789");
        contacts.add("Sidorov", "901");
        contacts.add("Wetrov", "012");
        contacts.add("Sidorov", "234");

        System.out.println(contacts.get("Sidorov"));
        System.out.println(contacts.get("Ivanov"));

    }


    private final Map<String, Set<String>> phones;

    public PhoneBook() { phones = new HashMap<>(); }

    public void add(String name, String phone) {
        final Set<String> ph = phones.getOrDefault(name, new HashSet<>());
        ph.add(phone);
        phones.put(name, ph);
    }

    public Set<String> get(String name) {
        return phones.get(name);
    }
}
