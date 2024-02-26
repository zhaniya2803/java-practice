package Yrok_2024_02_05;

public class Car extends Transport{
    public Car(String name, int numberOfWheels) {
        super(name, numberOfWheels, VehicleType.CAR);
    }

    @Override
    public void gas() {
        System.out.println("Машина поехала");
    }

    @Override
    public void breakStop() {
        System.out.println("Машина остановилась");
    }
}
