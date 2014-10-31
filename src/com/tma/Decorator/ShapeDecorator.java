package com.tma.Decorator;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratorShape) {
        this.decoratedShape = decoratorShape;
    }
    
    public void draw() {
        decoratedShape.draw();
    }

}
