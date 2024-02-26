package Yrok_2024_02_05;

public class Bike extends Transport{
    public Bike(String name, int numberOfWheels) {
        super(name, numberOfWheels, VehicleType.BIKE);
    }

    @Override
    public void gas() {
        System.out.println("Велосипед поехал");
    }

    @Override
    public void breakStop() {
        System.out.println("Велосипед остоновился");

    }
}
