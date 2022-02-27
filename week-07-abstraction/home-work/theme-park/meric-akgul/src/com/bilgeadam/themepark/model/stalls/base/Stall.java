package com.bilgeadam.themepark.model.stalls.base;

import com.bilgeadam.themepark.interfaces.Reviewed;
import com.bilgeadam.themepark.model.stalls.enums.ParkingSpot;

public abstract class Stall implements Reviewed {
    private String name;
    private String ownerName;
    private int rating;
    private ParkingSpot parkingSpot;

    public Stall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.rating = rating;
        this.parkingSpot = parkingSpot;
    }

    public Integer getVisitCount() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getRating() {
        return this.rating;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }
}
