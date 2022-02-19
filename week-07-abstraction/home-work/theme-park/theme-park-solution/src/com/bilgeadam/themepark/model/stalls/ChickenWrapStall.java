package com.bilgeadam.themepark.model.stalls;

import com.bilgeadam.themepark.model.stalls.base.Stall;
import com.bilgeadam.themepark.model.stalls.enums.ParkingSpot;

public class ChickenWrapStall extends Stall {
    public ChickenWrapStall(String ownerName, int rating, ParkingSpot parkingSpot){
        super("Chicken Wrap", ownerName, rating, parkingSpot);
    }
}
