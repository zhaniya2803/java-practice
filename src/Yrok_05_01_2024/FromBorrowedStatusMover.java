package Yrok_05_01_2024;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (requestedStatus == Status.BORROWED) {
            switch (requestedStatus) {
                case ARCHIVED, AVAILABLE, OVERDUED -> {
                    System.out.println("Moving status ARCHIVED");
                    book.setStatus(requestedStatus);
                }
            }
        }
    }
}
