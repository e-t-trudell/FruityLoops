package com.demo.interfaces;

public interface ACPowerable {
//	member variables. any class that implements this must have these variables.
	Integer voltage = 120;
    Integer frequency = 60;
//  classes must have these methods
    abstract void unPlug();
    abstract boolean checkPluggedIn();
//  default method; method is already implemented so the class using the interface does not need to re-implement  
    public default void hasPower() {
        String message = "The device is ";
        if(!checkPluggedIn()) {
            message += "not ";
        }
        System.out.println(message + "plugged in.");
    }
}
