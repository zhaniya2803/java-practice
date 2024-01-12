package Homework_11_12_2023;

public class Developer extends Employee{
    String mainProgrammingLanguage;

    public Developer(String name,  int salary, String mainProgrammingLanguage) {
        super(name, "Разработчик", salary);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    void displayInfo () {
        super.displayInfo();
        System.out.println(" Основной язык программирования" + mainProgrammingLanguage);
    }
}
