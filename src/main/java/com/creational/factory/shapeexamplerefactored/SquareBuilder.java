package com.creational.factory.shapeexamplerefactored;

public class SquareBuilder extends ShapeFactory {

    @Override
    public Shape buildShape() {
        return new Square();
    }
}
