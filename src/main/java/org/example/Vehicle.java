package org.example;

public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Vehicle(){
        this.numberOfWheels = 4;
        this.color = "Black";
        this.engineSize = 1000;
        this.fuelType = "Regular";
    }
}
