package com.bilgeadam.themepark.model.stalls;

import com.bilgeadam.themepark.model.stalls.base.Stall;
import com.bilgeadam.themepark.model.stalls.enums.ParkingSpot;

public class IceCreamStall extends Stall {
    public IceCreamStall(String ownerName, int rating, ParkingSpot parkingSpot){
        super("IceCream",ownerName,rating,parkingSpot);
    }
}
