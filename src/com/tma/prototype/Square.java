package com.tma.prototype;

/**
 * Created by thuynghi on 10/31/2014.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
