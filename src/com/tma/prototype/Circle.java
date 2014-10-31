package com.tma.prototype;

/**
 * Created by thuynghi on 10/31/2014.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}