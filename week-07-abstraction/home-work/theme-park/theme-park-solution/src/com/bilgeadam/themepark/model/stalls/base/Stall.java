package com.bilgeadam.themepark.model.stalls.base;

import com.bilgeadam.themepark.interfaces.Reviewed;
import com.bilgeadam.themepark.model.stalls.enums.ParkingSpot;

public abstract class Stall implements Reviewed {
    public Stall(String name, String ownerName, int rating, ParkingSpot parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    private String name;
    private String ownerName;
    private int rating;
    private ParkingSpot parkingSpot;

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getVisitCount() {
        return 0;
    }
}
