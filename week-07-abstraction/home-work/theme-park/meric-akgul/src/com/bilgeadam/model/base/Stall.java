package com.bilgeadam.model.base;

public abstract class Stall {
    private String name;
    private String ownerName;
    private int rating;
    private int parkingSpot;

    public Stall(String name, String ownerName, int rating, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.rating = rating;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getRating() {
        return rating;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }
}
