package com.bilgeadam.model.attraction;

import com.bilgeadam.interfaces.Reviewed;
import com.bilgeadam.interfaces.Ticketed;
import com.bilgeadam.model.base.Attraction;
import com.bilgeadam.Visitor;

public class Dodgems extends Attraction implements Reviewed, Ticketed {

    public Dodgems(String name, int rating, int visitCount) {
        super(name, rating, visitCount);
    }

    @Override
    public void summary() {
        System.out.printf("The summary of Dodgems:\nName: %s, Rating: %d, Visit Number: %d\n", this.getName(), this.getRating(), this.getVisitCount());
    }

    @Override
    public double defaultPrice() {
        return 8.0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return visitor.getAge() < 12 ? this.defaultPrice() / 2 : this.defaultPrice();
    }
}
