package org.example;

public abstract class Vehicle implements ServiceStationInterface{
    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    private void updateTyre() {
        for (int i=0;i<wheelsCount;i++) {
            System.out.println("Меняем покрышку");
        }
    }

@Override
    public void check() {
        System.out.println("Обслуживаем: " + modelName);
        updateTyre();
    }

    @Override
    public void info() {
        System.out.println(modelName+" "+ wheelsCount);
    }
}