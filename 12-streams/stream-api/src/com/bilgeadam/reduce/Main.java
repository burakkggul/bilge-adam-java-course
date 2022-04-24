package com.bilgeadam.reduce;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,8,11);
        System.out.println(list.stream().reduce(0,(prev, now) ->{
            System.out.println(prev +" " + now);
            return prev+now;
        }));

    }
}
