package com.hillel.lecture_10.space;

public class GasGigant extends AbstractPlanet {
    private boolean hasRing;

    public GasGigant(String name, int massa, int satelliteNums, boolean hasRing) {
        this.name = name;
        this.massa = massa;
        this.satelliteNums = satelliteNums;
        this.hasRing = hasRing;
    }

    @Override
    public void move() {
        System.out.println("GasGigant - " + getName() + " move");
    }
    public boolean hasRings(){
        return hasRing;
    }
}
