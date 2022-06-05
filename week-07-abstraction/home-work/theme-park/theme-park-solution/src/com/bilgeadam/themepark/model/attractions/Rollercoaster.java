package com.bilgeadam.themepark.model.attractions;

import com.bilgeadam.themepark.interfaces.Security;
import com.bilgeadam.themepark.interfaces.Ticketed;
import com.bilgeadam.themepark.model.attractions.base.Attraction;
import com.bilgeadam.themepark.model.people.Visitor;

public class Rollercoaster extends Attraction implements Security, Ticketed {

    public Rollercoaster(int rating){
        super("Rollercoaster",rating);
    }
    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getHeight() > 145) && (visitor.getAge() > 12);
    }

    @Override
    public double defaultPrice() {
        return 10.0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return visitor.getHeight() > 200 ? this.defaultPrice() * 2.0 : this.defaultPrice();
    }

    @Override
    public double getPrice(Visitor visitor) {
        return this.priceFor(visitor);
    }
}
