package com.bilgeadam.homework.theme.park.abstraction;

public abstract class Attraction {
    private String attractionName;
    private int attractionRating;
    private int visitCount;

    public Attraction(String name, int rating) {
        this.attractionName = name;
        this.attractionRating = rating;
        this.visitCount = 0;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public int getAttractionRating() {
        return attractionRating;
    }

    public void setAttractionRating(int attractionRating) {
        this.attractionRating = attractionRating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
