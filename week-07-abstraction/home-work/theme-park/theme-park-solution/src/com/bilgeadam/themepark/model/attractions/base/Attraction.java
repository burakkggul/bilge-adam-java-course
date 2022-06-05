package com.bilgeadam.themepark.model.attractions.base;

import com.bilgeadam.themepark.interfaces.Reviewed;

public abstract class Attraction implements Reviewed {
    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    private String name;
    private int rating;
    private Integer visitCount = 0;

    public void visitCountInc(){
        this.visitCount++;
    }

    public Integer getVisitCount() {
        return this.visitCount;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getRating(){
        return this.rating;
    }

}
