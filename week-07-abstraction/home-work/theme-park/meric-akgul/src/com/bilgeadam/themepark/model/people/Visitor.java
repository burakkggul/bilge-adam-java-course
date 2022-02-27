package com.bilgeadam.themepark.model.people;

import com.bilgeadam.themepark.model.attractions.base.Attraction;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
    private int age;
    private int height;
    private double money;
    private List<Attraction> visitedAttractions = new ArrayList<>();

    public Visitor(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public void addVisited(Attraction attraction){
        this.visitedAttractions.add(attraction);
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
