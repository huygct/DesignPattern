package com.tma.Decorator;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder(decoratedShape);
    }
    
    private void setBlueBorder(Shape decoratedShape) {
        System.out.println("Border Color: Blue");
    }
}
