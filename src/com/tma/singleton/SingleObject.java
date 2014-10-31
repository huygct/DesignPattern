package com.tma.singleton;

public class SingleObject {
    
    //Create an Object of SingleObject
    private static SingleObject instance = null; //new SingleObject();
    
    //make the contructor private so that this class cannot be
    //instantiated
    private SingleObject() {
        
    }
    
    //Get the only object available
    public static SingleObject getInstance() {
        if(instance == null) {
            return new SingleObject();
        }
        else {
            return instance;
        }
    }
    
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
