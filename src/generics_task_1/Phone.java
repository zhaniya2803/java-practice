package generics_task_1;

public class Phone extends ContactBook{
    private final String phoneNumber;

    public Phone(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Метод sendMessage переопределяет метод базового класса

    public void sendMessage() {
        System.out.println("Звоним другу по номеру " + phoneNumber + " и зовем на кофе.");
    }

    public void print() {
        System.out.println("Номер телефона: " + getPhoneNumber());
    }
}
