package com.tma.prototype;

/**
 * Created by thuynghi on 10/31/2014.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");
        System.out.println("Shape : " +cloneShape.getType());
    }
}
