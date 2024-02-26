package Yrok_2024_02_16;

public class Duck implements Flyable, Waterflowl{
    @Override
    public void fly() {
        System.out.println("Лечу над камышами!");
    }

    @Override
    public void land() {
    }

    @Override
    public void swim() {
        System.out.println("Плаваю в пруду!");
    }
}
