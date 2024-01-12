package Yrok_08_12_2023;

public class Dog extends Animal{
    public Dog(String name) {
        super(name, "гав", 4);
    }

    void display (){
        super.display();
        System.out.println("Собака сутулая");
    }
}
