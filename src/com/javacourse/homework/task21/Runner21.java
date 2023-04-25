package com.javacourse.homework.task21;

public class Runner21 {
    public static void main(String[] args) {
        FlyingObject boeing737 = new Boeing737("Boeing-737", "USA", "1950", 100);
        FlyingObject mi8 = new Mi8("Mi-8", "Poland", "1947");
        FlyingObject scanEagle = new ScanEagle("ScanEagle", "Russia", "2000");
        FlyingObject airbus330 = new Airbus330("Airbus330", "Russia", "1965", 58);
        print(boeing737);
        print(airbus330);
        print(mi8);
        print(scanEagle);

    }
       // boeing737.releaseChassis();
//        boeing737.info();
//        mi8.verticalTakeOff();
//        mi8.info();
//        scanEagle.reconnaissance();
//        scanEagle.info();

        //System.out.println(boeing737.getName() + " " + boeing737.getCountry() + " " +  boeing737.getYear() + " " + boeing737.getWingspan());
    public static void print(FlyingObject flyingObject) {
        if (flyingObject instanceof Aircraft) {
            Aircraft boeing737 = (Aircraft) flyingObject;
            boeing737.releaseChassis();
        } else if (flyingObject instanceof Helicopter) {
            Helicopter helicopter = (Helicopter) flyingObject;
            helicopter.verticalTakeOff();
        } else if (flyingObject instanceof Drone) {
            Drone drone = (Drone) flyingObject;
            drone.reconnaissance();
        }
    }
}
