package com.bilgeadam;

import com.bilgeadam.model.base.Attraction;

import java.util.ArrayList;

public class Visitor {
    private int age;
    private int height;
    private double money;
    private ArrayList <Attraction> visitedAttractions;

    public Visitor(int age, int height, double money, ArrayList<Attraction> visitedAttractions) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = visitedAttractions;
    }

    public void addVisited(Attraction attraction){
        visitedAttractions.add(attraction);
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }
}
