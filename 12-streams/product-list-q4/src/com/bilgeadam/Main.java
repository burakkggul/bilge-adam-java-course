package com.bilgeadam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"HP Laptop",25000f));
        productList.add(new Product(2,"Dell Laptop",30000f));
        productList.add(new Product(3,"Lenovo Laptop",28000f));
        productList.add(new Product(4,"Sony Laptop",28000f));
        productList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> floats = productList
                .stream()
                .filter(product -> product.getPrice() > 28000f)
                .map(Product::getPrice)
                .collect(Collectors.toList());

        floats.forEach(System.out::println);
    }
}
