package Yrok_2024_02_16;

public class Seagull implements Flyable, Waterflowl, Hunter{
    @Override
    public void fly() {
        System.out.println("Парю над морем!");
    }

    @Override
    public void land() {
    }

    @Override
    public void swim() {
        System.out.println("Качаюсь на волнах!");
    }

    @Override
    public void hunt() {
        System.out.println("Ловлю рыбку!");
    }
}
