package com.bilgeadam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Burak","GÜL");
        Person person2 = new Person("Burak","Duman");
        Person person3 = new Person("Meriç","Akgül");
        Person person4 = new Person("Burcu","Salman");
        Person person5 = new Person("Furkan","Yaman");

        List<Person> personList = Arrays
                .asList(person1,person2,person3,person4,person5);

        List<String> stringPersonList = personList
                .stream()
                .map(person -> person.getName()+" "+person.getSurname())
                .collect(Collectors.toList());

        stringPersonList.forEach(System.out::println);
    }
}
