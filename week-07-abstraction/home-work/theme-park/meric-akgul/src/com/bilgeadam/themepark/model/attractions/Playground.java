package com.bilgeadam.themepark.model.attractions;

import com.bilgeadam.themepark.interfaces.Reviewed;
import com.bilgeadam.themepark.interfaces.Security;
import com.bilgeadam.themepark.model.people.Visitor;
import com.bilgeadam.themepark.model.attractions.base.Attraction;

public class Playground extends Attraction implements Security {

    public Playground(int rating) {
        super("Playground", rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}
