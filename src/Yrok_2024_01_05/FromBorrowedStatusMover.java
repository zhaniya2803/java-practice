package Yrok_2024_01_05;

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
