package com.tma.prototype;

/**
 * Created by thuynghi on 10/31/2014.
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape : " +cloneShape.getType());

        cloneShape = ShapeCache.getShape("2");
        System.out.println("Shape : " +cloneShape.getType());

        // add new
        cloneShape = ShapeCache.getShape("3");
        System.out.println("Shape : " +cloneShape.getType());
    }
}
