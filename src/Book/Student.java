package Book;

public class Student {
    String name;
    int id;
    Book borrowedBook;

    void display () {
        System.out.println("Имя студента: " + name);
        System.out.println ("Номер студенческого билета: " + id);

    }
}
