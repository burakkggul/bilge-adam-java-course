package com.bilgeadam.model.stall;

import com.bilgeadam.interfaces.Reviewed;
import com.bilgeadam.model.base.Stall;

public class ChickenWrapStall extends Stall implements Reviewed {

    public ChickenWrapStall(String name, String ownerName, int rating, int parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }
}
