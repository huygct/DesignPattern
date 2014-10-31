package com.tma.singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        
        //Get the Only object available
        SingleObject object = SingleObject.getInstance();
        
        //Show the message
        object.showMessage();
    }

}
