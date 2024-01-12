package Yrok_05_01_2024;

public class FromAvailableStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (requestedStatus == Status.AVAILABLE) {
            switch (requestedStatus) {
                case ARCHIVED, BORROWED -> {
                    System.out.println("Moving status ARCHIVED");
                    book.setStatus(requestedStatus);
                }
                default ->
                        System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
            }
        } else {
            System.out.println("Eror");
        }
    }
}
