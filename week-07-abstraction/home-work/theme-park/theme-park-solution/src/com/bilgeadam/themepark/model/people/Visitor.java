package com.bilgeadam.themepark.model.people;

import com.bilgeadam.themepark.model.attractions.base.Attraction;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
    public Visitor(int age, int height, int money){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    private int age;
    private int height;
    private double money;
    private List<Attraction> visitedAttractions = new ArrayList<>();

    public void addVisited(Attraction attraction){
        this.visitedAttractions.add(attraction);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
