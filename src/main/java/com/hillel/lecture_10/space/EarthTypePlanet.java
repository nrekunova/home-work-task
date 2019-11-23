package com.hillel.lecture_10.space;

public class EarthTypePlanet extends AbstractPlanet {
    public EarthTypePlanet(String name, int massa, int satelliteNums) {
        this.name = name;
        this.massa = massa;
        this.satelliteNums = satelliteNums;
    }

    @Override
    public void move() {
        System.out.println("Earth type planet - " + getName() + " move");
    }
}
