package com.javacourse.homework.task16;

public class Car {

    Engine engine;
    Transmission transmission;
    Ignition ignition;
    SteeringWheel steeringWheel;
    boolean brakeEnable; //отображает текущее состояние

    public Car(Engine engine, Transmission transmission, Ignition ignition, SteeringWheel steeringWheel) {
        this.engine = engine;
        this.transmission = transmission;
        this.ignition = ignition;
        this.steeringWheel = steeringWheel;
    }

    public void start() {
        System.out.println("Завожу машину");
        ignition.turnOn();
    }

    public void putOnBrake() {
        System.out.println("Нажимаю тормоз");
        brakeEnable = true;
    }

    public void turnOnGear(String gear) {
        if (brakeEnable) {
            transmission.turnOnGear(gear);
        } else {
            putOnBrake();
            transmission.turnOnGear(gear);
        }
    }

    public void releaseBrake() {
        System.out.println("Отпускаю тормоз");
    }

    public void turnRight() {
        if (ignition.ignitionEnabled) {
            steeringWheel.turnRight();
        } else {
            ignition.turnOn();
            steeringWheel.turnRight();
        }
    }

    public void turnLeft() {
        if (ignition.ignitionEnabled) {
            steeringWheel.turnLeft();
        } else {
            ignition.turnOn();
            steeringWheel.turnLeft();
        }
    }


    public void stop() {
        if ("P".equals(transmission.gear)) {
            ignition.turnOff();
        } else {
            transmission.turnOnGear("P");
            System.out.println("Заглушить машину");
            ignition.turnOff();
        }
    }
}
