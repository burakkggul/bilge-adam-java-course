package com.bilgeadam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Burak","GÜL", 16);
        Person person2 = new Person("Burak","Duman",13);
        Person person3 = new Person("Meriç","Akgül",22);
        Person person4 = new Person("Burcu","Salman",10);
        Person person5 = new Person("Furkan","Yaman",18);

        List<Person> personList = Arrays
                .asList(person1,person2,person3,person4,person5);

        personList
                .stream()
                .filter(person -> person.getName().contains("a") && person.getAge() > 15)
                .forEach(System.out::println);
    }
}
