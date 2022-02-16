package com.bilgeadam.homework.theme.park.modelsAttraction;

import com.bilgeadam.homework.theme.park.Visitor;
import com.bilgeadam.homework.theme.park.abstraction.Attraction;
import com.bilgeadam.homework.theme.park.interfaces.Reviewed;
import com.bilgeadam.homework.theme.park.interfaces.Ticketed;

public class Dodgems extends Attraction implements Reviewed, Ticketed {
    public Dodgems(int rating) {
        super("dodgems", rating);
    }

    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double defaultPrice() {
        return 8;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() < 12){
            return defaultPrice()/2;
        }else{
            return defaultPrice();
        }
    }
}
