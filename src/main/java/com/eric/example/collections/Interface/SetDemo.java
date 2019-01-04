package com.eric.example.collections.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetDemo {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("张三", 11), new Person("李四", 9), new Person("王二麻子", 14));


        List<String> collect = people.stream()
                .map(Person::getName).collect(Collectors.toList());

        System.out.println(collect);

        TreeSet<Integer> collect1 = people.stream()
                .map(Person::getAge)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect1);


    }


}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
