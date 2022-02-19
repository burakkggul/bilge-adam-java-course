package com.bilgeadam.themepark.model.attractions;

import com.bilgeadam.themepark.interfaces.Ticketed;
import com.bilgeadam.themepark.model.attractions.base.Attraction;
import com.bilgeadam.themepark.model.people.Visitor;

public class Dodgems extends Attraction implements Ticketed {

    public Dodgems(String name, int rating){
        super(name,rating);
    }

    @Override
    public double defaultPrice() {
        return 8.0;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getAge() >= 12){
            return this.defaultPrice();
        }else {
            return this.defaultPrice() / 2.0;
        }
    }

    @Override
    public double getPrice(Visitor visitor) {
        return this.priceFor(visitor);
    }
}
