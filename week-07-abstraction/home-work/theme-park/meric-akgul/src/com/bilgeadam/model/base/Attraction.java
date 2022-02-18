package com.bilgeadam.model.base;

public abstract class Attraction {
    private String name;
    private int rating;
    private int visitCount = 0;

    public Attraction(String name, int rating, int visitCount) {
        this.name = name;
        this.rating = rating;
        this.visitCount = visitCount;
    }

    public abstract void summary();

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
