package com.creational.factory.shapeexamplerefactored;

public class CircleBuilder extends ShapeFactory {

    @Override
    public Shape buildShape() {
        return new Circle();
    }
}
