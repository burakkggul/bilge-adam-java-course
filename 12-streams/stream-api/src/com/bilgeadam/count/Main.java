package com.bilgeadam.count;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(18,25).forEach(System.out::println);
        System.out.println("count: "+IntStream.range(18,25).count());
    }
}
