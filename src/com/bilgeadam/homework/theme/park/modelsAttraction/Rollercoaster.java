package com.bilgeadam.homework.theme.park.modelsAttraction;

import com.bilgeadam.homework.theme.park.Visitor;
import com.bilgeadam.homework.theme.park.abstraction.Attraction;
import com.bilgeadam.homework.theme.park.interfaces.Reviewed;
import com.bilgeadam.homework.theme.park.interfaces.Security;
import com.bilgeadam.homework.theme.park.interfaces.Ticketed;

public class Rollercoaster extends Attraction implements Security, Reviewed, Ticketed {
    public Rollercoaster(int rating) {
        super("rollercoaster", rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145) {
            return true;
        } else {
            return false;
        }
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
        return 10;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }
}
