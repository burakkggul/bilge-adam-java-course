package com.bilgeadam.homework.theme.park.modelsAttraction;

import com.bilgeadam.homework.theme.park.Visitor;
import com.bilgeadam.homework.theme.park.abstraction.Attraction;
import com.bilgeadam.homework.theme.park.interfaces.Reviewed;
import com.bilgeadam.homework.theme.park.interfaces.Security;

public class Playground extends Attraction implements Security, Reviewed {
    public Playground(int rating) {
        super("playground", rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() <= 15){
            return true;
        }else{
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
}
