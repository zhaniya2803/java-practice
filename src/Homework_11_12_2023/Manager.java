package Homework_11_12_2023;

public class Manager extends Employee {
    String department;

    public Manager(String name, int salary, String department ) {
        super(name, "Менеджер",  salary);
        this.department = department;
    }


    void displayInfo() {
        super.displayInfo();
        System.out.println(" Отдел: " + department);
    }
}
