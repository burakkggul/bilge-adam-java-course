package com.bilgeadam.homework.theme.park;

import com.bilgeadam.homework.theme.park.abstraction.Attraction;
import com.bilgeadam.homework.theme.park.abstraction.Stall;
import com.bilgeadam.homework.theme.park.modelsAttraction.Dodgems;
import com.bilgeadam.homework.theme.park.modelsAttraction.Rollercoaster;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAbstactClass {

    private ArrayList<Attraction> visitedAttraction = null;
    private Visitor visitor = new Visitor(23,183,200,visitedAttraction);
    private Dodgems dodgems = new Dodgems(3);
    private Rollercoaster rollercoaster = new Rollercoaster(5);


    public void getInToDodgems(){
        visitor.addVisited(dodgems);
        visitor.setMoney(visitor.getMoney() - dodgems.priceFor(visitor));
        System.out.println(visitor.toString());
    }
    public void getintoRollercoaster(){
        visitor.addVisited(rollercoaster);
        visitor.setMoney(visitor.getMoney() - rollercoaster.priceFor(visitor));
        System.out.println(visitor.toString());
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Dodgems getDodgems() {
        return dodgems;
    }

    public void setDodgems(Dodgems dodgems) {
        this.dodgems = dodgems;
    }
}
