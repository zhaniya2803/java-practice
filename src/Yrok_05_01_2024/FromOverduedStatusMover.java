package Yrok_05_01_2024;

public class FromOverduedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (requestedStatus == Status.OVERDUED) {
            switch (requestedStatus) {
                case ARCHIVED, AVAILABLE -> {
                    System.out.println("Moving status ARCHIVED");
                    book.setStatus(requestedStatus);
                }
                default ->
                        System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
            }
        }else {
            System.out.println("Eror");
        }
    }
}
