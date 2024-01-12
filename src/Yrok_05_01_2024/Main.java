package Yrok_05_01_2024;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("English");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());

        fromAvailableStatusMover = new FromArchievedStatusMover();
        fromAvailableStatusMover.moveToStatus(book,Status.ARCHIVED);
        System.out.println(book.getStatus());
    }

}
