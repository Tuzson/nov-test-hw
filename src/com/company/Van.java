package com.company;

public class Van extends Car{

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public int getNrOfSeats() {
        return 0;
    }

    @Override
    public int getBootCapacity() {
        return bootCapacity;
    }

    @Override
    public int calcPrice(int age) {
        return 0;
    }
}

