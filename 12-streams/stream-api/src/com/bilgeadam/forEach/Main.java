package com.bilgeadam.forEach;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringToBePrint = new ArrayList<>();
        stringToBePrint.add("aaaaa");
        stringToBePrint.add("Burak");
        stringToBePrint.add("Burak");
        stringToBePrint.add("bbbbbb");

        stringToBePrint.stream().distinct().forEach(System.out::println);
    }
}
