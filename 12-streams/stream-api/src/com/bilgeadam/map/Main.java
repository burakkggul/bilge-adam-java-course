package com.bilgeadam.map;

import com.bilgeadam.map.model.Animal;
import com.bilgeadam.map.model.Lion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Cat"));
        animals.add(new Animal("Cat"));

        animals
                .stream()
                .filter(animal -> animal.getName().equals("Lion"))
                .map(animal -> new Lion(animal.getName()))
                .forEach(lion -> System.out.println(lion.getName()));

        List<Lion> lions = animals
                .stream()
                .filter(animal -> animal.getName().equals("Lion"))
                .map(animal -> new Lion(animal.getName()))
                .collect(Collectors.toList());

        List<Object> list = new ArrayList<>();
        list.add("Burak");
        list.add(5);
        list.add(10);
        list.add(2);
        list.add("Burak");
        list.add(4);
        list.add(3);

        List<Integer> integers = list
                .stream()
                .filter(i -> i instanceof Integer)
                .sorted()
                .map(i -> (Integer) i)
                .collect(Collectors.toList());

        integers.forEach(i -> System.out.println(i));
    }
}
