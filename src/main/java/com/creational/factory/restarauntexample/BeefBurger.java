package com.creational.factory.restarauntexample;

public class BeefBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("**************************************************");
        System.out.println("Creating a beef burger buddy!");
        System.out.println("**************************************************");
    }
}
