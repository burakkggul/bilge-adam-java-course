package com.bilgeadam;

import com.bilgeadam.themepark.ThemePark;
import com.bilgeadam.themepark.model.attractions.Dodgems;
import com.bilgeadam.themepark.model.attractions.Park;
import com.bilgeadam.themepark.model.attractions.Playground;
import com.bilgeadam.themepark.model.attractions.Rollercoaster;
import com.bilgeadam.themepark.model.attractions.base.Attraction;
import com.bilgeadam.themepark.model.people.Visitor;
import com.bilgeadam.themepark.model.stalls.ChickenWrapStall;
import com.bilgeadam.themepark.model.stalls.FrenchFriesStall;
import com.bilgeadam.themepark.model.stalls.IceCreamStall;
import com.bilgeadam.themepark.model.stalls.base.Stall;
import com.bilgeadam.themepark.model.stalls.enums.ParkingSpot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends Object{

    public static void main(String[] args) {

        // THEME PARK INITIALIZED START

        // Stalls
        List<Stall> stalls = new ArrayList<>();

        ChickenWrapStall chickenWrapStall = new ChickenWrapStall("Burak",3, ParkingSpot.A1);
        stalls.add(chickenWrapStall);

        FrenchFriesStall frenchFriesStall = new FrenchFriesStall("Meriç",2, ParkingSpot.A2);
        stalls.add(frenchFriesStall);

        IceCreamStall iceCreamStall = new IceCreamStall("Burcu",1,ParkingSpot.B2);
        stalls.add(iceCreamStall);

        //Attractions

        Dodgems dodgems = new Dodgems("Dodgems",3);
        Park park = new Park("Park",2);
        Playground playground = new Playground(4);
        Rollercoaster rollercoaster = new Rollercoaster(1);
        List<Attraction> attractions = Arrays.asList(dodgems,park,playground,rollercoaster);
        ThemePark themePark = new ThemePark(attractions,stalls);

        // THEME PARK INITIALIZED END

        Visitor visitor1 = new Visitor(5,230,200);
        Visitor visitor2 = new Visitor(14,120,50);

        themePark.visit(visitor1, dodgems);
        themePark.visit(visitor2, dodgems);

        themePark.visit(visitor1, park);

        // Roller coaster'ın visitor1 için fiyatı nedir?
        System.out.println("Standart fiyat: "+ rollercoaster.defaultPrice() + " Visitor 1 için fiyat: "+rollercoaster.priceFor(visitor1));

        themePark.visit(visitor2, rollercoaster);
        themePark.getAllReviewed();

        System.out.println(dodgems.getVisitCount());
        System.out.println(rollercoaster);
        System.out.println("park "+park);
        System.out.println(themePark.getAllReviewedVisitCount());



        // Visitor'ın hesabından kullanmış olduğu attraction'ın fiyatını kes.
        if(rollercoaster.isAllowedTo(visitor1)){
            System.out.println(themePark.visitPricedAttraction(visitor1,rollercoaster));
        }else {
            System.out.println("visitor 1 bu oyuncağı kullanamaz.");
        }
    }
}
