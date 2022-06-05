package com.bilgeadam.themepark.model.attractions;

import com.bilgeadam.themepark.interfaces.Security;
import com.bilgeadam.themepark.model.attractions.base.Attraction;
import com.bilgeadam.themepark.model.people.Visitor;

public class Playground extends Attraction implements Security {

    public Playground(int rating){
        super("Playground",rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}
