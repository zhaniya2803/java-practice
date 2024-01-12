package Homework_11_12_2023;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Dima", 15000, "Actana");
        manager.displayInfo();

        System.out.println();

        Developer developer = new Developer("Adam",40000, "Java");
        developer.displayInfo();
    }
}
