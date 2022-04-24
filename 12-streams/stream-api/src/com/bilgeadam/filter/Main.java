package com.bilgeadam.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("Burak", "Ahmet", "Duman"));
        System.out.println(name.stream().getClass().getName());

        System.out.println(name.stream().filter(s -> s.startsWith("B")));
        System.out.println(name.stream().filter(s -> s.startsWith("B")).collect(Collectors.toList()).get(0));


        List<Boolean> booleans = new ArrayList<>(Arrays.asList(true, false, true));

        booleans.stream().filter(x -> x).forEach(Main::printString);

        booleans.stream().filter(x -> x).forEach(System.out::println);


        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Burak", "GÜL"),
                new Person("Burak", "Duman")
        ));

        personList
                .stream()
                .filter(person -> person.getName().equals("Burak") && person.getSurname().equals("Duman"))
                .forEach(System.out::println);


        List<Boolean> onlyTrueList = booleans.stream().filter(x -> x).collect(Collectors.toList());
        onlyTrueList.stream().forEach(System.out::println);

    }

    private static void printString(Boolean s) {
        System.out.println(s.equals(false));
        System.out.println(s);
    }
}
