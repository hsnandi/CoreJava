package com.polymorphism;

public class Electronics extends Products {
    private boolean battery;
    private boolean wireless;

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Electronics [battery=" + battery + ", wireless=" + wireless + ", brand=" + getBrand() + ", price="
                + getPrice() + "]";
    }
}