package com.bilgeadam.themepark.model.attractions;

import com.bilgeadam.themepark.interfaces.Reviewed;
import com.bilgeadam.themepark.interfaces.Security;
import com.bilgeadam.themepark.interfaces.Ticketed;
import com.bilgeadam.themepark.model.people.Visitor;
import com.bilgeadam.themepark.model.attractions.base.Attraction;

public class RollerCoaster extends Attraction implements Security, Ticketed {

    public RollerCoaster(int rating) {
        super("Roller coaster", rating);
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
        return visitor.getHeight() > 200 ? this.defaultPrice() * 2.0 : this.defaultPrice();
    }
}
