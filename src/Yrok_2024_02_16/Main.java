package Yrok_2024_02_16;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Swan swan = new Swan();

        eagle.fly();
        eagle.land();
        eagle.hunt();
        eagle.soarHigh();

        swan.fly();
        swan.land();
        swan.startSwimming();
        swan.stopSwimming();
        swan.gracefulSwim();
    }
}
