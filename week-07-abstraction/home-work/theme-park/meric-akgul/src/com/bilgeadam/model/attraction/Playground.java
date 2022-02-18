package com.bilgeadam.model.attraction;

import com.bilgeadam.interfaces.Reviewed;
import com.bilgeadam.interfaces.Security;
import com.bilgeadam.model.base.Attraction;
import com.bilgeadam.Visitor;

public class Playground extends Attraction implements Security, Reviewed {

    public Playground(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
    }

    @Override
    public void summary() {
        System.out.printf("The summary of Playgrounds:\nName: %s, Rating: %d, Visit Number: %d\n", this.getName(), this.getRating(), this.getVisitCount());
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}
