package com.eric.example.java8.chapter04;

public class DefaultMethod2 {
}

interface A2 {
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B2 extends A2 {
}

interface C2 extends A2 {
}

class D2 implements B2, C2 {
    public static void main(String... args) {
        new D2().hello();
    }
}
