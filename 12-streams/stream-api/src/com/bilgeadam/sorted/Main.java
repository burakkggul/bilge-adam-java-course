package com.bilgeadam.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Burcu","Burak","Ahmet");
        stringList = stringList.stream().sorted().collect(Collectors.toList());
        for (String s:stringList) {
            System.out.println(s);
        }

        List<Integer> integers = Arrays.asList(9,3,8,6,1,5,10);
        integers = integers.stream().sorted().collect(Collectors.toList());

        integers.stream().forEach(i -> System.out.println(i));
    }
}
