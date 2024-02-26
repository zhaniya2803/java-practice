package Yrok_2024_01_05;

public class FromArchievedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (requestedStatus == Status.ARCHIVED) {
            switch (requestedStatus) {
                case AVAILABLE -> {
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
