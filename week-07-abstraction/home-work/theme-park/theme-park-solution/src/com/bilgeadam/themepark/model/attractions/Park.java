package com.bilgeadam.themepark.model.attractions;

import com.bilgeadam.themepark.model.attractions.base.Attraction;

public class Park extends Attraction {
    public Park(String name, int rating){
        super(name,rating);
    }

    @Override
    public String toString() {
        return this.getVisitCount().toString();
    }
}
