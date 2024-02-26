package Yrok_2023_12_08;

public class Dog extends Animal{
    public Dog(String name) {
        super(name, "гав", 4);
    }

    void display (){
        super.display();
        System.out.println("Собака сутулая");
    }
}
