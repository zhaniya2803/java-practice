package Yrok_08_01_2024;

import java.util.Scanner;

public class GarageSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = new Garage();

        while (true) {
            System.out.println("""
                    1. Добавить транспорт
                    2. Вывести все транспорты
                    3. Удалить транспорт
                    4. Вывести транспорты определенного типа
                    5. Вывести количество транспортов каждого типа
                    0. Завершить""");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 1) {
                VehicleType[] types = VehicleType.values();
                for (int i = 0; i < types.length; i++) {
                    System.out.println(i + 1 + ". " + types[i]);
                }
                System.out.println("Введите номер типа: ");
                int typeNumber = Integer.parseInt(scanner.nextLine());
                VehicleType type = types[typeNumber - 1];
                switch (type) {
                    case CAR -> {
                        System.out.println("Введите название автомобиля: ");
                        String carName = scanner.nextLine();
                        Car car = new Car(carName);
                        garage.add(car);
                        System.out.println("В гараж добавлен " + type + " c нахванием: " + car.name);
                    }
                    case BIKE -> {
                        System.out.println("Введите название велосипеда: ");
                        String bikeName = scanner.nextLine();
                        Bike bike = new Bike(bikeName);
                        garage.add(bike);
                        System.out.println("В гараж добавлен " + type + " c нахванием: " + bike.name);
                    }
                }
            } else if (command == 2) {
                for (int i = 0; i < garage.vehicles.length; i++) {
                    if (garage.vehicles[i] != null) {
                        System.out.print("Тип:" + garage.vehicles[i].getType());
                        System.out.println();
                        System.out.println("Название: " + garage.vehicles[i].name);
                    }
                }
            } else if (command == 3) {
                for (int i = 0; i < garage.vehicles.length; i++) {
                    if (garage.vehicles[i] != null) {
                        System.out.println(i + 1 + " " + garage.vehicles[i].getType() + " " + garage.vehicles[i].name);
                    }
                }
                System.out.print("Введите название транспорта которого хотите удалить:");
                int numberTransport = Integer.parseInt(scanner.nextLine());
                Vehicle vehicle = garage.vehicles[numberTransport - 1];
                garage.remove(vehicle);
            } else if (command == 4) {
                VehicleType[] types = VehicleType.values();
                for (int i = 0; i < types.length; i++) {
                    System.out.println(i + 1 + ". " + types[i]);
                }
                System.out.println("Введите тип транспорта: ");
                int typeNumber = Integer.parseInt(scanner.nextLine());
                if (typeNumber == 1) {
                    VehicleType type = types[typeNumber - 1];
                    switch (type) {
                        case CAR -> {
                            for (int i = 0; i < garage.vehicles.length; i++) {
                                if (garage.vehicles[i].getType().equals(VehicleType.CAR)) {
                                    System.out.println(garage.vehicles[i].getName());
                                }
                            }
                        }
                        case BIKE -> {
                            for (int i = 0; i < garage.vehicles.length; i++) {
                                if (garage.vehicles[i].getType().equals(VehicleType.BIKE)) {
                                    System.out.println(garage.vehicles[i].getName());
                                }
                            }
                        }
                    }
                }
            } else if (command == 5) {
                int result1 = 0;
                int result2 = 0;
                for (Vehicle vehicle : garage.vehicles) {
                    if (vehicle.getType().equals(VehicleType.CAR)) {
                        result1 += 1;
                    } else if (vehicle.getType().equals(VehicleType.BIKE)) {
                        result2 += 11;
                    }
                }
                System.out.println("Количество машин: " + result1);
                System.out.println("Количество велосипедов: " + result2);

            } else if (command == 0) {
                break;
            } else {
                System.out.println("Eror");
            }
        }
    }
}
