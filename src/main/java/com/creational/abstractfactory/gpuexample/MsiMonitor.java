package com.creational.abstractfactory.gpuexample;

public class MsiMonitor implements Monitor{

    @Override
    public void assemble() {
        System.out.println("Making MSI monitor");
    }
}
