package com.bilgeadam.homework.theme.park;

import com.bilgeadam.homework.theme.park.abstraction.Attraction;

import java.util.ArrayList;

public class Visitor {
    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;

    public Visitor(int age, double height, double money, ArrayList<Attraction> visitedAttractions) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = visitedAttractions;
    }

    public void addVisited(Attraction attraction){
            visitedAttractions = new ArrayList<>();
            visitedAttractions.add(attraction);
    }

    public ArrayList<Attraction> getVisitedAttractions() {
        return visitedAttractions;
    }

    public void setVisitedAttractions(ArrayList<Attraction> visitedAttractions) {
        this.visitedAttractions = visitedAttractions;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "age=" + age +
                ", height=" + height +
                ", money=" + money +
                ", visitedAttractions=" + visitedAttractions +
                '}';
    }
}
