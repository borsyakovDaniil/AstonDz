package collectionDZ2;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {

    List<PhoneDirectory> books = new ArrayList<>();

    public String surname;
    public String phoneNumber;

    public PhoneDirectory(String surname, String phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public void get(String surname) {
        for (PhoneDirectory entry : books) {
            if (entry.surname.equalsIgnoreCase(surname)) {
                System.out.println(entry.surname + " " + entry.phoneNumber);
            }
        }
    }

    public PhoneDirectory() {
    }

    public void add(String surname, String phoneNumber) {
       books.add(new PhoneDirectory(surname,phoneNumber));

    }

    public static void main(String[] args) {
        PhoneDirectory myBook = new PhoneDirectory();

        myBook.add("Иванов", "+7-988-333-33-33");
        myBook.add("Григорьев", "+7-988-444-44-44");
        myBook.add("Борисов", "+7-918-111-22-11");
        myBook.add("Иванов", "+7-999-888-11-11");

        myBook.get("Иванов");
    }
}
