package com.javacourse.homework.task16;

public class Ignition {
    boolean ignitionEnabled; //изначально было =false;
    public void turnOn(){
        System.out.println("Включить зажигание");
        ignitionEnabled = true;
    }

    public void turnOff(){
        System.out.println("Выключить зажигание");
        ignitionEnabled = false;
    }
}
