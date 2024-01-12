package Yrok_05_01_2024;

public class Book {
    String name;
    Status status;


    public Book(String name) {
        this.name = name;
        this.status = Status.AVAILABLE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
