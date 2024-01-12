package Yrok_08_01_2024;

import java.util.Scanner;

public class Garage {
    Vehicle [] vehicles;

    public Garage(){
        this.vehicles = new Vehicle[5];
    }


    public void add (Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                return;
            }
        }
    }

    public void remove (Vehicle vehicle) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null && vehicles[i].equals(vehicle)) {
              vehicles[i] = null;
              return;
            }
        }
    }

}

