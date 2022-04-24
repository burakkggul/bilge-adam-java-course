package com.bilgeadam.distinct;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("Burak");
        list.add("Burak");
        list.add("Burak");
        list.add("Burak");
        list.add("Java");
        list.add("SQL");
        list.add("Hibernate");

        list.stream().distinct().forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        list.stream().forEach(System.out::println);
    }
}
