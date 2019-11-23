package com.hillel.lecture_10.space;

public class SpaceMain {
    public static void main(String[] args) {
        GasGigant jupiter = new GasGigant("Jupiter",10000,79,false);
        jupiter.move();
        System.out.println(jupiter.getName() + " has Satellites = " + jupiter.hasSatellites());
        System.out.println(jupiter.getName() + " has rings = " + jupiter.hasRings());

        GasGigant saturn = new GasGigant("Saturn",10000,80,true);
        saturn.move();
        System.out.println(saturn.getName() + " has Satellites = " + saturn.hasSatellites());
        System.out.println(saturn.getName() + " has rings = " + saturn.hasRings());

        EarthTypePlanet earth = new EarthTypePlanet("Earth",1000,1);
        earth.move();
        System.out.println(earth.getName() + " has Satellites = " + earth.hasSatellites());


    }
}
