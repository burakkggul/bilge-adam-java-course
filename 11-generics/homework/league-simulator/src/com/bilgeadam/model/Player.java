package com.bilgeadam.model;

public abstract class Player {

    public Player(String name, String surname, int power){
        this.name = name;
        this.surname = surname;
        this.power = power;
    }

    private String name;
    private String surname;
    private int power;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPower() {
        return power;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
