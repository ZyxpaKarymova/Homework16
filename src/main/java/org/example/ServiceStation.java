package org.example;

public class ServiceStation {
    public void checkVehicle(ServiceStationInterface serviceStationInterface){
        serviceStationInterface.check();

    }

    public void info(ServiceStationInterface serviceStationInterface){
        serviceStationInterface.info();
    }
}
