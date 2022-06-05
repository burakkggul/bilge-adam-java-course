package com.bilgeadam.themepark.model.stalls;

import com.bilgeadam.themepark.model.stalls.base.Stall;
import com.bilgeadam.themepark.model.stalls.enums.ParkingSpot;

public class FrenchFriesStall extends Stall {

    public FrenchFriesStall(String ownerName, int rating, ParkingSpot parkingSpot) {
        super("French Fries", ownerName, rating, parkingSpot);
    }
}
