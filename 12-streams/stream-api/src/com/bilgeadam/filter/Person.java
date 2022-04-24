package com.bilgeadam.filter;

public class Person {
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    private String name;

    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname;
    }
}
