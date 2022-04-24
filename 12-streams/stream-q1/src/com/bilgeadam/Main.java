package com.bilgeadam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add("Burak");
        list.add(5);
        list.add(10);
        list.add("Burak");
        list.add(12);
        list.add("Burak");
        list.add(3);
        list.add("Burak");
        list.add(1);

        List<Object> integers = list
                .stream() // Stream'e çevirdim.
                .filter(e -> e instanceof Integer) // Filtreledim.
                .sorted() // Sıraladım.
                .collect(Collectors.toList()); // Stream'i listeye çevirdim.

        integers.stream().forEach(s -> System.out.println(s));
    }

}
