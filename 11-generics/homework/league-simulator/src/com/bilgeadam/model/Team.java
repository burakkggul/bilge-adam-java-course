package com.bilgeadam.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Team<E extends Player> implements Comparable<Team<E>>{
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private final List<E> members = new ArrayList<>();

    public void setLost(int lost) {
        this.lost = lost;
    }

    public void setTied(int tied) {
        this.tied = tied;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public int getWon() {
        return won;
    }

    public void addMember(E member){
        this.members.add(member);
    }

    public List<E> getMembers(){
        return this.members;
    }

    public abstract int calculateMatchResult(List<E> opponentTeam);

    public abstract int getPoint();

    public abstract void addPoint(int point);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
