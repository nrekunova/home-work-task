package com.hillel.lecture_10.space;

public abstract class AbstractPlanet {
    protected int massa;
    protected int satelliteNums;
    protected String name;

//    public AbstractPlanet(int massa, int satelliteNums, String name) {
//        this.massa = massa;
//        this.satelliteNums = satelliteNums;
//        this.name = name;
//    }

    public int getMassa() {
        return massa;
    }

    public int getSatelliteNums() {
        return satelliteNums;
    }

    public String getName() {
        return name;
    }

    public abstract void move();

    public boolean hasSatellites(){
        System.out.println("AbstractPlanet call hasSatellites");
        return satelliteNums > 0;
    }

}
