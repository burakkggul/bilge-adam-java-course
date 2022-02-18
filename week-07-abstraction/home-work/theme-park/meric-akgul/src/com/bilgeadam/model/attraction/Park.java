package com.bilgeadam.model.attraction;

import com.bilgeadam.interfaces.Reviewed;
import com.bilgeadam.model.base.Attraction;

public class Park extends Attraction implements Reviewed {

    public Park(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
    }

    @Override
    public void summary() {
        System.out.printf("The summary of Parks:\nName: %s, Rating: %d, Visit Number: %d\n", this.getName(), this.getRating(), this.getVisitCount());
    }
}
