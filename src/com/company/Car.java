package com.company;

public class Car {
    private String driver;
    private int speed;

    void increaseSpeed() {
        System.out.println("I want to increase speed");
    }

    public Car(String driver, int speed) {
        setDriver(driver);
        setSpeed(speed);
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void goToFuelCenter() {
        System.out.println("We need fuel!");
    }

    @Override
    public String toString() {
        return driver+" is moving car with " +speed+"km/h.";

    }
}