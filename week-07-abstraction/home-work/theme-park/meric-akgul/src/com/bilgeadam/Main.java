package com.bilgeadam;

import com.bilgeadam.model.attraction.Dodgems;
import com.bilgeadam.model.attraction.Park;
import com.bilgeadam.model.attraction.Playground;
import com.bilgeadam.model.attraction.RollerCoaster;

public class Main {

    public static void main(String[] args) {
        new Dodgems("carpisan oto", 5, 2).summary();
        new Park("park", 9, 1).summary();
        new Playground("playground", 7, 3).summary();
        new RollerCoaster("roller coaster", 6, 6).summary();
    }
}
