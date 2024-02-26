package Yrok_2024_01_08;

public class Vehicle {
    String name;
    int numberOfWheels;
    private VehicleType type;

    public Vehicle(String name, int numberOfWheels, VehicleType type) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
