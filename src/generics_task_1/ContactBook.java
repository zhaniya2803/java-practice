package generics_task_1;

import java.util.ArrayList;
import java.util.List;

public class ContactBook<L extends Contact> extends Contact {
    private final List<L> contacts;
    public ContactBook(String name){
        super(name);
        this.contacts = new ArrayList<>();
    }
    public void addContact(L contact) {
        contacts.add(contact);
    }
    public void printList() {
        for (L contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }
}
