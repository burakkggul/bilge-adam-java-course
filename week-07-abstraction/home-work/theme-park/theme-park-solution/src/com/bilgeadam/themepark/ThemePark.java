package com.bilgeadam.themepark;

import com.bilgeadam.themepark.interfaces.Reviewed;
import com.bilgeadam.themepark.interfaces.Ticketed;
import com.bilgeadam.themepark.model.attractions.base.Attraction;
import com.bilgeadam.themepark.model.people.Visitor;
import com.bilgeadam.themepark.model.stalls.base.Stall;

import java.util.ArrayList;
import java.util.List;

public class ThemePark {

    public ThemePark(List<Attraction> attractions, List<Stall> stalls){
        this.attractions = attractions;
        this.stalls = stalls;
    }

    private List<Attraction> attractions;
    private List<Stall> stalls;

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public List<Reviewed> getAllReviewed(){
        List<Reviewed> revieweds = new ArrayList<>();
        revieweds.addAll(this.attractions);
        revieweds.addAll(this.stalls);
        return revieweds;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.visitCountInc();
        visitor.addVisited(attraction);
    }

    public double visitPricedAttraction(Visitor visitor, Ticketed ticketed){
        double attractionPrice = ticketed.getPrice(visitor);
        double visitorsMoney = visitor.getMoney();
        if(visitorsMoney > attractionPrice){
            visitor.setMoney(visitorsMoney - attractionPrice);
        }
        return visitor.getMoney();
    }

    public int getAllReviewedVisitCount(){
        List<Reviewed> revieweds = this.getAllReviewed();
        int count = 0;
        for (int i = 0; i < revieweds.size(); i++){
            count = count + revieweds.get(i).getVisitCount();
        }
        return count;
    }

}
