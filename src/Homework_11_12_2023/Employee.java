package Homework_11_12_2023;

public class Employee {

    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void displayInfo () {
        System.out.println(" Имя: " + name);
        System.out.println(" Должность: " + position);
        System.out.println(" Зарплата:" + salary);
    }
}

