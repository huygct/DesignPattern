package com.tma.prototype;

/**
 * Created by thuynghi on 10/31/2014.
 */
public class Rectangle extends Shape {

    public Rectangle () {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
