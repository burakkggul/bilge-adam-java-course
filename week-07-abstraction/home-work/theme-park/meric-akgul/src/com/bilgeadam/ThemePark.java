package com.bilgeadam;

import com.bilgeadam.interfaces.Reviewed;
import com.bilgeadam.model.base.Attraction;
import com.bilgeadam.model.base.Stall;

import java.util.ArrayList;

public class ThemePark {
    Attraction attraction;
    Stall stall;

    public ArrayList <Reviewed> getAllReviewed(){
        return new ArrayList < Reviewed > () ;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount(attraction.getVisitCount() + 1);
        visitor.addVisited(attraction);
    }
}
