package Book;

public class Book {
    String title;
    String author;
    int id;

    void display () {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("ID: " + id);
    }
}
