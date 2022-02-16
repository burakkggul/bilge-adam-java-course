package com.bilgeadam.homework.theme.park.modelsAttraction;

import com.bilgeadam.homework.theme.park.abstraction.Attraction;
import com.bilgeadam.homework.theme.park.interfaces.Reviewed;

public class Park extends Attraction implements Reviewed {
    public Park(int rating) {
        super("park", rating);
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
