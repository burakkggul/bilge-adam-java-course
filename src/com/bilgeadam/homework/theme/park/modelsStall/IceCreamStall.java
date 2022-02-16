package com.bilgeadam.homework.theme.park.modelsStall;

import com.bilgeadam.homework.theme.park.abstraction.Stall;
import com.bilgeadam.homework.theme.park.interfaces.Reviewed;

public class IceCreamStall extends Stall implements Reviewed {
    public IceCreamStall(String name, String ownerName, int rating, String parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
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
