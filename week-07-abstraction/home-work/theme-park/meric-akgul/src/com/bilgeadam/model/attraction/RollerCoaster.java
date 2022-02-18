package com.bilgeadam.model.attraction;

import com.bilgeadam.interfaces.Reviewed;
import com.bilgeadam.interfaces.Security;
import com.bilgeadam.interfaces.Ticketed;
import com.bilgeadam.model.base.Attraction;
import com.bilgeadam.Visitor;

public class RollerCoaster extends Attraction implements Security, Reviewed, Ticketed {

    public RollerCoaster(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
    }

    @Override
    public void summary() {
        System.out.printf("The summary of RollerCoasters:\nName: %s, Rating: %d, Visit Number: %d\n", this.getName(), this.getRating(), this.getVisitCount());
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 12 && visitor.getHeight() > 145;
    }

    @Override
    public double defaultPrice() {
        return 10.0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return visitor.getHeight() > 200 ? this.defaultPrice() * 2 : this.defaultPrice();
    }
}
