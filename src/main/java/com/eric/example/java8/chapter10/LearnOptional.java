package com.eric.example.java8.chapter10;

import java.util.Optional;

public class LearnOptional {
    public static void main(String[] args) {
        Person p = new Person();
        Optional<Integer> age = p.getAge();
        age.ifPresent(LearnOptional::getRealAge);
    }

    public static void getRealAge(Integer age){
        int r = age+1;
        System.out.println(r);
    }

}


class Person {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
