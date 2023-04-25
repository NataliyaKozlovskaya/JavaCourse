package com.javacourse.homework.task16;

public class Runner16 {
    public static void main(String[] args) {

        Engine engine = new Engine();
        Transmission transmission = new Transmission();
        Ignition ignition = new Ignition();
        SteeringWheel steeringWheel = new SteeringWheel();
        Car car = new Car(engine, transmission, ignition, steeringWheel);

        car.start();
        car.putOnBrake();
        car.turnOnGear("D");
        car.releaseBrake();
        car.turnRight();
        car.turnLeft();
        car.putOnBrake();
        car.turnOnGear("P");
        car.stop();

    }
}
