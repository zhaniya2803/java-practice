package Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Cтеклянный трон";
        book.author = "Сара Дж Маас";
        book.id = 1;

        book.display();

        Student student = new Student();
        student.name = "Жания";
        student.id = 123456;
        student.display();
    }
}
