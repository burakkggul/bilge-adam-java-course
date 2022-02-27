package com.bilgeadam.themepark.model.attractions.base;

import com.bilgeadam.themepark.interfaces.Reviewed;

public abstract class Attraction implements Reviewed {
    private String name;
    private int rating;
    private Integer visitCount = 0;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void visitCountInc() {
        this.visitCount++;
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public Integer getVisitCount() {
        return this.visitCount;
    }
}
