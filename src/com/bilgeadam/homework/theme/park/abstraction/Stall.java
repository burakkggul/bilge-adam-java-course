package com.bilgeadam.homework.theme.park.abstraction;

public abstract class Stall {
    private String stallName;
    private String ownerName;
    private int stallRating;
    private String parkingSpot;


    public Stall(String name, String ownerName, int rating, String parkingSpot) {
        this.stallName = name;
        this.ownerName = ownerName;
        this.stallRating = rating;
        this.parkingSpot = parkingSpot;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getStallRating() {
        return stallRating;
    }

    public void setStallRating(int stallRating) {
        this.stallRating = stallRating;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
