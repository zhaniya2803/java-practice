package Yrok_2024_02_05;

public abstract class Transport {
    private String name;
    private int numberOfWheels;
    private VehicleType vehicleType;

    public Transport(String name, int numberOfWheels, VehicleType vehicleType) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.vehicleType = vehicleType;
    }

    public abstract void gas();

    public abstract void breakStop();

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


}


