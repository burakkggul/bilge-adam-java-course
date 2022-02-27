package com.bilgeadam.themepark;
import com.bilgeadam.themepark.interfaces.Reviewed;
import com.bilgeadam.themepark.model.attractions.base.Attraction;
import com.bilgeadam.themepark.model.people.Visitor;
import com.bilgeadam.themepark.model.stalls.base.Stall;

import java.util.ArrayList;
import java.util.List;

public class ThemePark {
    private List<Attraction> attractions;
    private List<Stall> stalls;

    public ThemePark(List<Attraction> attractions, List<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList <Reviewed> getAllReviewed(){
        ArrayList <Reviewed> revieweds = new ArrayList<>();
        revieweds.addAll(attractions);
        revieweds.addAll(stalls);
        return revieweds;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.visitCountInc();
        visitor.addVisited(attraction);
    }
}
