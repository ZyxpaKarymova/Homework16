package org.example;

public class ServiceStation implements ServiceStationInterface{

    public void check(Bicycle bicycle) {
        checkVehicle(bicycle);
    }

    public void check(Car car) {
        checkVehicle(car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        checkVehicle(truck);
        truck.checkEngine();
        truck.checkTrailer();

    }

    private void checkVehicle(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }


}
