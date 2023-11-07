package com.creational.factory.carexample;

public class SedanFactory extends CarFactory{

    @Override
    public Car createCar() {
        return new Sedan().assemble();
    }
}
