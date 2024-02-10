package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 6);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.checkVehicle(car);
        System.out.println();
        serviceStation.checkVehicle(truck);
        System.out.println();
        serviceStation.checkVehicle(bicycle);
        System.out.println();
        serviceStation.info(bicycle);
    }
}