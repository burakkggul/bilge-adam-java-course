package com.bilgeadam.homework.theme.park;

import com.bilgeadam.homework.theme.park.abstraction.Attraction;
import com.bilgeadam.homework.theme.park.abstraction.Stall;
import com.bilgeadam.homework.theme.park.interfaces.Reviewed;
import com.bilgeadam.homework.theme.park.modelsAttraction.Dodgems;
import com.bilgeadam.homework.theme.park.modelsAttraction.Park;
import com.bilgeadam.homework.theme.park.modelsAttraction.Playground;
import com.bilgeadam.homework.theme.park.modelsAttraction.Rollercoaster;
import com.bilgeadam.homework.theme.park.modelsStall.ChickenWrapStall;
import com.bilgeadam.homework.theme.park.modelsStall.FrenchFriesStall;
import com.bilgeadam.homework.theme.park.modelsStall.IceCreamStall;

import java.util.ArrayList;

public class ThemePark {
    Attraction dodgems = new Dodgems(3);
    Attraction park = new Park(4);
    Attraction playground = new Playground(5);
    Attraction rollercoaster = new Rollercoaster(6);
    Stall chickenWrap = new ChickenWrapStall("tavuk wrap","Burcu" , 7 ,"var");
    Stall frenchFries = new FrenchFriesStall("frech fries", "meriç" ,8,"var");
    Stall iceCream = new IceCreamStall("ice cream", "furkan" , 9 ,"yok");

    public ArrayList<Reviewed> getAllReviewed(){
        ArrayList<Reviewed> reviewds = new ArrayList<>();
        reviewds.add((Reviewed) dodgems);
        reviewds.add((Reviewed) park);
        reviewds.add((Reviewed) playground);
        reviewds.add((Reviewed) rollercoaster);
        reviewds.add((Reviewed)chickenWrap);
        reviewds.add((Reviewed) frenchFries);
        reviewds.add((Reviewed) iceCream);
        return reviewds;
    }
    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount(attraction.getVisitCount() + 1);
        visitor.addVisited(attraction);
    }
}
