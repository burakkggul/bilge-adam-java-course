package com.bilgeadam;

import com.bilgeadam.themepark.ThemePark;
import com.bilgeadam.themepark.model.attractions.Dodgems;
import com.bilgeadam.themepark.model.attractions.Park;
import com.bilgeadam.themepark.model.attractions.Playground;
import com.bilgeadam.themepark.model.attractions.RollerCoaster;
import com.bilgeadam.themepark.model.attractions.base.Attraction;
import com.bilgeadam.themepark.model.stalls.ChickenWrapStall;
import com.bilgeadam.themepark.model.stalls.FrenchFriesStall;
import com.bilgeadam.themepark.model.stalls.IceCreamStall;
import com.bilgeadam.themepark.model.stalls.base.Stall;
import com.bilgeadam.themepark.model.stalls.enums.ParkingSpot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Stalls
        List<Stall> stalls = new ArrayList<>();

        ChickenWrapStall chickenWrapStall = new ChickenWrapStall("Burak",3, ParkingSpot.A1);
        stalls.add(chickenWrapStall);

        FrenchFriesStall frenchFriesStall = new FrenchFriesStall("Meriç",2, ParkingSpot.A2);
        stalls.add(frenchFriesStall);

        IceCreamStall iceCreamStall = new IceCreamStall("Burcu",1,ParkingSpot.B2);
        stalls.add(iceCreamStall);

        // Attractions
        Dodgems dodgems = new Dodgems("Dodgems",3);
        Park park = new Park("Park",2);
        Playground playground = new Playground(4);
        RollerCoaster rollercoaster = new RollerCoaster(1);
        List<Attraction> attractions = Arrays.asList(dodgems,park,playground,rollercoaster);

        ThemePark themepark = new ThemePark(attractions, stalls);
        System.out.println();
    }
}
